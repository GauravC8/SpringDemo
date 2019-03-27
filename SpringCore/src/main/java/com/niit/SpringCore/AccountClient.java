package com.niit.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Account.xml");
		UserAccountService uas = (UserAccountService) context.getBean("userAccountService");
		System.out.println(uas.getName());
		System.out.println(uas.getDetails());
		System.out.println(uas.getDiscriptions());
	}
}
