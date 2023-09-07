package LabQuestions;

import java.util.Scanner;

public class SwapStringsExample
{
    public static void main(String[] args) 
     {
    	Scanner Sc = new Scanner(System.in);
    	
    	//Prompt the user to enter te first string
    	System.out.println("Enter the first string:");
    	String str1 = Sc.nextLine();
    	
    	//Prompt user to enter the second string
    	System.out.println("Enter the second string: ");
        String str2 = Sc.nextLine();
        
        //Display the original values of string
        System.out.println("\nBefore swapping: ");
        System.out.println("str2:" + str2);
	
        //Perform swapping without a third variable
        str1 = str1 + str2;
        //Concatenate both strings
        str2 = str1.substring(0, str1.length() - str2.length());
        
        //Display the swapped values of the strings
        System.out.println("\nAfter swapping; ");
        
        System.out.println("str2:" + str2);
        
        //close the scanner 
        Sc.close();
     }

}
