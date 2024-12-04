import java.util.ArrayList;

/**
 * Represents the account of a user, which holds their name, balance,
 * and inventory.
 *
 * @author Christian S.
 * @version 12-3-2024
 */
public class Account {
    private String name;
    private double balance;
    private ArrayList<Item> inventory;

    /**
     * Creates an instance of an Account with a given user's name.
     * Also initializes an empty inventory and a starting balance
     * of 100.00.
     * @param name The Account user's name
     */
    public Account(String name) {
        this.name = name;
        this.balance = 100.00;
        this.inventory = new ArrayList<>();
    }

    /**
     * Prints the Account object's inventory to the console. The
     * Account object's name is displayed before the inventory.
     * Then the inventory opens with a '[' and closes with a ']' while
     * individual item names are separated by ', ' and there is a new line
     * character for each 5 items that are displayed.
     */
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

    /**
     * Set the Account balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Get the current Account balance
     * @return double (balance)
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adds an item to the end of the Account object's inventory
     * @param item Item to be added
     */
    public void addItem(Item item) {
        this.inventory.add(item);
    }

    /**
     * Get the name of the Account
     * @return String (name)
     */
    public String getName() {
        return name;
    }
}
