package ma.nour.phar.restclient;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/***
 * 
 * @author noureddine
 *
 */
@Controller
@RequestMapping("/client")
public class CltPhaGardeController {

	@RequestMapping("/pharmaciesgarde")
	public String listPharmacies(Model model) {

		RestTemplate restTemplate = new RestTemplate();

		String url = "http://localhost:8282/api/pharmaciesgarde";
		@SuppressWarnings("rawtypes")
		List pharmacies = restTemplate.getForObject(url, List.class);
		model.addAttribute("pharesgarde", pharmacies);

		return "pharsgarde";

	}

	
}
