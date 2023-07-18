package loops;


import java.util.Scanner;

/*
  Java program that asks the user to enter a series of numbers (positive or negative) and 
  calculates their sum. The program should stop asking for the input when the user enters 0.
  To use do while loop to continuously ask for numbers and keep adding them to the sum
  */

public class SeriesOfNumbers
{
	
	public static void main(String[]args) 
	{
		
		//Scanner class object
	Scanner input=new Scanner(System.in);
	
		//Declaring and initializing i to 1
		int number;
		int sum = 0;
		
		//do loop
		do
		{
			//print Positive negative number
			System.out.println("Enter a number( enter 0 to stop):");
			number = input.nextInt();
			sum+= number;
			
		}
		//Test expression
		while(number != 0);
 
		System.out.println("The sum of the numbers is: +sum");
	}
}

