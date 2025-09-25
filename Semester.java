package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.List;

public class Semester {
    private String semesterId;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> courseOfferings;

    public Semester(String semesterId, LocalDate startDate, LocalDate endDate, List<String> courseOfferings) {
        this.semesterId = semesterId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseOfferings = courseOfferings;
    }

    // Getters and setters
    public String getSemesterId() {
        return semesterId;
    }

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<String> getCourseOfferings() {
        return courseOfferings;
    }

    public void setCourseOfferings(List<String> courseOfferings) {
        this.courseOfferings = courseOfferings;
    }

    @Override
    public String toString() {
        return "Semester{" +
               "semesterId='" + semesterId + '\'' +
               ", startDate=" + startDate +
               ", endDate=" + endDate +
               ", courseOfferings=" + courseOfferings +
               '}';
    }
}

