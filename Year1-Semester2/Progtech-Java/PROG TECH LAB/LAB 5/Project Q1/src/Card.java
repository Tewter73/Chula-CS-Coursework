public class Card {
    private int cardID;
    private int amount;

    public static int count = 0;
    public static final int MINVALUE = 10;

    public Card(int initialAmount) {
        if (initialAmount > MINVALUE) {
            count++;
            this.cardID = count;
            this.amount = initialAmount;
        } else {
            System.out.println("Initial amount must be greater than " + MINVALUE);
        }
    }

    public int getCardID() {
        return cardID;
    }

    public int getAmount() {
        return amount;
    }

    public void addMoney(int amount) {
        this.amount += amount;
    }

    public boolean pay(int amount) {
        int totalAmount = this.amount - MINVALUE;
        if (totalAmount >= amount) {
            this.amount -= amount;
            return true;
        } else {
            System.out.println("Not enough money");
            return false;
        }
    }
}