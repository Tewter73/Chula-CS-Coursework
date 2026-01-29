import java.util.Scanner;

public class Main {
    private static double calculateGradePoint(String grade) {
        return switch (grade) {
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D+" -> 1.5;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalCredit = 0;
        double totalGradePoints = 0.0;

        System.out.println("Enter course ID, credit and grade; or X to terminate");

        String userInput = input.nextLine();
        while (!userInput.equalsIgnoreCase("x")) {
            String[] values = userInput.split("\\s+");

            if (values.length != 3) {
                System.out.println("Invalid input. Please enter course ID, credit, and grade again.");
            } else {
                int credit = Integer.parseInt(values[1]);
                String grade = values[2].toUpperCase();

                double gradePoint = calculateGradePoint(grade);
                double gradeValue = gradePoint * credit;

                totalCredit += credit;
                totalGradePoints += gradeValue;
            }
            userInput = input.nextLine();
        }
        double cumulativeGPA = totalCredit > 0 ? totalGradePoints / totalCredit : 0.0;
        System.out.println("GPA = " + cumulativeGPA);
    }
}