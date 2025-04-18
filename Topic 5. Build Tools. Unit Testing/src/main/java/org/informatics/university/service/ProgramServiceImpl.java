package org.informatics.university.service;

import org.informatics.university.data.Course;

import java.util.ArrayList;

public class ProgramServiceImpl implements ProgramService {
    private CourseService courseService;

    public ProgramServiceImpl() {
        courseService = new CourseServiceImpl();
    }

    @Override
    public int compareProgramsByTotalDuration(ArrayList<Course> courseList1, ArrayList<Course> courseList2) {
        return Integer.compare(courseService.totalDuration(courseList1),
                            courseService.totalDuration(courseList2));
    }


}
