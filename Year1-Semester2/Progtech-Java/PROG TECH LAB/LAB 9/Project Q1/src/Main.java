import java.util.Scanner;

public class Main {
    public static int power(int b, int p) {
        if (p == 0) {
            return 1;
        } else if (p % 2 == 0) {
            int evenPower = power(b , p / 2);
            return evenPower * evenPower;
        } else {
            return b * power(b, p-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter x and y : ");
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(power(x, y));
    }
}