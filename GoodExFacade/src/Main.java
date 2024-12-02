public class Main {
    public static void main(String[] args) {
        ItemOrderingFacade storeInterface = new ItemOrderingFacade();


        String accountName = "Julian";
        String itemName = "Bandage";
        int itemQuantity = 3;


        //One Single Allowed Command
        //Much less freedom of how to execute things, but much easier to do
        storeInterface.orderItem(itemName, itemQuantity, accountName);




    }
}
