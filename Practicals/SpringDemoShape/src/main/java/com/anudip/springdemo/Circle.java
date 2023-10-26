package com.anudip.springdemo;

public class Circle implements Shape{

	private String color="Green";
	
	public Circle() 
	{
		super();
	}
	
	public Circle(String Color) //constructor
	{
		super();
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing +" +color +"+circle");
		
	}

}
