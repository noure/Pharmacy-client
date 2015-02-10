package ma.nour.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobaleHandlerException implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest req,
			HttpServletResponse resp, Object handler, Exception exp) {
		
		ModelAndView mov=new ModelAndView();
		mov.addObject("exception", exp);
		mov.addObject("requestUrl", req.getRequestURL().toString());
		mov.setViewName("error");
		return mov;		
	}

}
