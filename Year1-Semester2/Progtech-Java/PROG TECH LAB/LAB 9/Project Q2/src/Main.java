import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> primeFactor(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        return primeFactorRecursive(n, 2, factors);
    }

    private ArrayList<Integer> primeFactorRecursive(int n, int divisor, ArrayList<Integer> factors) {
        if (n < 2) {
            return factors;
        }
        if (n % divisor == 0) {
            factors.add(divisor);
            while (n % divisor == 0) {
                n = n / divisor;
            }
        }
        return primeFactorRecursive(n, divisor + 1, factors);
    }

    public static void main(String[] args) {
        Main object = new Main();
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a positive integer : ");
            int n = input.nextInt();
            ArrayList<Integer> primeFactors = object.primeFactor(n);
            System.out.print("Prime factors of " + n + " are ");
            for (int i = 0; i < primeFactors.size(); i ++) {
                System.out.print(primeFactors.get(i));
                if (i < primeFactors.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println(".");
    }
}
