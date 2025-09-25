package edu.ccrm.service;

import edu.ccrm.domain.Enrollment;
import edu.ccrm.exception.DuplicateEnrollmentException;
import edu.ccrm.exception.MaxCreditLimitExceededException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();
    private final int MAX_CREDITS_PER_SEMESTER = 18;

    public void enrollStudent(Enrollment enrollment) throws DuplicateEnrollmentException, MaxCreditLimitExceededException {
        // Business rule 1: Check for duplicate enrollment
        if (enrollments.stream().anyMatch(e -> e.getStudentId().equals(enrollment.getStudentId()) && e.getCourseCode().equals(enrollment.getCourseCode()))) {
            throw new DuplicateEnrollmentException("Student is already enrolled in this course.");
        }
        
        // Business rule 2: Check max credit limit
        int totalCredits = 0; // In a real application, you would calculate this from the student's existing enrollments
        if (totalCredits + 3 > MAX_CREDITS_PER_SEMESTER) { // Assuming each course is 3 credits
            throw new MaxCreditLimitExceededException("Cannot enroll. Max credit limit exceeded.");
        }

        enrollments.add(enrollment);
        System.out.println("Student " + enrollment.getStudentId() + " enrolled in " + enrollment.getCourseCode());
    }

    public List<Enrollment> getEnrollmentsByStudentId(String studentId) {
        return enrollments.stream()
                          .filter(e -> e.getStudentId().equals(studentId))
                          .collect(Collectors.toList());
    }
}

