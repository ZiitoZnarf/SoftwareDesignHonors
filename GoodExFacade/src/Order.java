
public class Order {
    private String playerName;
    private int itemId;
    private int quantityPurchased;
    private double totalCost;

    public Order(String playerName, int itemId, int quantityPurchased, double totalCost) {
        this.playerName = playerName;
        this.itemId = itemId;
        this.quantityPurchased = quantityPurchased;
        this.totalCost = totalCost;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
