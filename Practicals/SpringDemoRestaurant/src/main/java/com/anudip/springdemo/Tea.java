package com.anudip.springdemo;

public class Tea implements HotDrink
{
   
	@Override
	public void prepareHotDrink() 
	{
		System.out.println("Dear Customer we are preaparing a tea for you!!!");	
		
	}
}
