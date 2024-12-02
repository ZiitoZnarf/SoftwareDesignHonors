import java.util.ArrayList;

public class Store {
    private ArrayList<StoreEntry> storeEntries;
    private ArrayList<Order> orderHistory;

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

    public void subtractEntryStock(int itemId, int quantity) {
        for (int i = 0; i < storeEntries.size(); i++) {
            StoreEntry curr = storeEntries.get(i);
            if (itemId == curr.getId()) {
                curr.setQuantity(curr.getQuantity() - quantity);
                return;
            }
        }
    }

    public ArrayList<StoreEntry> getStoreEntries() {
        return storeEntries;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    }

}
