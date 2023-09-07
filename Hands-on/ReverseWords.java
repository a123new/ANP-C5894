package LabQuestions;

import java.util.Scanner;
public class ReverseWords
{
   public static void main(String[] args) 
	 {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		
		//Read the input sentence from the user
		String input = Sc.nextLine();
		
		//Split the sentence into an array of words
		String[]words = input.split(" ");
		
		//Initialize an empty string to store the reversed sentence
		String reversedSentence = " ";
		
		//Loop through each word in the array
		for(String word: words) 
		{
			//Initialize an empty string to store reversed word
			String reversedWord = " ";
			
			//Loop through the each character in the word in reverse oder
			for(int i = word.length() - 1; i>=0; i--) 
			{
				reversedWord += word.charAt(i);
			}
			//Concatenate the reversed word to the reversed sentence
			reversedSentence += reversedWord + " ";
		}
		   //Display the reversed sentence
		   System.out.println("Reversed sentence:" + reversedSentence);
		   
		   //Close the Scanner
		   Sc.close();
	}

}
