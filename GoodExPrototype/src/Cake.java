import java.util.ArrayList;

/**
 * A Cake object, which is able to store basic information about a cake with
 * at least one layer, and up to as many layers as desired.
 *
 * @author Christian S.
 * @version 12-2-24
 */
public class Cake implements Prototype{
    private ArrayList<Layer> layers;
    private String text;
    private String shape;
    private String topper;

    /**
     * Constructs a Rectangular cake with a single layer that has no
     * topper.
     *
     * @param flavor the flavor of the 1st layer
     * @param frosting the frosting of the 1st layer
     * @param text the text on top of the cake
     */
    public Cake (String flavor, String frosting, String text) {
        this.text = text;
        this.layers = new ArrayList<>();
        this.layers.add(new Layer(flavor, frosting));

        this.shape = "Rectangle";
        this.topper = "None";
    }

    /**
     * Adds a layer on top of all the lower layers of the cake.
     *
     * @param flavor the flavor of the new layer
     * @param frosting the frosting of the new layer
     */
    public void addLayer(String flavor, String frosting) {
        this.layers.add(new Layer(flavor, frosting));
    }

    /**
     * Changes the shape of the cake.
     * @param shape
     */
    public void changeShape(String shape) {
        this.shape = shape;
    }

    /**
     * Changes the text of the cake.
     * @param text
     */
    public void changeText(String text) {
        this.text = text;
    }

    /**
     * Changes the cake's topper.
     * @param topper
     */
    public void changeTopper(String topper) {
        this.topper = topper;
    }

    /**
     * Prints all the cake's layers and their respective flavors
     * to the console.
     */
    public void displayCake() {

        for (int i = this.layers.size() -1; i >= 0; i--) {
            System.out.println("Layer " + (i+1) + ": [" + layers.get(i) + "]");
        }
    }

    /**
     * Prints the cake's text, shape, topper, and number of layers
     * to the console
     */
    public void showCakeInfo() {
        System.out.println("Text: " + text);
        System.out.println("Shape: " + shape);
        System.out.println("Topper: " + topper);
        System.out.println("Layers: " + layers.size());
    }

    /**
     * Returns a new instance of a Cake object that is a deep
     * copy of this object. Has the same layers, text, shape, and topper.
     * @return Cake deep copy
     */
    public Cake cloneItem() {
        Cake newCake = new Cake("", "", "");
        newCake.text = this.text;
        newCake.shape = this.shape;
        newCake.topper = this.topper;

        newCake.layers.set(0, this.layers.getFirst().cloneItem());

        for (int i = 1; i < this.layers.size(); i++) {
            newCake.layers.add(this.layers.get(i).cloneItem());
        }

        return newCake;
    }
}
