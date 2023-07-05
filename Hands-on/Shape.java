package oops;

//Example of Single level inheritance
//super class or base class or parent class
class Shape
{
//fields & methods
	
	public void calculateArea()
	{
		System.out.println("Calculating area of shape");
	}
}
//inherit from Shape
class Rectangle extends Shape
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	public void calculateArea()
	{
		System.out.println("Area of Rectangle.");
	}
}
class ShapeMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Rectangle d=new Rectangle();
		
		//access fields and methods
		d.calculateArea();
		
	
	}

}