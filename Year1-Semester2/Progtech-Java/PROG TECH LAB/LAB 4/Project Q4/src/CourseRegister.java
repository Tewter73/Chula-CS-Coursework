import java.util.ArrayList;

public class CourseRegister {
    private final String courseCode;
    private final ArrayList<Student> enrolledStudents;

    public CourseRegister(String courseCode) {
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public boolean register(Student student) {
        if (enrolledStudents.contains(student)) {
            System.out.println("Student is already registered in the course.");
            return false;
        } else {
            enrolledStudents.add(student);
            return true;
        }
    }

    public boolean drop(String studentID) {
        Student studentToRemove = null;
        for (Student student : enrolledStudents) {
            if (student.getStudentID().equals(studentID)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            enrolledStudents.remove(studentToRemove);
            return true;
        } else {
            System.out.println(studentID + " NOT REGISTERED");
            return false;
        }
    }

    public void printReg() {
        System.out.println(courseCode);
        for (Student student : enrolledStudents) {
            System.out.println(student.getStudentID() + " " + student.getName() + " " + student.getLastName());
        }
        System.out.println("Total students in this course: " + enrolledStudents.size());
    }
}