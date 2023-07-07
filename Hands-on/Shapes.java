package oops;

abstract class Shapes
{
	//abstract method to calculateArea
	public abstract void calculateArea();
	
	//abstract method to calculatePerimeter
	public abstract void calculatePerimeter();
}

//subclass inherits from shapes
class Rectangle1 extends Shapes
{
	public void calculateArea() 
	{
		System.out.println("Area of rectangle is: 1*b");
		
	}
	public void calculatePerimeter() 
	{
		System.out.println("Perimeter of rectangle: 2(Length + Width)");
	}
	
}
	 //subclass inherits from class Shapes
class Circle extends Shapes
{
	public void calculateArea() 
	{
		System.out.println("Area of circle is : πr² ");
	}
	public void calculatePerimeter() 
	{
		System.out.println("Perimeter of circle: 2πr");
	}
}
//subclass inherits from shapes
class Triangle extends Shapes
{
	public void calculateArea() 
	{
		System.out.println("Rea of Triangle is : A = 1/2 (b*h");
		
	}
	public void  calculatePerimeter() 
	{
		System.out.println("Perimeter of Traingle is: P= A + B + C");
	
	}
}
	class ShapesMain
	{
		public static void main (String[] args) 
		{
			//creating instance of subclass Rectangle
			Rectangle1 r=new Rectangle1();
			r.calculateArea();
			r.calculatePerimeter();
			
			//creating instance of subclass Circle
			Circle c=new Circle ();
			c.calculateArea();
			c.calculatePerimeter();
			
			//creating instance of Triangle
			Triangle t=new Triangle();
			t.calculateArea();
			t.calculatePerimeter();
			
	}
	
	}