package org.informatics.university.service;

import org.informatics.university.data.Course;

import java.util.ArrayList;

public interface ProgramService {
    int compareProgramsByTotalDuration(ArrayList<Course> courseList1, ArrayList<Course> courseList2);
}


