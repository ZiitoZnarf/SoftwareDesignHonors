/**
 * An interface to represent that an object is able to
 * have the cloneItem() method, which returns a deep copy
 * of the referenced object.
 */
public interface Prototype {

    /**
     * Returns a new instance of the original object that
     * is a deep copy of this object.
     * @return Prototype deep copy
     */
    public Prototype cloneItem();
}
