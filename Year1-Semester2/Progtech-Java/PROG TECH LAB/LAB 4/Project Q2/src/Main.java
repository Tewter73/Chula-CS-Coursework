import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        ArrayList<Integer> primeNumbersList = new ArrayList<>();

        for (int number = 2; number < n; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbersList.add(number);
            }
        }
        for (int prime : primeNumbersList) {
            System.out.println(prime);
        }
    }
}