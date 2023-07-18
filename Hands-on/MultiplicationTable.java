package loops;
/*
  To write java program that prompts the user to enter a number then 
  prints the multiplication table of that number using a for loop.
  The table should display multiplication from 1 to 10.
 * */

     import java.util.Scanner;
     
     public class MultiplicationTable
     {

	 public static void main(String[] args) 
	 {
		//Creating Scanner class
		Scanner scanner = new Scanner(System.in);
		
		//To print a number
		System.out.println("Enter a Number:");
		int number = scanner.nextInt();
		
		
		//To print multiplication Table
		System.out.println("'Multiplication table of" +number+":");
		
		//Test Expression
		for(int i=1; i <=10; i++) 
		{
			int result= number * i;
			System.out.println(number + "x" + i+ "=" + number);
		}
		scanner.close();
		
		}

}
