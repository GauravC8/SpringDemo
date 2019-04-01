package com.niit.myproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.niit.myproject.model.User;

public class UsereDao {	
	
	JdbcTemplate template;
	
	/*public List<User> getUsers(){    
	    return template.query("select * from user",new RowMapper<User>(){    
	        public User mapRow(ResultSet rs, int row) throws SQLException {    
	        	User u=new User();    
	            u.setId(rs.getInt(1));    
	            u.setName(rs.getString(2));    
	            u.setEmail(rs.getString(3));   
	            return u;    
	        }    
	    });   
	}*/
	
	public List<User> getUsers(){
		List<User> list = template.query("SELECT * FROM user", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User u=new User();    
	            u.setId(rs.getInt(1));    
	            u.setName(rs.getString(2));    
	            u.setEmail(rs.getString(3));
				return u;
			}
		});
		return list;
	}
}
