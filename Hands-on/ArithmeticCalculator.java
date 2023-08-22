package exceptionhandeling;

/* Hands-on: Write a program that takes two numbers and 
   an operator (+, -, *, /) from the user. 
   Perform the corresponding arithmetic operation and display the result. 
   Handle exceptions for invalid operators and division by zero.
  */

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the first number from the user
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            // Get the operator from the user
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            // Get the second number from the user
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = 0.0;

            // Perform calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero.");
                        scanner.close();
                        return; // Stop the program
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    scanner.close();
                    return; // Stop the program
            }

            // Show the result
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }

        // Close the input scanner
        scanner.close();
    }
}
