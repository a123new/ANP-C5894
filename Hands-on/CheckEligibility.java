package exceptionhandeling;

import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine()); // Try to convert user input to an integer

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative."); // Throw an exception if age is negative
            } else if (age >= 18) {
                System.out.println("You are eligible to vote!"); // Display eligibility message for voting
            } else {
                System.out.println("Illegal Argument Exception."); // Display in eligibility message for voting
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid age (numeric value)."); // Handle non-numeric input
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Display the custom error message for negative age
        } finally {
            scanner.close(); // Ensure the scanner is closed even if an exception occurs
        }
    }
}