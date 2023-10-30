package LabQuestions;

/*A- create crud operation for students details accepting the  input from user for confirming the operations

1.enter the student details, 

2.retrive the students details,

3.delete the students details, 

4.edit the students details.
  */

import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {

    public static void main(String[] args) throws Exception
    {
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");;
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
                        retrieveStudentDetails(connection);
                        break;
                    case 3:
                        deleteStudentDetails(connection);
                        break;
                    case 4:
                        editStudentDetails(connection);
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
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    private static void createStudentTable(Connection connection) throws Exception 
    {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "student_id VARCHAR(10) NOT NULL," +
                "name VARCHAR(255) NOT NULL," +
                "age INT NOT NULL" +
                ")";
        Statement statement = connection.createStatement();
        statement.execute(createTableSQL);
        statement.close();
    }

    private static void enterStudentDetails(Connection connection)
    {
        // Code to enter student details into the database
        // ...
    }

    private static void retrieveStudentDetails(Connection connection)
    {
        // Code to retrieve student details from the database
        // ...
    }

    private static void deleteStudentDetails(Connection connection)  
    {
        // Code to delete student details from the database
        // ...
    }

    private static void editStudentDetails(Connection connection) 
    {
        // Code to edit student details in the database
        // ...
    }
}
