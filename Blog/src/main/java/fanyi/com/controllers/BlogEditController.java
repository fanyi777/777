package fanyi.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fanyi.com.services.BlogService;

@Controller
public class BlogEditController {
	@Autowired
	private BlogService blogService;
	
	//@GEtMapping("/blog_edit")

}
