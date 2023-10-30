package LabQuestions;

import java.sql.*;
import java.util.Scanner;

public class StudentDatabaseWithJDBC {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL JDBC driver
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
            createStudentTable(connection);

            while (true) {
                System.out.println("\nStudent Database Operations:");
                System.out.println("1. Enter Student Details");
                System.out.println("2. Retrieve Student Details");
                System.out.println("3. Delete Student Details");
                System.out.println("4. Edit Student Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1/2/3/4/5): ");

                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        enterStudentDetails(connection);
                        break;
                    case 2:
                        enterStudentDetails(connection);
                        break;
                    case 3:
                        enterStudentDetails(connection);
                        break;
                    case 4:
                        enterStudentDetails(connection);
                        break;
                    case 5:
                        System.out.println("Exiting the Student Database. Goodbye!");
                        connection.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

	private static void enterStudentDetails(Connection connection) {
		// TODO Auto-generated method stub
		
	}

	private static void createStudentTable(Connection connection) {
		// TODO Auto-generated method stub
		
	}

    // Rest of the code remains the same as in the previous response...
}
