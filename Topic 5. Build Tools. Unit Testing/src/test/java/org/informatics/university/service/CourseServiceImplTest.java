package org.informatics.university.service;

import org.informatics.university.data.Course;
import org.informatics.university.data.CourseType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceImplTest {

    CourseService courseService;
    Course course1;

    @BeforeEach
    void setup(){
        courseService = new CourseServiceImpl();
        course1 = new Course(1, "CITB408", 6, 60, CourseType.REQUIRED);
    }

    @Test
    void whenCourseTypesAreRequired_thenReturnZero() {
        // given
        Course course = new Course(2, "CITB525", 3, 30, CourseType.REQUIRED);

        // when
        int actual = courseService.compareCoursesByCourseType(course1, course); // 0

        // then
        // int expected = 0;
        assertEquals(0, actual);
    }

        @Test
        void whenFirstCourseTypeIsElective_thenReturnOne() {
            // given
            Course course3 = new Course(1, "CITB409", 3, 30, CourseType.ELECTIVE);
            Course course4 = new Course(2, "CITB535", 6, 60, CourseType.REQUIRED);
            CourseService courseService2 = new CourseServiceImpl();

            // when
            int actual2 = courseService2.compareCoursesByCourseType(course3, course4);

            // then
            // int expected = 0;
            assertEquals(1, actual2);

    }

    @Test
    void whenFirstCourseTypeIsRequiredTheSecondIsElective_thenReturnMinusOne() {
        // given
        Course course3 = new Course(3, "CITB450", 3, 30, CourseType.ELECTIVE);

        // when

        // then
        assertEquals(-1, courseService.compareCoursesByCourseType(course1, course3));
    }

    @Test
    void whenFirstCourseIsWith6CreditsAndSecondIsWith10Credits_thenReturn16() {
        // given
        Course course2 = new Course(2, "CITB409", 10, 60, CourseType.ELECTIVE);
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        assertEquals(16, courseService.totalCredits(courses));

    }
}