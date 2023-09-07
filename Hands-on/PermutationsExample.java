package LabQuestions;

import java.util.Scanner;

public class PermutationsExample
{
    public static void main(String[] args)
{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Permutations of the string:");
        
     // Start generating permutations
        generatePermutations("", input); 
        
        scanner.close();
    }
    
    public static void generatePermutations(String prefix, String remaining)
    {
        int length = remaining.length();
        if (length == 0)
        {
        	// Print the generated permutation
            System.out.println(prefix);  
            
        } 
        else
        {
          for (int i = 0; i < length; i++)
          {
                String newPrefix = prefix + remaining.charAt(i);
                // Add the current character to the prefix
                
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                // Remove the current character from the remaining
                
                generatePermutations(newPrefix, newRemaining);
                // Recursively generate permutations with updated prefix and remaining
            }
        }
    }
}
