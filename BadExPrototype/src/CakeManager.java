import java.util.ArrayList;

/**
 * An interface for simulating management of a system in which you can order
 * cakes that you have designed. Also includes some template cakes which you
 * can view
 *
 * @author Christian S.
 * @version 12-2-24
 *
 */
public class CakeManager {

    private ArrayList<Cake> orderedCakes;

    /**
     * Initializes CakeManager as well as its list of stored cakes
     */
    public CakeManager() {
        orderedCakes = new ArrayList<>();
    }

    /**
     * Provides an array of template Cake objects.
     * @return the array of Cake objects
     */
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

    /**
     * Adds the cake to the CakeManagers list of ordered Cakes.
     * @param cake the cake object to be ordered
     */
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


        //Recreate stored cake manually after looking at information
        Cake newCake = new Cake("Lemon", "Vanilla", "Forever");
        newCake.changeShape("Circle");
        newCake.changeTopper("Bride and Groom");
        newCake.addLayer("Lemon", "Strawberry");
        newCake.addLayer("Strawberry", "Vanilla");


        System.out.println("Recreated Cake: ");
        newCake.displayCake();
        System.out.println();
        newCake.showCakeInfo();

        cakeManager.orderCake(newCake);

    }
}
