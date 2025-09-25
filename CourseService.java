package edu.ccrm.service;

import edu.ccrm.domain.Course;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added successfully: " + course.getTitle());
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }

    public List<Course> findCoursesByDepartment(String department) {
        return courses.stream()
                      .filter(course -> course.getDepartment().equalsIgnoreCase(department))
                      .collect(Collectors.toList());
    }
}
