package LabQuestions;

import java.util.Scanner;

public class CharacterExample
{
public static void main(String[] args)
{
	Scanner Sc = new Scanner(System.in);
	
	//Prompt the user to enter string
	System.out.println("Enter a string: ");
	
	String inputString = Sc.nextLine();
	
	//Prompt the user to enter the character to remove
	System.out.println("Enter the character to remove: ");
	
	char charToRemove = Sc.next().charAt(0);
	
	//close the scanner
	Sc.close();
	
	//Call the method to remove the character
		String result= removeCharacters(inputString, charToRemove);
		
	//Display the modified string
		System.out.println("String after removing" + charToRemove + ":" + result);
	}
    //Method to remove a character from a string
    public static String removeCharacters(String str, char charToRemove) 
    {
    	//use the replace method 
    	String modifiedString = str.replace(String.valueOf(charToRemove), " ");
    	return modifiedString;
    			
    }
     
}
