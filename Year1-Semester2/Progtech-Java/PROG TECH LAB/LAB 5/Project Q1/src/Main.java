import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VendingMachine v = new VendingMachine();
        ArrayList<Integer> coins = new ArrayList<>();
        Card c1 = new Card(100);
        Card c2 = new Card(50);
        String drinkName;
        int coin;
        int amount;
        int sum;

        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        System.out.print("Do you play with Card 1 (Enter 1) or coin(Enter 2): ");
        int checkA = input.nextInt();
        if (checkA == 1) {
            System.out.println(v.buy(drinkName, c1));
            System.out.println("CardID: " + c1.getCardID() + " Card amount left: " + c1.getAmount());
        }
        if (checkA == 2) {
            System.out.print("Enter your coin: ");
            coin = input.nextInt();
            System.out.print("Enter your coin amount: ");
            amount = input.nextInt();
            sum = coin * amount;
            coins.add(sum);
            System.out.println(v.buy(drinkName, coins));
            coins.clear();
            System.out.println(v);
        }

        System.out.println(v.getDrinkDetail());
        System.out.print("Enter your drink: ");
        drinkName = input.next();
        System.out.print("Do you play with Card 2 (Enter 1) or coin(Enter 2): ");
        int checkD = input.nextInt();
        if (checkD == 1) {
            System.out.println(v.buy(drinkName, c2));
            System.out.println("CardID: " + c2.getCardID() + " Card amount left: " + c2.getAmount());
        }
        if (checkD == 2) {
            System.out.print("Enter your coin: ");
            coin = input.nextInt();
            System.out.print("Enter your coin amount: ");
            amount = input.nextInt();
            sum = coin * amount;
            coins.add(sum);
            System.out.println(v.buy(drinkName, coins));
            coins.clear();
            System.out.println(v);
        }

        System.out.println("\n====Simulate end of day====");
        System.out.println("Revenue: " + v.getRevenue());
        v.endOfDayProcess();
        System.out.println(v);
    }
}