package $PACKAGE.controller;

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
