import java.util.Scanner;

/**
 * This TravellingState class is meant to represent the Train object currently in transit, preventing passengers from
 * boarding or disembarking from the train, and preventing the train from being powered off while in motion. This
 * class also implements what methods are able to execute while in this state.
 *
 * @author Christian S.
 * @version 12-7-24
 */
public class TravellingState extends TrainState{

    /**
     * Initializes a TravellingState object that references the provided Train object (to change state and speed data).
     * @param train The train that this state is for.
     */
    public TravellingState(Train train) {
        super(train);
    }

    @Override
    public void accelerate() {

    }

    /**
     * Will allow the train to move into the Stopped state.
     */
    @Override
    public void applyBrakes() {
        this.train.setState(new StoppedState(this.train));
        System.out.println("The train slowly came to a stop.");
    }

    @Override
    public void openDoors() {

    }

    @Override
    public void closeDoors() {

    }

    @Override
    public void shutOffTrainPower() {

    }

    @Override
    public void turnOnTrainPower() {

    }

    /**
     * Will allow the train to honk its horn.
     */
    @Override
    public void useHorn() {
        System.out.println("WHOOOOOOOOOOT!!!   WHOOOOOOOOOOOOOOOOOOT!!!");
    }

    /**
     * Will allow the train to change the target travelling speed.
     * @param scan Scanner input parameter to gather the new target speed.
     */
    @Override
    public void setTargetSpeed(Scanner scan) {
        System.out.print("Please Select a Target Speed: ");
        int inputSpeed = scan.nextInt();
        scan.nextLine();
        System.out.println();

        this.train.setTargetSpeed(inputSpeed);
        System.out.println("Target Speed has been set to " + inputSpeed);
        System.out.println("Train will now adjust current speed to match this.");
    }

    /**
     * Will allow the train to move into the Stopped state with urgency.
     */
    @Override
    public void emergencyBrake() {
        this.train.setState(new StoppedState(this.train));
        System.out.println("The train SCREEEEEECHED!!! to a stop very quickly.");
    }
}
