package edu.ccrm.domain;

public class Grade {
    private String studentId;
    private String courseCode;
    private double mark;

    public Grade(String studentId, String courseCode, double mark) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.mark = mark;
    }

    public String getStudentId() { return studentId; }
    public String getCourseCode() { return courseCode; }
    public double getMark() { return mark; }

    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    public void setMark(double mark) { this.mark = mark; }

    @Override
    public String toString() {
        return "Grade{" +
               "studentId='" + studentId + '\'' +
               ", courseCode='" + courseCode + '\'' +
               ", mark=" + mark +
               '}';
    }
}
