package com.niit.SpringCore;

//used in constructor injection
public class Triangle {
	private String type;
	private int height;

	public Triangle(String type, int height) {

		this.type = type;
		this.height = height;
	}

	public void draw()
	{
		System.out.println(this.type + " triangle is drawn of height " + this.height);
	}
}