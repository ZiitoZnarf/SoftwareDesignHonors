/**
 * Represents a record of a purchase order from the Store object. Meant
 * to be used as an order history for the Store object.
 *
 * @author Christian S.
 * @version 12-3-24
 */
public class Order {
    private String playerName;
    private int itemId;
    private int quantityPurchased;
    private double totalCost;

    /**
     *
     * @param playerName Account's name that item was purchased for
     * @param itemId id of StoreEntry object
     * @param quantityPurchased how many of this item were purchased
     * @param totalCost cost of item multiplied by quantityPurchased
     */
    public Order(String playerName, int itemId, int quantityPurchased, double totalCost) {
        this.playerName = playerName;
        this.itemId = itemId;
        this.quantityPurchased = quantityPurchased;
        this.totalCost = totalCost;
    }

    /**
     * Returns Account object's name associated with this Order
     * @return String (Account name)
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Returns id of the StoreEntry for this order
     * @return int (StoreEntry id)
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * Returns quantity purchased of the StoreEntry for this order
     * @return int (quantity)
     */
    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    /**
     * Returns total cost of this Order
     * @return double (StoreEntry cost * quantityPurchased)
     */
    public double getTotalCost() {
        return totalCost;
    }
}
