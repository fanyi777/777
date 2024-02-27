package fanyi.com.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fanyi.com.services.BlogService;
import fanyi.com.services.UserService;

@Controller
public class BlogController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BlogService blogService;
	
	
	@GetMapping("/blog")
	
	/*public String getBlogEdit() {
		return"blog_edit.html";
	}*/
	public String getBlogAllPage() {
		return"blog.html";
	}

}
