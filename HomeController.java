package $PACKAGE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value={"/", "/home"}, method=RequestMethod.GET)
	public String homeHandler() {
		return "home";
	}
	
	@RequestMapping(value="/login")
	public String loginHandler() {
		return "login";
	}
	
	@RequestMapping(value={"/user", "/user/home"}, method=RequestMethod.GET)
	public String userHomeHandler() {
		return "user/home";
	}
	
	@RequestMapping(value={"/admin", "/admin/home"}, method=RequestMethod.GET)
	public String adminHomeHandler(Model model) {
		model.addAttribute("users", userService.findAll());
		return "admin/home";
	}
}
