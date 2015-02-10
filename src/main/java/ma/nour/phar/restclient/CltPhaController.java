package ma.nour.phar.restclient;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author noureddine
 *
 */
@Controller
@RequestMapping("/client")
public class CltPhaController {

	@RequestMapping(value="/pharmacies")
	public String listPharmacies(Model model) {
		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:8282/api/pharmacies";
		@SuppressWarnings("rawtypes")
		List allPhars = restTemplate.getForObject(url, List.class);
		
		model.addAttribute("phares", allPhars);

		return "phars";

	}
	
	

}
