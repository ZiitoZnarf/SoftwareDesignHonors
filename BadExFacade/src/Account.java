import java.util.ArrayList;

public class Account {
    private String name;
    private double balance;
    private ArrayList<Item> inventory;

    public Account(String name) {
        this.name = name;
        this.balance = 100.00;
        this.inventory = new ArrayList<>();
    }

    public void displayInventory() {
        System.out.println("Inventory for " + this.name + ":");
        System.out.print("[");

        for(int i = 0; i < inventory.size(); i++) {
            System.out.print(inventory.get(i).getName());
            if (i != (inventory.size() - 1)) {
                System.out.print(", ");
            }
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.println("]");
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addItem(Item item) {
        this.inventory.add(item);
    }

    public String getName() {
        return name;
    }
}
