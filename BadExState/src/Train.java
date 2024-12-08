import java.util.Scanner;

/**
 * This train class is meant to represent a real life train which is able to travel along tracks, stop at stations
 * or other locations, board and disembark passengers, and power off when not in use. It keeps track of its own state
 * and executes each method in the class based on that state.
 *
 * @author Chrstian S.
 * @version 12-7-24
 */
public class Train {
    private String state;
    private int targetSpeed;

    /**
     * Initializes a Train object in the PoweredOff state and with a target speed of 40.
     */
    public Train() {
        this.state = "PoweredOff";
        this.targetSpeed = 40;
    }

    /**
     * Will allow the train to move into the Travelling State if currently in the stopped state.
     */
    public void accelerate() {
        if (state.equals("Stopped")) {
            this.state = "Travelling";
            System.out.println("The train has begun travelling at a target speed: " + targetSpeed);
        }
    }

    /**
     * Will allow the train to move into the Stopped state if it is currently in the travelling state.
     */
    public void applyBrakes() {
        if (state.equals("Travelling")) {
            this.state = "Stopped";
            System.out.println("The train slowly came to a stop.");
        }
    }

    /**
     * Will allow the train to move into the boarding state if it is currently in the Stopped state.
     */
    public void openDoors() {
        if (state.equals("Stopped")) {
            this.state = "Boarding";
            System.out.println("The train is now available for disembarking and boarding.");
        }
    }

    /**
     * Will allow the train to move into the Stopped state if it is currently in the Boarding state.
     */
    public void closeDoors() {
        if (state.equals("Boarding")) {
            this.state = "Stopped";
            System.out.println("The train is no longer available for disembarking and boarding.");
        }
    }

    /**
     * Will allow the train to move into the PoweredOff state if currently in the Stopped state.
     */
    public void shutOffTrainPower() {
        if (state.equals("Stopped")) {
            this.state = "PoweredOff";
            System.out.println("The train has been powered off.");
        }
    }

    /**
     * Will allow the train to move into the Stopped State if it is currently in the PoweredOff state.
     */
    public void turnOnTrainPower() {
        if (state.equals("PoweredOff")) {
            this.state = "Stopped";
            System.out.println("The train's power has been turned on.");
        }
    }

    /**
     * Will allow the train to honk its horn as long as it is not in the PoweredOff State.
     */
    public void useHorn() {
        if (state.equals("Stopped") || state.equals("Boarding") || state.equals("Travelling")) {
            System.out.println("WHOOOOOOOOOOT!!!   WHOOOOOOOOOOOOOOOOOOT!!!");
        }
    }

    /**
     * Will allow the train to change the target travelling speed as long as it is not currently in the
     * PoweredOff state.
     * @param scan Scanner input parameter to gather the new target speed.
     */
    public void setTargetSpeed(Scanner scan) {
        if (state.equals("Stopped") || state.equals("Boarding") || state.equals("Travelling")) {
            System.out.print("Please Select a Target Speed: ");
            int inputSpeed = scan.nextInt();
            scan.nextLine();
            System.out.println();

            this.targetSpeed = inputSpeed;
            System.out.println("Target Speed has been set to " + targetSpeed);
            if (state.equals("Travelling")) {
                System.out.println("Train will now adjust current speed to match this.");
            }
        }
    }

    /**
     * Will allow the train to move into the Stopped state with urgency if it is currently in the
     * travelling state.
     */
    public void emergencyBrake() {
        if (state.equals("Travelling")) {
            this.state = "Stopped";
            System.out.println("The train SCREEEEEECHED!!! to a stop very quickly.");
        }
    }
}
