import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        int[] primeNumbers = new int[n];
        int count = 0;
        int number = 2;
        while (count < n) {
            boolean isPrime = true;
            if (number < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        for (int prime : primeNumbers) {
            System.out.println(prime);
        }
    }
}