package edu.ccrm.cli;

import java.util.Scanner;

public class CCRMApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the CCRM Application!");

        // The 'while' loop keeps the program running until the 'exit' variable is true
        while (!exit) {
            System.out.println("\n----------------------------------");
            System.out.println("Main Menu:");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Manage Enrollment & Grades");
            System.out.println("4. File Operations");
            System.out.println("5. Exit");
            System.out.println("----------------------------------");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            // The 'switch' statement handles the user's input
            switch (choice) {
                case "1":
                    System.out.println("Navigating to Student Management...");
                    // Implement student management logic here
                    break;
                case "2":
                    System.out.println("Navigating to Course Management...");
                    // Implement course management logic here
                    break;
                case "3":
                    System.out.println("Navigating to Enrollment & Grades...");
                    // Implement enrollment and grading logic here
                    break;
                case "4":
                    System.out.println("Navigating to File Operations...");
                    // Implement file operations logic here
                    break;
                case "5":
                    exit = true; // Sets the loop condition to false to exit
                    System.out.println("Exiting CCRM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}