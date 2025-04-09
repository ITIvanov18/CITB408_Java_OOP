package university;
import java.util.ArrayList;
import java.util.List;

public class Program {

    private final String name;
    private final ProgramType programType;
    List<Course> courseList;

    public Program(String name, ProgramType programType) {
        this.programType = programType;
        this.name = name;
        this.courseList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    public boolean addCourse(Course course) {
        if(this.courseList.contains(course)){
            return false;
        }
        return this.courseList.add(course);
    }

    public boolean removeCourse(Course course) {
        return this.courseList.remove(course);
    }

    public Course removeCourse(int index) {
        return this.courseList.remove(index);
    }

    public void printCourseList(){
        for(Course course : this.courseList){
            System.out.println(course);
        }
    }

    public void printCourseListByCourseType(CourseType courseType){
        for(Course course : this.courseList){
            if(course.getCourseType().equals(courseType)){
                System.out.println(course);
            }
        }
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", programType=" + programType +
                '}';
    }

    public int getCourseListSize() {
        return courseList.size();
    }
}
