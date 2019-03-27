package com.niit.SpringCore;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Student {

	private int age;
	private String name;

	@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
