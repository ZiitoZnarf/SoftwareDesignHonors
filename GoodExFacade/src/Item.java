/**
 * Represents an item which may be stored in an Account object's
 * inventory.
 *
 * @author Christian S.
 * @version 12-3-24
 */
public class Item {
    private String name;

    /**
     * Creates a new instance of the Item object with the item's name
     * @param name name of the item
     */
    public Item (String name) {
        this.name = name;
    }

    /**
     * Returns the name of the item
     * @return String name
     */
    public String getName() {
        return this.name;
    }
}
