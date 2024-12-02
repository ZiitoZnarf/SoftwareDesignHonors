public class Layer {
    private String flavor;
    private String frosting;


    public Layer (String flavor, String frosting) {
        this.flavor = flavor;
        this.frosting = frosting;
    }

    public String toString() {
        return "Flavor: " + flavor + " | Frosting: " + frosting;
    }
}
