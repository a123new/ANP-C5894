package LabQuestions;

//Lab2: How to check Palindrome String in java?

import java.util.Scanner;
public class PalindromeCheck
{

	public static void main(String[] args) 
	{
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter a String: " );
		
	    //GEt user input
		String input = Sc.nextLine();
		
		if(isPalindrome(input))
		{
			System.out.println("The string is a Palindrome.");
		}
		else 
		{
			System.out.println("The string is not a Palindrome.");
		}
	}
	
	public static boolean isPalindrome(String str) 
	{
		//convert the string to lower case for case comparison
	     str = str.toLowerCase();
	     int left = 0;
	     int right = str.length() - 1;
	     
	     while(left < right)
	     {
	    	 //Compare character from both ends
	    	 if(str.charAt(left) !=str.charAt(right)) 
	    	 {
	    		 //If characters don't match, its's not a palindrome
	    		 return false;
	    	 }
	    	 //Move the left pointer towards the center
	    	 left++;
	    	 //move the right pointers towards the center
	    	 right--;
	     }
	     
	     //All characters matched so it's Palindrome
		return true;
	}
}
