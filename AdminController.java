package $PACKAGE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import $PACKAGE.domain.User;
import $PACKAGE.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/admin/user/{id}", method=RequestMethod.GET)
	public String viewUserHandler(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("user", userService.findById(id));
		return "admin/view-user";
	}
	
	@RequestMapping(value="/admin/user/{id}", method=RequestMethod.POST)
	public String updateUserHandler(
			@PathVariable(value="id") Long id, 
				@RequestParam(value="name", required=true) String name,
					@RequestParam(value="email", required=true) String email,
						@RequestParam(value="username", required=true) String username,
							@RequestParam(value="password", required=true) String password,
								@RequestParam(value="role", required=true) String role) {
		
		if(userService.exists(username)) {
			User user = userService.findById(id);
			user.setName(name);
			user.setEmail(email);
			user.setUsername(username);
			user.setPassword(password);
			user.setRole(role);
			userService.insert(user);
			return "redirect:/admin/user/" + id + "?ok";
		}
		return "redirect:/admin/user/" + id + "?error";
	}
	
	@RequestMapping(value="/admin/user/add", method=RequestMethod.GET)
	public String addUserGetHandler() {
		return "admin/add-user";
	}
	
	@RequestMapping(value="/admin/user/add", method=RequestMethod.POST)
	public String addUserPostHandler(
			@RequestParam(value="name", required=true) String name,
				@RequestParam(value="email", required=true) String email,
					@RequestParam(value="username", required=true) String username,
						@RequestParam(value="password", required=true) String password,
							@RequestParam(value="role", required=true) String role) {
		if (!userService.exists(username)) {
			userService.insert(new User(name, email, username, password, role));
			return "redirect:/admin/home?ok";
		}
		return "redirect:/admin/user/add?error";
	}
}
