package com.anudip.springdemo;

public class Coffee implements HotDrink
{

	@Override
	public void prepareHotDrink()
	{
		System.out.println("Dear Customer, we are preparing a tea for you!!!");
		
	}

}
