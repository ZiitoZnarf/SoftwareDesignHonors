import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store theStore = new Store();

        Account theAccount = new Account("Julian");
        String itemName = "Bandage";
        int itemQuantity = 3;

        theAccount.displayInventory();

        //Get All Store Entries
        ArrayList<StoreEntry> entryList = theStore.getStoreEntries();

        //Find the ID for the given store entry
        StoreEntry itemRef = null;

        for (int i = 0; i < entryList.size(); i++) {
            if (entryList.get(i).getName().equals(itemName)) {
                itemRef = entryList.get(i);
                break;
            }
        }

        //Make sure the Item exists
        if (itemRef == null) {
            return;
        }

        //Make sure the item has a high enough quantity to be purchased
        if (itemRef.getQuantity() < itemQuantity) {
            return;
        }

        //Make sure the account has enough available funds
        if (theAccount.getBalance() < (itemRef.getPrice() * itemQuantity)) {
            return;
        }

        //Subtract the Accounts available funds
        theAccount.setBalance(theAccount.getBalance() - (itemRef.getPrice() * itemQuantity));

        //Subtract the value from the stores quantity
        itemRef.setQuantity(itemRef.getQuantity() - itemQuantity);

        //Create order in the store orderHistory
        theStore.getOrderHistory().add(new Order(theAccount.getName(), itemRef.getId(),
                itemQuantity, itemQuantity * itemRef.getPrice()));

        //Add the items to the account inventory
        for (int i = 0; i < itemQuantity; i++) {
            theAccount.addItem(new Item(itemName));
        }

        //Show newly added inventory item
        theAccount.displayInventory();

    }
}