package Operator;

/* Write a Java program that takes an integer input from the user and
   checks if it is a power of 2 using bitwise operators.
 * Print "Yes" if it is a power of 2, and "No" otherwise.*/


import java.util.Scanner;

public class PowerOfTwoCheck 
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

        // Check if the number is a power of 2
        if (number > 0 && (number & (number - 1)) == 0)
        {
            System.out.println("Yes");
        } else 
        {
            System.out.println("No");
        }
    }
}
