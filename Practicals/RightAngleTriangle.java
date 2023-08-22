package loops;

	//A Java program that prints a right-angled triangle made of asterisks (*) based on user input:

		import java.util.*;

		public class RightAngleTriangle {
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);

		        System.out.print("Enter the number of rows for the triangle: ");
		        int rows = s.nextInt();

		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }

		        s.close();
		    }
		}

