package loops;

/* Write a program that prints the Fibonacci series 
   up to a specified limit entered by the user. 
   However, skip printing numbers that are divisible by 3. 
   Use the continue statement to skip such numbers.
   */

     import java.util.Scanner;
     public class FibonacciSeries {

	public static void main(String[] args) {
		  
	    // creating a scanner object to read user input 
		Scanner sc=new Scanner(System.in);
		
		//Prompt the user to enter the limit
		System.out.println("Enter the limit for Fibonacci series:");
		int limit = sc.nextInt();
		
		//close the scanner
		sc.close();
		
		int previousNumber = 0;
		int currentNumber = 1;
		
		//SOP statement for print the series 
		System.out.println("Fibonacci Series up to" + limit + ":");
		System.out.print(previousNumber + "" + currentNumber + "");
		
		while (currentNumber <= limit) 
		{
			int nextNumber = previousNumber + currentNumber;
			if (nextNumber % 3 == 0) {
                // Skip printing if the nextNumber is divisible by 3
                previousNumber = currentNumber;
                currentNumber = nextNumber;
                continue;
		}
		    
			if (nextNumber > limit) 
			{
				break;
			}
			
			System.out.println(nextNumber + "");
			
			previousNumber = currentNumber;
			currentNumber = nextNumber;
		
		
		}

	}

}
