import java.util.ArrayList;

/**
 * This Store class is supposed to represent a digital store which different
 * accounts can purchase items from with their account's funds. This class
 * is intentionally not implemented in the best way as it doesn't encapsulate
 * the wat the orderHistory or storeEntries are implemented, and instead allows
 * those with access to this object to have access to these ArrayList objects.
 *
 * @author Christian S.
 * @version 12-3-24
 */
public class Store {
    private ArrayList<StoreEntry> storeEntries;
    private ArrayList<Order> orderHistory;

    /**
     * Creates an instance of Store which has a set of already generated StoreEntries
     * and an empty orderHistory.
     */
    public Store() {
        this.storeEntries = generateStoreEntries();
        this.orderHistory = new ArrayList<>();
    }


    private static ArrayList<StoreEntry> generateStoreEntries() {
        ArrayList<StoreEntry> list = new ArrayList<>();

        list.add(new StoreEntry("Apple", 109, 35, 2.00));
        list.add(new StoreEntry("Bandage", 129, 5, 6.00));
        list.add(new StoreEntry("Pan", 113, 7, 26.50));
        list.add(new StoreEntry("Longsword", 313, 18, 126.50));
        list.add(new StoreEntry("Ticket", 200, 15, 5.00));

        return list;
    }

    /**
     * Returns ArrayList of StoreEntry objects associated with this store
     * @return ArrayList of StoreEntry
     */
    public ArrayList<StoreEntry> getStoreEntries() {
        return storeEntries;
    }

    /**
     * Returns ArrayList of Order objects associated with this store
     * @return ArrayList of Order
     */
    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

}
