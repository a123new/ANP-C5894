package Operator;
    /*
      Write a Java program that prompts the user to enter their age. 
      The program should check if the age is between 18 and 30 (inclusive) 
      and print "Eligible for Job" if true, or "Not Eligible for Job" otherwise.
   */


import java.util.Scanner;

public class CheckEligibility 
{

	public static void main(String[] args) 
	{
		//input from the user
		Scanner sc=new Scanner(System.in);
		
		
		//input from the first operator
		System.out.println("Enter a Age:");
		int age = sc.nextInt();
		
		// to check if the age is between 18 and 30
		System.out.println("Is the age above 18?");
		boolean above = age < 18; 
		
		// to check if the age is below than 30
		System.out.println("Is the age below than 30? ");
		boolean below = age > 30;
		
		//if the age is between 18 and 30 then
		
		//print statement
		System.out.println("The Age above 18:" + above);
		System.out.println("The Age below 30:" + below);
		
		//
		
		//And operator
		boolean number  = above && below;
		
		//print value
		System.out.println("Eligible for job" + above);
		System.out.println("Not Eligible for job" + below);
		
		sc.close();
		

	}

}
