package loops;
/*
  Write a program that prompts the user to enter a series of integers. 
  The program should calculate the sum of all the even numbers entered,
  skipping any negative numbers.
  Use the continue statement to skip negative numbers.  
  */
    import java.util.Scanner;

     public class SeriesOfIntegers 
     {
         public static void main(String[] args) 
         {
        	 
        	 //Create Scanner class
        	 Scanner sc=new Scanner(System.in);
        	 
        	 
        	 //Get the series of integers from the user
        	 System.out.println("Enter a Series of integers:");       	 
        	 int EvenNumbers = sc.nextInt();
        	 int sum=0;
        	 
        	 //Perform a loop for the given Series of Integers
        	//initialized x to 10
 			int x=10;
 			
 			//condition
 			while(x<20)
 			{
 				System.out.println("Sum of EvenNumbers:");
 				x++;
 			//Add Even Numbers to the sum
 				sum+= x;

        			 //Skip this negative number
 			if(x < 0) {
        			 continue;
        		 }
        		 
        		 //Print the current even number
        		 System.out.println("EvenNumber:" + sum);
        	 
         } 
     
         }
     }
     
     

