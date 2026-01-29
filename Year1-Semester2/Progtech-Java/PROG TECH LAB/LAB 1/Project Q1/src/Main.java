import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        LocalDate inputDate = LocalDate.of(year, month, day);
        long daysBetween = ChronoUnit.DAYS.between(today, inputDate);
        System.out.println("Number of days: " + daysBetween);

    }
}