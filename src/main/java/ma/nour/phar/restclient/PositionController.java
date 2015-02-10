package ma.nour.phar.restclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


import ma.nour.phar.entity.Pharmacy;
import ma.nour.phar.utils.PharmacyForm;
import ma.nour.phar.utils.Response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/client/find")
public class PositionController {

	private static final String GEOAPI_URL = "https://maps.googleapis.com/maps/api/geocode/json?sensor=false";
	private static final String KEY = "AIzaSyDfy9TstPsg4vus7q2aXitb5kHzlPJZ8oo";

	Pharmacy pharmacy;
	int idprime;

	@RequestMapping("/{id}")
	public String showLocate(@PathVariable int id, Model model,
			@ModelAttribute("pharmacyForm") PharmacyForm ph) {
		String adress = findOne(id).getAdress();
		adress = findOne(id).getName() + " " + adress + ", agadir,MA";
		adress = adress.replace(' ', '+');
		ObjectMapper mapper = new ObjectMapper();
		model.addAttribute("id", findOne(id).getName());
		model.addAttribute("adress", findOne(id).getAdress());

		URL url;
		try {
			url = new URL(new StringBuffer(GEOAPI_URL).append("&address=")
					.append(URLEncoder.encode(adress, "UTF-8")).append("&key=")
					.append(KEY).toString());
			
			Response response = mapper.readValue(url.openStream(),
					Response.class);
			if (response == null) {
				return "error";
			}

			ph.setLongitude(response.getResults()[0].getGeometry()
					.getLocation().getLongitude());
			ph.setLatitude(response.getResults()[0].getGeometry().getLocation()
					.getLatitude());
			ph.setLocation(response.getResults()[0].getGeometry().getLocation()
					.toString());
			ph.setLocation_type(response.getResults()[0].getGeometry()
					.getLocationType().toString());
			ph.setFormatted_address(response.getResults()[0]
					.getFormattedAddress());
			ph.setGeocomplete(findOne(id).getName()
					+ " Agadir, Souss-Massa-Draa, Morocco");

			return "locate";

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}

	private Pharmacy findOne(int id) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8282/api/pharmacies/" + id;
		return restTemplate.getForObject(url, Pharmacy.class);

	}
	
}
