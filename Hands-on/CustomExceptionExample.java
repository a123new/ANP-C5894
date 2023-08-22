package exceptionhandeling;

  /*  Write a program that takes an integer input from the user 
     and throws this custom exception if the input is negative.
     Catch the exception and display an error message accordingly.           
   */

import java.util.Scanner;

//Custom Exception Class
class NegativeInputException extends Exception 
{
 public NegativeInputException(String message) 
 {
     super(message);
 }
}

public class CustomExceptionExample 
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);

     // Prompting the user to enter a positive integer
     System.out.print("Enter a positive integer: ");
     int number = sc.nextInt();

     try {
         // Checking if the entered number is negative
         if (number < 0)
         {
             // Throwing the custom NegativeInputException with a specific error message
             throw new NegativeInputException("Negative input is not allowed.");
         } 
         else
         {
             // Displaying the entered number if it's not negative
             System.out.println("You entered: " + number);
         }
     } 
     catch (NegativeInputException e)
     {
         // Catching the NegativeInputException and displaying the custom error message
         System.out.println("Error: " + e.getMessage());
     }

     // Closing the Scanner
     sc.close();
 }
}
