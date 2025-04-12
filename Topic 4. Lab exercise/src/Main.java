import university.Course;
import university.CourseType;
import university.Program;
import university.ProgramType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java OOP", 6, CourseType.REQUIRED);
        Course course2 = new Course("C++", 6, CourseType.ELECTIVE);
        Course course3 = new Course("Python", 3, CourseType.REQUIRED);
        Course course4 = new Course("JavaScript", 3, CourseType.ELECTIVE);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);

        Program program = new Program("Computer Science", ProgramType.MAJOR);
        System.out.println(program);

        program.addCourse(course1);
        program.addCourse(course1);
        program.addCourse(course2);
        System.out.println(program);

        program.printCourseList();

        System.out.println(program.getCourseListSize());

/*        System.out.println("====================================");
        System.out.println(program.removeCourse(1));
        program.printCourseListByCourseType(CourseType.REQUIRED);

        ProgramType.MAJOR.setCreditsRequiredToGraduate(260);

        System.out.println("Credits required to graduate: " + program.getProgramType().getCreditsRequiredToGraduate());
*/

    }
}