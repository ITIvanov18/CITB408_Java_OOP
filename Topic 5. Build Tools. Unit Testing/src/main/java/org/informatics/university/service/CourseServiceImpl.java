package org.informatics.university.service;
import org.informatics.university.data.Course;

import java.util.ArrayList;

public class CourseServiceImpl implements CourseService {

    @Override
    public int compareCoursesByCourseType(Course course1, Course course2) {
        return course1.getCourseType().compareTo(course2.getCourseType());
    }

    @Override
    public int totalCredits(ArrayList<Course> courses) {
        int totalCredits = 0;
        for (Course course : courses) {
            totalCredits += course.getCredits();
        }
        return totalCredits;
    }

    @Override
    public int totalDuration(ArrayList<Course> courseList) {
        return 0;
    }
}
