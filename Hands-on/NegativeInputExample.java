package LabQuestions;

/*Write a program that takes an integer input from the user and throws this custom exception if the input is negative. 
Catch the exception and display an error message accordingly.*/

import java.util.Scanner;

//Custom exception class for negative input
class NegativeInputException extends Exception 
{
 public NegativeInputException(String message) 
 {
     super(message);
 }
}

public class NegativeInputExample 
{
 public static void main(String[] args) 
 {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     
     try {
         int userInput = scanner.nextInt();

         // Check if the input is negative
         if (userInput < 0)
         {
             throw new NegativeInputException("Negative input is not allowed.");
         }

         // If the input is non-negative, display it
         System.out.println("You entered: " + userInput);
     } 
     catch (NegativeInputException e)
     {
         // Handle the custom exception
         System.err.println("Error: " + e.getMessage());
         
     } 
     catch (java.util.InputMismatchException e) 
     {
         // Handle the case where the input is not an integer
         System.err.println("Error: Input must be an integer.");
     } 
     finally
     {
         scanner.close();
     }
 }
}
