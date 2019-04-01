package com.niit.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.myproject.dao.UsereDao;
import com.niit.myproject.model.User;

@Controller
public class SpringBootJdbcController {

	@Autowired
	JdbcTemplate jdbc;

	@Autowired(required=true)
	UsereDao dao;

	@RequestMapping("/insert")
	public String inputdata() {
		jdbc.execute("insert into user(name,email) values('Gaurav','rangilaraja@gmail.com')");
		return "Data Inserted Successfully";
	}

	@RequestMapping("/update")
	public String updatedata() {
		jdbc.execute("update user set email='gauravchauhan@gmail.com' where id=1");
		return "Data updated Successfully";
	}

	@RequestMapping("/delete")
	public String deletedata() {
		jdbc.execute("delete from user where id=1");
		return "Data deleted Successfully";
	}

	@RequestMapping("/viewuser")
	public Model viewUsers(Model m) {
		List<User> list = dao.getUsers();
		m.addAttribute("list", list);
		return m;
	}
}