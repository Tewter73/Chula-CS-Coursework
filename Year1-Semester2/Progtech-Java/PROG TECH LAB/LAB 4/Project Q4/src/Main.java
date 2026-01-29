import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CourseRegister course = new CourseRegister("2301260");

        while (true) {
            System.out.println("Enter ID, name, major");
            String inputs = input.nextLine().trim();
            if (inputs.equalsIgnoreCase("X")) {
                break;
            }

            String[] studentInfo = inputs.split(" ");
            Student student = new Student(studentInfo[0], studentInfo[1], studentInfo[2], studentInfo[3]);
            if (course.register(student)) {
                System.out.println(student.getStudentID() + " REGISTERED SUCCESSFULLY");
            }
        }

        course.printReg();

        System.out.println("Drop student -> Enter ID of the student:");
        String studentIDToDrop = input.nextLine().trim();
        if (course.drop(studentIDToDrop)) {
            System.out.println(studentIDToDrop + " DROPPED SUCCESSFULLY");
        }

        course.printReg();

        input.close();
    }
}