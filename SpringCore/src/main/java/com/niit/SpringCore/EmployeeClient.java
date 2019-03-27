package com.niit.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class EmployeeClient {

	public static void main(String[] args) {
		Employee eRef = new Employee();
		eRef.setEid(100);
		eRef.setEname("Gaurav");
//		eRef.setEaddress("New_York");
		System.out.println("Employee Details :" + eRef);

		// Spring way | IOC (Inversion of Control)
		// We are not creating the objects, instead IOC container will create
		// We are just configuring the object

//1 way (best for single class)
		Resource res = new ClassPathResource("EmployeeBean.xml");
		BeanFactory factory = new XmlBeanFactory(res); // API Spring Container will parse XML file and create objects

// 2 way(best for Applications)

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("EmployeeBean.xml");
		 */

// two ways of getBean methods

		Employee e1 = (Employee) factory.getBean("emp1"); // 1
		// Employee e2 = factory.getBean("emp2", Employee.class ); //2

		/*
		 * Employee e1 = (Employee) context.getBean("emp1"); Employee e2 =
		 * context.getBean("emp2");
		 */

		System.out.println("Employee Details :" + e1);
		// System.out.println("Employee Details :" + e2);

	}
}
