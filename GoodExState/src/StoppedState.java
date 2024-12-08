import java.util.Scanner;

/**
 * This StoppedState class is meant to represent the Train object stopped at a station with its doors closed, preventing
 * passengers to board or disembark from the train. This class also implements what methods are able to execute while
 * in this state.
 *
 * @author Christian S.
 * @version 12-7-24
 */
public class StoppedState extends TrainState{

    /**
     * Initializes a StoppedState object that references the provided Train object (to change state and speed data).
     * @param train The train that this state is for.
     */
    public StoppedState(Train train) {
        super(train);
    }

    /**
     * Will allow the train to move into the Travelling State.
     */
    @Override
    public void accelerate() {
        this.train.setState(new TravellingState(this.train));
        System.out.println("The train has begun travelling at a target speed: " + this.train.getTargetSpeed());
    }

    @Override
    public void applyBrakes() {

    }

    /**
     * Will allow the train to move into the boarding state.
     */
    @Override
    public void openDoors() {
        this.train.setState(new BoardingState(this.train));
        System.out.println("The train is now available for disembarking and boarding.");
    }

    @Override
    public void closeDoors() {

    }

    /**
     * Will allow the train to move into the PoweredOff state.
     */
    @Override
    public void shutOffTrainPower() {
        this.train.setState(new PoweredOffState(this.train));
        System.out.println("The train has been powered off.");
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
    }

    @Override
    public void emergencyBrake() {

    }
}
