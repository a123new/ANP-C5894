package LabQuestions;

import java.util.Scanner;

public class CharacterCountExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the character to count: ");
        char targetChar = scanner.next().charAt(0);
        
        int count = countOccurrences(input, targetChar);
        System.out.println("Total occurrences of '" + targetChar + "': " + count);
        
        scanner.close();
    }
    
    public static int countOccurrences(String input, char targetChar)
    {
        if (input.length() == 0) 
        {
            return 0;
        }
        
        char firstChar = input.charAt(0);
        int restCount = countOccurrences(input.substring(1), targetChar);
        
        return (firstChar == targetChar) ? (1 + restCount) : restCount;
    }
}
