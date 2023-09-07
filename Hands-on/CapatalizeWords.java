package LabQuestions;

import java.util.Scanner;
   public class CapatalizeWords
     {
        public static void main(String[] args)
	     {
		  //Create a Scanner object to read user input
        	Scanner Sc= new Scanner(System.in);
        	System.out.println("Enter a sentence: " );
        	
        	//Read the input sentence from the user
        	String input = Sc.nextLine();
        	
        	//Split the sentence into array of words
        	String[]words = input.split(" ");
        	
        	//initialize an empty string to store the capitalized sentence
        	String capitalizedSentence = " ";
        	
        	//loop through each word in the array
        	for(String word: words) 
        	{
        		//Get the first character of the word and capitalized it
        		char firstChar = Character.toUpperCase(word.charAt(0));
        		
        		//Get the remaining character in the word
        		String restOfWord = word.substring(1);
        		
        		String capitializedWord = firstChar + restOfWord;
        	      
        		//Concatenate capitalized sentence
                capitalizedSentence += capitializedWord + " ";
        	
        	}
        	    //Display the capitalized sentence
        	     System.out.println("Capitialized sentence:" + capitalizedSentence);
        	     
        	     //Close the Scanner
        	     Sc.close();
		
	}

}
