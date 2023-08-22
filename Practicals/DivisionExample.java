package exceptionhandeling;

/* Write a program that attempts to divide two numbers.
Whether the division is successful or not, make sure to display
a "Division completed" message. Ensure that the division operation is performed in a
try block and the "Division completed" message is displayed in a finally block.
*/
import java.util.Scanner;

public class DivisionExample
{
	// Main method where the program starts execution
	public static void main() 
	{
		Scanner sc = new Scanner(System.in);
		
		  // Prompt the user to enter the numerator
		System.out.print("Enter a Numerator: ");
		int numerator = sc.nextInt();
		
		 // Prompt the user to enter the denominator
		System.out.print("Enter a Denominator: ");
		int denominator = sc.nextInt();
		
		try 
		{
			 // Try to perform the division
			int result = numerator / denominator;
			System.out.println("Result:" + result);
		}
		catch (ArithmeticException e)
		{
			// If a divide by zero exception occurs, catch it here
			System.out.println("Division by zero is not allowed: ");
		}
		finally 
		{
			//the division completed message is displayed in finally block
			System.out.println("Division Completed.");
		}
		sc.close();
	}
	

}
