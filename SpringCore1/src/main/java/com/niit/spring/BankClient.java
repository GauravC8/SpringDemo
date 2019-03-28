package com.niit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.service.BankService;

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bank.xml");
		BankService bank = (BankService) context.getBean(BankService.class);
		bank.deposit("testing");
	}
}
