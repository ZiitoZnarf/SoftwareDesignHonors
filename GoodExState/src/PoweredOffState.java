import java.util.Scanner;

/**
 * This PoweredOffState is meant to represent a Train object that is currently not in use and powered off
 * This class also implements what methods are able to execute while in this state.
 *
 * @author Christian S.
 * @version 12-7-24
 */
public class PoweredOffState extends TrainState{

    /**
     * Initializes a PoweredOffState object that references the provided Train object (to change state and speed data).
     * @param train The train that this state is for.
     */
    public PoweredOffState(Train train) {
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

    @Override
    public void closeDoors() {

    }

    @Override
    public void shutOffTrainPower() {

    }

    /**
     * Will allow the train to move into the Stopped State.
     */
    @Override
    public void turnOnTrainPower() {
        this.train.setState(new StoppedState(this.train));
        System.out.println("The train's power has been turned on.");
    }

    @Override
    public void useHorn() {

    }

    @Override
    public void setTargetSpeed(Scanner scan) {

    }

    @Override
    public void emergencyBrake() {

    }
}
