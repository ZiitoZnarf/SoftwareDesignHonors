import java.util.ArrayList;

public class Cake implements Prototype{
    private ArrayList<Layer> layers;
    private String text;
    private String shape;
    private String topper;

    public Cake (String flavor, String frosting, String text) {
        this.text = text;
        this.layers = new ArrayList<>();
        this.layers.add(new Layer(flavor, frosting));

        this.shape = "Rectangle";
        this.topper = "None";
    }

    public void addLayer(String flavor, String frosting) {
        this.layers.add(new Layer(flavor, frosting));
    }

    public void changeShape(String shape) {
        this.shape = shape;
    }

    public void changeText(String text) {
        this.text = text;
    }

    public void changeTopper(String topper) {
        this.topper = topper;
    }

    public void displayCake() {

        for (int i = this.layers.size() -1; i >= 0; i--) {
            System.out.println("Layer " + (i+1) + ": [" + layers.get(i) + "]");
        }
    }

    public void showCakeInfo() {
        System.out.println("Text: " + text);
        System.out.println("Shape: " + shape);
        System.out.println("Topper: " + topper);
        System.out.println("Layers: " + layers.size());
    }

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
