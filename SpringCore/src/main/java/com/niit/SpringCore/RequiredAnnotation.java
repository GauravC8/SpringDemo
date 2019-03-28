package com.niit.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentBean.xml");
		Student stud = (Student)context.getBean("student");
		System.out.println("Name : " + stud.getName());
		System.out.println("Age : " + stud.getAge());
	}
}