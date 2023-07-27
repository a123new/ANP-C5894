package Operator;

/* Write a Java program that takes two integer inputs from the user
   and swaps their values using bitwise operators. 
   After swapping, print the updated values of the two integers.
*/

import java.util.Scanner;

public class SwapUsingBitwise 
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two integers
        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        // Close the Scanner object to free resources
        scanner.close();

        System.out.println("Before swapping: ");
        System.out.println("a = " + a + ", b = " + b);

        // Perform the swap using bitwise XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: ");
        System.out.println("a = " + a + ", b = " + b);
    }
}