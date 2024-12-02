public class StoreEntry {
    private String name;
    private int id;
    private int quantity;
    private double price;

    public StoreEntry (String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
