package demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void insertNewContent(String content){
		jdbcTemplate.update("INSERT INTO blogs(content) VALUES(?)", content);
	}
	
	public String selectOne(int id){
		Map result = jdbcTemplate.queryForMap("SELECT content FROM blogs WHERE id = ?", id);
		
		return (String)result.get("content");
	}
}
