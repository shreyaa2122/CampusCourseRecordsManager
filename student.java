package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.List;

public class Student extends Person {
    private String regNo;
    private StudentStatus status; // Using the StudentStatus enum
    private List<String> enrolledCourses;

    public Student(String id, String regNo, String fullName, String email, StudentStatus status, List<String> enrolledCourses, LocalDate registrationDate) {
        super(id, fullName, email, registrationDate);
        this.regNo = regNo;
        this.status = status;
        this.enrolledCourses = enrolledCourses;
    }

    // Implementation of the abstract method from Person
    @Override
    public void printProfile() {
        System.out.println("Student Profile:");
        System.out.println("----------------------------------");
        System.out.println("ID: " + this.getId());
        System.out.println("Registration No: " + this.regNo);
        System.out.println("Full Name: " + this.getFullName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Status: " + this.status);
        System.out.println("Enrolled Courses: " + this.enrolledCourses);
        System.out.println("Registration Date: " + this.getRegistrationDate());
        System.out.println("----------------------------------");
    }
    
    // Getters and setters for Student-specific fields
    public String getRegNo() { return regNo; }
    public StudentStatus getStatus() { return status; }
    public List<String> getEnrolledCourses() { return enrolledCourses; }

    public void setRegNo(String regNo) { this.regNo = regNo; }
    public void setStatus(StudentStatus status) { this.status = status; }
    public void setEnrolledCourses(List<String> enrolledCourses) { this.enrolledCourses = enrolledCourses; }
}



