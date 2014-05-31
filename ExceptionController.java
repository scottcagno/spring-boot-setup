package $PACKAGE.controller;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
	public static final String DEFAULT_ERROR_VIEW = "exception";
	@ExceptionHandler(value={Exception.class, RuntimeException.class})
	public ModelAndView errorHandler(HttpServletRequest r, Exception e) {
		ModelAndView view = new ModelAndView(DEFAULT_ERROR_VIEW);
		view.addObject("timestamp", new Date());
		view.addObject("request", r.getRequestURI());
		StringBuilder sb = new StringBuilder();
		for(StackTraceElement frame : e.getStackTrace())
			sb.append(frame.toString() + "\n");
		view.addObject("exception", sb.toString());
		return view;
	}
}
