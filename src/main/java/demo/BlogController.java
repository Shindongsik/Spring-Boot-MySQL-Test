package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	@Autowired
	private BlogDao blogDao;
	
	@RequestMapping(value="/")
	public String index(){
		blogDao.insertNewContent("Hello MySQL!!!");
		
		String content = blogDao.selectOne(1);
		
		return "Insert Success!! " + content;
	}
	
	@RequestMapping(value="/select/{var}")
	public String selectOne(@PathVariable int var){
		String content = blogDao.selectOne(var);
		
		return "Select Success!! " + content;
	}
}
