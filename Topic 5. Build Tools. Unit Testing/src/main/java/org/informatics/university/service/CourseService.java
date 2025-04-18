package org.informatics.university.service;
import org.informatics.university.data.Course;

import java.util.ArrayList;

public interface CourseService {
    int compareCoursesByCourseType(Course c1, Course c2);

    int totalCredits(ArrayList<Course> courses);

    int totalDuration(ArrayList<Course> courseList);
}
