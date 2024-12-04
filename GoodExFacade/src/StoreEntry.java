/**
 * The StoreEntry class represents a purchasable item that can be stored
 * in a Store object.
 *
 * @author Christian S.
 * @version 12-3-24
 */
public class StoreEntry {
    private String name;
    private int id;
    private int quantity;
    private double price;

    /**
     * Instantiates a StoreEntry object with all the given parameters
     *
     * @param name the item name (should be unique for this Store)
     * @param id the entry id (should be unique for this Store)
     * @param quantity the available quantity of this item in the store
     * @param price the price of a single item of this type
     */
    public StoreEntry (String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Change the current item quantity/stock of this entry
     * @param newQuantity The new item quantity
     */
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    /**
     * Get the item name
     * @return String (name)
     */
    public String getName() {
        return name;
    }

    /**
     * Get the entry id
     * @return int (id)
     */
    public int getId() {
        return id;
    }

    /**
     * Get the current quantity/stock of this item
     * @return int (quantity)
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Get the price per one quantity of item for this entry
     * @return double (price)
     */
    public double getPrice() {
        return price;
    }
}
