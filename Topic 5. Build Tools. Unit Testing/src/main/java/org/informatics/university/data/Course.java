package org.informatics.university.data;

public class Course {
    private long id;
    private String name;
    private int credits;
    private int duration;
    private CourseType courseType;

    public Course(long id, String name, int credits, int duration, CourseType courseType) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.duration = duration;
        this.courseType = courseType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", courseType=" + courseType +
                '}';
    }
}

