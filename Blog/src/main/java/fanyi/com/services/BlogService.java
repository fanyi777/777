package fanyi.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fanyi.com.repositories.BlogRepository;

@Service
public class BlogService {

	@Autowired
	BlogRepository blogRepo;

	public boolean createBlog(String Title,String date,String summary,String Category,String article) {
	 if(blogRepo.findByTitleAndCategory(Category,Title)) {
		 blogRepo.save(new Blogs());
		 return true;
     } else {
	return false;
}         
	 }

	public boolean newBlog(String title, String date, String summary, String Category, String article) {

	}
}
