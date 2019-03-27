package com.niit.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Triangle.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}
}