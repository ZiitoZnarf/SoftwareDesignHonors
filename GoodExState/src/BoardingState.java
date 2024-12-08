import java.util.Scanner;

/**
 * This BoardingState class is meant to represent the Train object stopped at a station with its doors open, allowing
 * passengers to board or disembark from the train. This class also implements what methods are able to execute while
 * in this state.
 *
 * @author Christian S.
 * @version 12-7-24
 */
public class BoardingState extends TrainState{

    /**
     * Initializes a BoardingState object that references the provided Train object (to change state and speed data).
     * @param train The train that this state is for.
     */
    public BoardingState(Train train) {
        super(train);
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void applyBrakes() {

    }

    @Override
    public void openDoors() {

    }

    /**
     * Will allow the train to move into the Stopped state.
     */
    @Override
    public void closeDoors() {
        this.train.setState(new StoppedState(this.train));
        System.out.println("The train is no longer available for disembarking and boarding.");
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
    }

    @Override
    public void emergencyBrake() {

    }
}
