import java.util.ArrayList;

/**
 * This ItemOrderingFacade class is meant to work as an interface
 * for the user or client to interact with. It provides a single simple
 * method that the user can call in order to add more items to a certain
 * account, given that the item exists, is in high enough stock, and that
 * the account has enough funds. It handles all the improperly designed
 * classes so that the client/user doesn't have to.
 *
 * @author Christian S.
 * @version 12-3-24
 */
public class ItemOrderingFacade {
    private Store theStore;
    private ArrayList<Account> accounts;

    /**
     * Instantiates ItemOrderingFacade with a base instance of a
     * Store object and a collection of Account objects.
     */
    public ItemOrderingFacade() {
        theStore = new Store();
        accounts = new ArrayList<>();
    }

    private void addAccount(String name) {
        accounts.add(new Account(name));
    }

    /**
     * This function will take an Account and attempt to take items from the
     * Store that will be added to the Account object's inventory. If the provided
     * item does not exist, there is not enough of it in stock, or the respective
     * Account doesn't have enough funds to purchase the number of items requested,
     * then the purchase will fail, and the user will receive a message explaining why.
     *
     * @param itemName Name of item to be ordered
     * @param quantity How many of the item to be ordered
     * @param accountName Name of the Account ordering the item (will
     *                    create a new account if one doesn't exist)
     * @return Boolean (true = items ordered successfully; false = items not ordered)
     */
    public boolean orderItem(String itemName, int quantity, String accountName) {
        Account theAccount = getAccountByName(accountName);

        if (theAccount == null) {
            addAccount("Julian");
            theAccount = getAccountByName(accountName);
        }

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
            System.out.println("Error: Item not found");
            return false;
        }

        //Make sure the item has a high enough quantity to be purchased
        if (itemRef.getQuantity() < quantity) {
            System.out.println("Error: Item stock too low");
            return false;
        }

        //Make sure the account has enough available funds
        if (theAccount.getBalance() < (itemRef.getPrice() * quantity)) {
            System.out.println("Error: Insufficient account funds");
            return false;
        }

        //Subtract the Accounts available funds
        theAccount.setBalance(theAccount.getBalance() - (itemRef.getPrice() * quantity));

        //Subtract the value from the stores quantity
        itemRef.setQuantity(itemRef.getQuantity() - quantity);

        //Create order in the store orderHistory
        theStore.getOrderHistory().add(new Order(theAccount.getName(), itemRef.getId(),
                quantity, quantity * itemRef.getPrice()));

        //Add the items to the account inventory
        for (int i = 0; i < quantity; i++) {
            theAccount.addItem(new Item(itemName));
        }


        System.out.println("Success: Items purchased and added to account\n");
        displayAccountInventory(accountName);
        return true;
    }

    private Account getAccountByName(String name) {
        for (int i = 0; i < accounts.size(); i++) {
            if (name.equals(accounts.get(i).getName())) {
                return accounts.get(i);
            }
        }

        return null;
    }

    private void displayAccountInventory(String name) {
        Account acc = getAccountByName(name);
        if (acc != null)
            acc.displayInventory();
    }
}
