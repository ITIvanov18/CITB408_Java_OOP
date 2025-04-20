package org.informatics.university.service;

import org.informatics.university.data.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class ProgramServiceImplTest {
    Course course1;
    Course course2;

    CourseService courseService;
    ProgramService programService;

    @BeforeEach
    void setUp() {
        course1 = Mockito.mock(Course.class);
        course2 = Mockito.mock(Course.class);
        courseService = Mockito.mock(CourseServiceImpl.class);

        programService = new ProgramServiceImpl();
    }

    @Test
    void whenBothListsOfCoursesAreEqual_thenZeroReturned() {
        Course course3 = Mockito.mock(Course.class);
        Course course4 = Mockito.mock(Course.class);

        Mockito.when(course1.getDuration()).thenReturn(60);
        Mockito.when(course2.getDuration()).thenReturn(30);
        Mockito.when(course3.getDuration()).thenReturn(45);
        Mockito.when(course4.getDuration()).thenReturn(45);

        ArrayList<Course> courseList1 = new ArrayList<>();
        courseList1.add(course1);
        courseList1.add(course2);

        ArrayList<Course> courseList2 = new ArrayList<>();
        courseList2.add(course3);
        courseList2.add(course4);

        Mockito.when(courseService.totalDuration(any())).thenReturn(90);
        Mockito.when(courseService.totalDuration(any())).thenReturn(90);

        assertEquals(1, programService.compareProgramsByTotalDuration(courseList1, courseList2));

    }
}