package fanyi.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fanyi.com.services.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String getRegister() {
		return"register.html";
	}
	
	@PostMapping("/register")
	public String register(@RequestParam String username,@RequestParam String email,
			@RequestParam String password,@RequestParam String repeatpassword) {
		if (userService.createUser(username,email,password)) {
			return "redirect:/login";
		}else {
			return"redirect:/register";
		}
				
			}
	
}
