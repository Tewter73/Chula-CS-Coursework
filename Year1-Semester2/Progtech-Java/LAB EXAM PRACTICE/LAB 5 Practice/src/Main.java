import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter 3 student ID and name: ");
        for (int i = 0; i < 3; i++) {
            String studentInfo = inputs.nextLine();
            String[] parts = studentInfo.split(" ", 2);
            Student st = new Student(parts[0], parts[1]);
            students.add(st);
        }

        ArrayList<Course> courses = new ArrayList<>();
        System.out.println("\nEnter 5 course ID, name and credit: ");
        for (int n = 0; n < 5; n++) {
            String courseInput = inputs.nextLine();
            courses.add(groupCourse(courseInput));
        }

        for (Student st : students) {
            System.out.println("\n" + st.getName() + " grade report: ");
            boolean running = true;
            while (running) {
                String gradeReport = inputs.nextLine();
                String[] parts = gradeReport.split(" ");
                if (parts[0].equalsIgnoreCase("X")) {
                    running = false;
                } else {
                    for (Course c : courses) {
                        if (c.getCourseID().equals(parts[0])) {
                            st.addGradeReport(c, parts[1]);
                            break;
                        }
                    }
                }
            }
        }

        for (Student student : students) {
            System.out.println("\n------ Transcript ------");
            System.out.println("\t" + student.getStudentID() + " " + student.getName());
            for (CourseGrade courseGrade : student.getTranscript()) {
                Course course = courseGrade.getCourse();
                String gradeReport = courseGrade.getGrade();
                System.out.println(course.getCourseID() + " " + course.getName() + " " + course.getCredit() + " " + gradeReport);
            }
            System.out.printf("\n    GPA: %.2f\n", student.calGPA());
        }
    }

    private static Course groupCourse(String courseInput) {
        String[] parts = courseInput.split(" ");
        String courseId = parts[0];
        StringBuilder nameCourse = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            nameCourse.append(parts[i]).append(" ");
        }
        int credits = Integer.parseInt(parts[parts.length - 1]);
        return new Course(courseId, nameCourse.toString().trim(), credits);
    }
}