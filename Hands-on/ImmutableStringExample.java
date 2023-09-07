package LabQuestions;

import java.util.Scanner;

public class ImmutableStringExample 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		//Read user input as a string
		String originalString = Sc.nextLine();
		
		// Display " is immutable" to the original string using the concat()method
		String newString = originalString.concat(" is immutable");
		
		//Print the original string and the new string
		System.out.println("Original String:" + newString);
		
		//Show that the original string remains unchanged
		System.out.println("Original String after Concatenation:" + originalString);
		
		//close the scanner
		Sc.close();

	}

}
