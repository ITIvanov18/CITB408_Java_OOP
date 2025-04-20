package org.informatics.university.service;

import org.informatics.university.data.Course;
import org.informatics.university.data.CourseType;
import org.informatics.university.service.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseServiceImplUnitTest {

    Course course1;
    Course course2;
    CourseService courseServiceSpy;

    @BeforeEach
    void setUp() {
        courseServiceSpy = Mockito.spy(CourseServiceImpl.class);
        course1 = Mockito.mock(Course.class);
        course2 = Mockito.mock(Course.class);
    }

    @Test
     void whenCreditsOfTwoCoursesAreEqual_thenZeroReturned() {
        Mockito.when(course1.getCredits()).thenReturn(6);
        Mockito.when(course2.getCredits()).thenReturn(6);

        assertEquals(0, courseServiceSpy.compareCoursesByCourseType(course1, course2));

    }
}
