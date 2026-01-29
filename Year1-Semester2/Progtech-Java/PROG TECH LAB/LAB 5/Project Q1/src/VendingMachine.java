import java.util.ArrayList;

public class VendingMachine {
    private final ArrayList<DrinkBox> drinkList = new ArrayList<>();
    private final ArrayList<CoinBox> coinList = new ArrayList<>();
    private int revenue;

    public VendingMachine() {
        drinkList.add(new DrinkBox("Coke", 13, 2));
        drinkList.add(new DrinkBox("Sprite", 13, 2));
        drinkList.add(new DrinkBox("GreenTea", 20, 2));
        drinkList.add(new DrinkBox("Water", 10, 2));
        drinkList.add(new DrinkBox("MinuteMaid", 18, 2));
        drinkList.add(new DrinkBox("Pepsi", 13, 2));
        drinkList.add(new DrinkBox("Vitamilk", 15, 2));
        drinkList.add(new DrinkBox("RootBeer", 13, 2));

        coinList.add(new CoinBox(1, 20));
        coinList.add(new CoinBox(2, 20));
        coinList.add(new CoinBox(5, 10));
        coinList.add(new CoinBox(10, 0));
    }

    public String buy(String name, Card c) {
        for (DrinkBox drink : drinkList) {
            if (name.equals(drink.getName())) {
                if (drink.getAmount() > 0) {
                    if (c.getAmount() >= 10) {
                        if (c.getCardID() <= 100 && c.getCardID() >= 1) {
                            if (c.pay(drink.getPrice())) {
                                int sell = drink.getAmount() - 1;
                                drink.setAmount(sell);
                                revenue += drink.getPrice();
                                return "Thank you";
                            }
                        } else {
                            return "Invalid card";
                        }
                    } else {
                        return "Not enough money";
                    }
                } else {
                    return "Out of stock";
                }
            }
        }
        return "Drink not found";
    }

    public String buy(String name, ArrayList<Integer> coinValue) {
        int totalCoinValue = 0;
        for (Integer values : coinValue) {
            totalCoinValue += values;
        }
        for (DrinkBox drink : drinkList) {
            if (name.equals(drink.getName())) {
                if (drink.getAmount() > 0) {
                    if ((totalCoinValue) == drink.getPrice()) {
                        int sell = drink.getAmount() - 1;
                        drink.setAmount(sell);
                        revenue += drink.getPrice();
                        return "Thank you";
                    } else if (totalCoinValue < drink.getPrice()) {
                        return "Not enough money";
                    } else {
                        int change = totalCoinValue - drink.getPrice();
                        if (giveChange(change)) {
                            int sell = drink.getAmount() - 1;
                            drink.setAmount(sell);
                            revenue += drink.getPrice();
                            System.out.println("Your coin change: " + change);
                            return "Thank you";
                        } else {
                            return "Cannot give change";
                        }
                    }
                } else {
                    return "Out of stock";
                }
            }
        }
        return "Drink not found";
    }

    public void endOfDayProcess() {
        for (DrinkBox drink : drinkList) {
            drink.setAmount(drink.getAmount());
        }
        for (CoinBox coin : coinList) {
            coin.setAmount(coin.getAmount());
        }
        revenue = 0;
    }

    public String toString() {
        StringBuilder detail = new StringBuilder();
        StringBuilder coinBox = new StringBuilder();
        System.out.println("**********************");
        for (DrinkBox drink : drinkList) {
            String name = drink.getName();
            int price = drink.getPrice();
            int amount = drink.getAmount();
            detail.append(name).append(" ").append(price).append(" ").append(amount).append("\n");
        }
        for (CoinBox coin : coinList) {
            int coinValue = coin.getValue();
            int coinAmount = coin.getAmount();
            coinBox.append("Coin: ").append(coinValue).append(" ").append("Amount: ").append(coinAmount).append("\n");
        }
        System.out.println(detail);
        return coinBox.toString();
    }

    public int getRevenue() {
        return revenue;
    }

    public String getDrinkDetail() {
        StringBuilder detail = new StringBuilder();
        System.out.println("**********************");
        for (DrinkBox drink : drinkList) {
            String name = drink.getName();
            int price = drink.getPrice();
            int amount = drink.getAmount();
            detail.append(name).append(" ").append(price).append(" ").append(amount).append("\n");
        }
        return detail.toString();
    }

    private boolean giveChange(int change) {
        ArrayList<CoinBox> sortedCoin = new ArrayList<>(coinList);
        sortedCoin.sort((c1, c2) -> c2.getValue() - c1.getValue());
        for (CoinBox coin : sortedCoin) {
            int coinValue = coin.getValue();
            int coinAmount = coin.getAmount();

            int coinsToGive = change / coinValue;
            if (coinsToGive > coinAmount) {
                coinsToGive = coinAmount;
            }
            if (coinsToGive > 0) {
                change -= coinValue * coinsToGive;
                coin.setAmount(coinAmount - coinsToGive);
            }
            if (change == 0) {
                return true;
            }
        }
        return false;
    }
}