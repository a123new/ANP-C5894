package oops;

//Example of Multilevel inheritance
//super class or base class or parent class
class Animals
{
//fields & methods
	String name;
	public void eat()
	{
		System.out.println("Animal Eat....");
	}
}
//inherit from Animals
class Dogs extends Animals
{
	//fields & methods of Animals class
	//fields & methods of Dog class
	public void sound()
	{
		System.out.println("Dogs Barks....");
	}
}
class Puppies extends Dogs
{
	//fields & methods of Animals class
	//fields & methods of Dog class
	//fields & methods of Puppy class
		public void colour()
		{
			System.out.println("Black & white....");
		}
}
class AnimalsMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Puppies d=new Puppies();
		
		//access fields and methods
		d.name="Moti";
		d.eat();
		d.sound();
		d.colour();
	}

}