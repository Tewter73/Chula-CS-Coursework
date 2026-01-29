import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter firstname lastname age: ");
        String name = input.nextLine();
        int firstIndex = name.indexOf(' ');
        int lastIndex = name.lastIndexOf(' ');
        String firstName = name.substring(0, firstIndex).trim();
        String lastName = name.substring(firstIndex, lastIndex).trim();
        int age = Integer.parseInt(name.substring(lastIndex).trim());
        System.out.println(lastName + ", " + firstName + " is " + age + " years old.");
    }
}