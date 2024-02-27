package fanyi.com.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fanyi.com.models.Blogs;

public interface BlogRepository extends JpaRepository<Blogs, Long> {
	Blogs save(Blogs blogs);
	

Blogs findByTitleAndCategory(String Category,String Title);
	List<Blogs>findAll();
}
