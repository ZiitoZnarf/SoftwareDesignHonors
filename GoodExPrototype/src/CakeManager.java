import java.util.ArrayList;

public class CakeManager {

    private ArrayList<Cake> orderedCakes;

    public CakeManager() {
        orderedCakes = new ArrayList<>();
    }

    public static Cake[] getStoredCakes() {
        Cake[] cakes = new Cake[3];
        cakes[0] = new Cake("Chocolate", "Chocolate", "Happy Choco Day!!");
        cakes[0].changeShape("Circle");

        cakes[1] = new Cake("Lemon", "Vanilla", "Forever");
        cakes[1].changeShape("Circle");
        cakes[1].changeTopper("Bride and Groom");
        cakes[1].addLayer("Lemon", "Strawberry");
        cakes[1].addLayer("Strawberry", "Vanilla");

        cakes[2] = new Cake("Red Velvet", "Cream Cheese", "");
        cakes[2].addLayer("Red Velvet", "Cream Cheese");
        cakes[2].addLayer("Red Velvet", "Cream Cheese");

        return cakes;
    }

    public void orderCake(Cake cake) {
        orderedCakes.add(cake);
    }

    public static void main(String[] args) {
        CakeManager cakeManager = new CakeManager();

        //Display All stored Cakes
        Cake[] cakes = getStoredCakes();
        cakes[0].displayCake();
        System.out.println();

        cakes[1].displayCake();
        System.out.println();

        cakes[2].displayCake();
        System.out.println();

        //Show old cake information
        System.out.println("Information for second Cake:");
        cakes[1].showCakeInfo();
        System.out.println();


        Cake newCake = cakes[1].cloneItem();


        System.out.println("Recreated Cake: ");
        newCake.displayCake();
        System.out.println();
        newCake.showCakeInfo();

        cakeManager.orderCake(newCake);

    }
}
