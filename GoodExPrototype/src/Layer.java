/**
 * Represents a layer with a frosting and a flavor. Intended to be used in
 * a Cake object
 *
 * @author Christian S.
 * @version 12-2-24
 */
public class Layer implements Prototype {
    private String flavor;
    private String frosting;

    /**
     * Creates a new layer with the provided flavor and frosting.
     * @param flavor the flavor of the new layer
     * @param frosting the frosting of the new layer
     */
    public Layer (String flavor, String frosting) {
        this.flavor = flavor;
        this.frosting = frosting;
    }


    /**
     * Returns this layer represented as a string in the format of
     * "Flavor: [flavor] | Frosting: [frosting]"
     * @return String
     */
    public String toString() {
        return "Flavor: " + flavor + " | Frosting: " + frosting;
    }

    /**
     * Returns a new instance of a Layer object that has the
     * same flavor and frosting as this Layer object.
     * @return Layer deep copy
     */
    public Layer cloneItem() {

        return new Layer(this.flavor, this.frosting);
    }
}
