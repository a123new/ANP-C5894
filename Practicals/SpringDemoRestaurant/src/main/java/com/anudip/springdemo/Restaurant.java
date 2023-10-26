package com.anudip.springdemo;

public class Restaurant {

	HotDrink hotDrink;
	String WelcomeNote;
	
	public Restaurant(HotDrink hotDrinks) 
	{
		super();
		this.hotDrink=hotDrink;
	}

	public String getWelcomeNote() {
		return WelcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		WelcomeNote = welcomeNote;
	}
	
	
	public void prepareDrink() 
	{
		hotDrink.prepareHotDrink();
	}
	public void greetmessage()
	{
		System.out.println("welcomeNote");
	}
}
