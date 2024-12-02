import java.util.ArrayList;

public class ItemOrderingFacade {
    private Store theStore;
    private ArrayList<Account> accounts;

    public ItemOrderingFacade() {
        theStore = new Store();
        accounts = new ArrayList<>();
    }

    private void addAccount(String name) {
        accounts.add(new Account(name));
    }

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
