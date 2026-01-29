import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Student 1: Enter ID, name, major");
        String[] userInput1 = input.nextLine().split(" ");
        Student student1 = new Student(userInput1[0]);

        System.out.println("Student 2: Enter ID, name, major");
        String[] userInput2 = input.nextLine().split(" ");
        Student student2 = new Student(userInput2[0]);

        boolean sameYear = student1.sameYear(student2);

        boolean sameLevel = student1.sameLevel(student2);

        boolean sameFaculty = student1.sameFaculty(student2);

        if (sameYear && sameLevel && sameFaculty) {
            System.out.println("Same year, same level, same faculty");
        } else if (sameYear && sameLevel) {
            System.out.println("Same year, same level, different faculty");
        } else if (sameYear && sameFaculty) {
            System.out.println("Same year, different level, same faculty");
        } else if (sameLevel && sameFaculty) {
            System.out.println("Different year, same level, same faculty");
        } else if (sameYear) {
            System.out.println("Same year, different level, different faculty");
        } else if (sameLevel) {
            System.out.println("Different year, same level, different faculty");
        } else if (sameFaculty) {
            System.out.println("Different year, different level, same faculty");
        } else {
            System.out.println("Different year, different level, different faculty");
        }
    }
}