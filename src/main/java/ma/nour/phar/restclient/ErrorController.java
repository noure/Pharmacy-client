package ma.nour.phar.restclient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/error")
public class ErrorController {

	public ModelAndView resException(HttpServletRequest req,
			HttpServletResponse resp, Object handler, Exception exp) {

		ModelAndView mov = new ModelAndView();
		mov.addObject("exception", exp);
		mov.addObject("requestUrl", req.getRequestURL().toString());
		mov.setViewName("error");
		return mov;

	}
}
