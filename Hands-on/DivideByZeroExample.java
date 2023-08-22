package exceptionhandeling;

//Divide By Zero Example

//Import the Scanner class to read user input
import java.util.Scanner;

//Define the class name
public class DivideByZeroExample 
{
 // Main method where the program starts execution
 public static void main(String[] args)
 {
     // Create a Scanner object to read input from the user
     Scanner sc = new Scanner(System.in);

     // Prompt the user to enter the numerator
     System.out.print("Enter the numerator: ");
     int numerator = sc.nextInt();

     // Prompt the user to enter the denominator
     System.out.print("Enter the denominator: ");
     int denominator = sc.nextInt();

     try
     {
         // Try to perform the division
         int result = numerator / denominator;
         System.out.println("Result: " + result);
     } 
     catch (ArithmeticException e) 
     {
         // If a divide by zero exception occurs, catch it here
         System.out.println("An exception occurred: " + e.getMessage());
     } 
     finally
     {
         // Close the Scanner to release resources
         sc.close();
     }
 }
 
}

