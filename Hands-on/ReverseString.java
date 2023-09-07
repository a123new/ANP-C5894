package LabQuestions;

//Lab1: How to reverse string in java

import java.util.Scanner;

public class ReverseString
{
public static void main(String[] args) 
	{
	 //create scanner class
      Scanner Sc = new Scanner(System.in);
      
      //to prompt the user to enter a string
      System.out.println("Enter a String :" );
      String input = Sc.nextLine();
     
      String reversed = ReverseString1(input);
      
      System.out.println("Reversed String:" + reversed);
      
      //close the scanner class
      Sc.close();
     
}

//create reverse string instance
public static String ReverseString1(String str) 
{
	StringBuffer reversed = new StringBuffer(str).reverse();
	
	return reversed.toString();

}
}

