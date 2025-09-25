package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.List;

public class Instructor extends Person {
    private String department;
    private List<String> coursesTaught;

    public Instructor(String id, String fullName, String email, LocalDate registrationDate, String department, List<String> coursesTaught) {
        super(id, fullName, email, registrationDate);
        this.department = department;
        this.coursesTaught = coursesTaught;
    }

    // Implementation of the abstract method from Person
    @Override
    public void printProfile() {
        System.out.println("Instructor Profile:");
        System.out.println("----------------------------------");
        System.out.println("ID: " + this.getId());
        System.out.println("Full Name: " + this.getFullName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Department: " + this.department);
        System.out.println("Courses Taught: " + this.coursesTaught);
        System.out.println("----------------------------------");
    }
}
