package com.niit.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredAnnotaion {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Country.xml");
		Country cobj = (Country) context.getBean("countryBean");

		String cName = cobj.getCountryName();
		Capital cpObj = cobj.getCapital();
		String cpName = cpObj.getCapitalName();
		System.out.println(cpName + " is the capital of " + cName);
	}
}

//Country.java
// Capital.java
