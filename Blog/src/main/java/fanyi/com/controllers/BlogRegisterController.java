package fanyi.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fanyi.com.services.BlogService;
import jakarta.servlet.http.HttpSession;

@Controller
public class BlogRegisterController {
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("blog_register")
public String getBlogRegister() {
		return"blog_register.html";
	}
}
	
//	@PostMapping("/blog_register")
//	public String register(@RequestParam String Title,@RequestParam String date,
//			@RequestParam String summary,@RequestParam String Category,@RequestParam String article)
//	if(blogService.createBlog(title,C))
//}
