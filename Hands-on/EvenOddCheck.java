package Operator;

/*Write a Java program that takes an integer input from the user and
   checks if it is even or odd using bitwise operators.
   Print "Even" if the number is even, and "Odd" if the number is odd.*/


	import java.util.Scanner;

	public class EvenOddCheck
	{
	    public static void main(String[] args) 
	    {
	        // Create a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter an integer
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        // Close the Scanner object to free resources
	        scanner.close();

	        // Check if the LSB of the number is 1 (odd) or 0 (even)
	        if ((number & 1) == 1) {
	            System.out.println("Odd");
	        } else {
	            System.out.println("Even");
	        }
	    }
	}
