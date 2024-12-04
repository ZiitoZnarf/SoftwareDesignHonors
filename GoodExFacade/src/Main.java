/**
 * This version of Main for the program is much smaller than for the
 * Bad Example. This is supposed to represent the client/user, and
 * shows how a Facade can make something seem much simpler to do. The
 * client now has far less access to things in the system, and has
 * far fewer options on what they can now do, but the intended functionality
 * is now much simpler to execute.
 *
 * @author Christian S.
 * @version 12-3-24
 */
public class Main {
    public static void main(String[] args) {
        ItemOrderingFacade storeInterface = new ItemOrderingFacade();


        String accountName = "Julian";
        String itemName = "Bandage";
        int itemQuantity = 3;


        //One Single Accessible Command
        //Much less freedom of how to execute things, but much easier to do
        storeInterface.orderItem(itemName, itemQuantity, accountName);


    }
}
