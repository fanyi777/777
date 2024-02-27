package fanyi.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fanyi.com.models.Users;
import fanyi.com.services.UserService;

@Controller
public class LoginController {

@Autowired
private UserService userService;


    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }
    

    @PostMapping("/login")
    public String loginProcess(String username, String password) {
        Users user = userService.checkLogin(username,password);
        if (user != null && user.getPassword().equals(password)) {
          return"redirect:/blog";
           
        } else {
        	return"redirect:/login";
           
        }
    }
}

