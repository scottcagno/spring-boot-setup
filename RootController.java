package $PACKAGE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
	
	@RequestMapping("/login")
	public String loginHandler() {
		return "login";
	}
	
	@RequestMapping({"/","/home"})
	public String homeHandler() {
		return "home";
	}
	
	@RequestMapping("/user/home")
	public String userHomeHandler() {
		return "user/home";
	}
	
	@RequestMapping("/admin/home")
	public String adminHomeHandler() {
		return "admin/home";
	}
}
