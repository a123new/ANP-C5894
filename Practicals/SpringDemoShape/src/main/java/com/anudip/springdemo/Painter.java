package com.anudip.springdemo;

public class Painter implements Performer
{
    //Painter should draw a circle or rectangle
	
    Shape shape;
     
	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public void Perform()
	{
		System.out.println("Painter is");
		shape.draw();
		
	}

}
