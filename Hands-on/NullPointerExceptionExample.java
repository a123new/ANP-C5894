package exceptionhandeling;

//Null Pointer Exception Example
import java.util.Scanner;

public class NullPointerExceptionExample
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string (or 'null' to trigger the exception): ");
        String input = scanner.nextLine();

        try 
        {
            int length = input.length();
            System.out.println("Length of the input string: " + length);
        }
        catch (NullPointerException e) 
        {
            System.out.println("An exception occurred: " + e.getMessage());
        } 
    }
}
