package org.informatics;

import org.informatics.university.data.Course;
import org.informatics.university.data.CourseType;
import org.informatics.university.service.CourseService;
import org.informatics.university.service.CourseServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "CITB406", 6, 60,  CourseType.REQUIRED );
        Course course2 = new Course(2, "NET406", 3, 30, CourseType.ELECTIVE );

        CourseService courseService = new CourseServiceImpl();
        System.out.println("Compare: " + courseService.compareCoursesByCourseType(course1, course2));
    }
}