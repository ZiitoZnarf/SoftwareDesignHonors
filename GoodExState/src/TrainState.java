import java.util.Scanner;

/**
 * This TrainState class is meant to represent a state for the Train object. This class also outlines the different
 * methods that individual states may or may not implement.
 *
 * @author Christian S.
 * @version 12-7-24
 */
public abstract class TrainState {
    protected Train train;

    /**
     * Initializes a TrainState object that references the provided Train object (to change state and speed data).
     * @param train The train that this state is for.
     */
    public TrainState (Train train) {
        this.train = train;
    }

    public abstract void accelerate();
    public abstract void applyBrakes();
    public abstract void openDoors();
    public abstract void closeDoors();
    public abstract void shutOffTrainPower();
    public abstract void turnOnTrainPower();
    public abstract void useHorn();
    public abstract void setTargetSpeed(Scanner scan);
    public abstract void emergencyBrake();
}
