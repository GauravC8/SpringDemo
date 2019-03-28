package com.niit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.service.UserService;

public class UserAopClient {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("User.xml");
		UserService userService = (UserService) context.getBean(UserService.class);
		userService.multiply();
		userService.divide(5, 2);
	}
}
