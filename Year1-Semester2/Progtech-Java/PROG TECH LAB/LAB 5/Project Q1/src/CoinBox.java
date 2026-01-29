public class CoinBox {
    private final int value;
    private int amount;

    public CoinBox(int value, int amount) {
        this.value = value;
        this.amount = amount;
    }

    public int getValue() {
        return value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}