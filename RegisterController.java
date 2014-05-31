package $PACKAGE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import $PACKAGE.domain.User;
import $PACKAGE.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String userGetHandler(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String registerPostHandler(
			@RequestParam(value="name", required=true) String name,
				@RequestParam(value="email", required=true) String email,
					@RequestParam(value="username", required=true) String username,
						@RequestParam(value="password", required=true) String password,
							@RequestParam(value="confirm", required=true) String confirm) {
		if (password.equals(confirm) && !userService.exists(username)) {
			userService.insert(new User(name, email, username, password, "ROLE_USER"));
			return "redirect:/home?thanks";
		}
		return "redirect:/register?error";
	}
}
