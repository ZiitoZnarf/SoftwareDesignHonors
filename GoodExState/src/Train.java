import java.util.Scanner;

/**
 * This train class is meant to represent a real life train which is able to travel along tracks, stop at stations
 * or other locations, board and disembark passengers, and power off when not in use. It keeps track of its own TrainState
 * object and will execute the TrainState object's respective methods when this Train's methods are called.
 *
 * @author Chrstian S.
 * @version 12-7-24
 */
public class Train {
    private TrainState state;
    private int targetSpeed;

    /**
     * Initializes a Train object int the PoweredOffState state and with a target speed of 40.
     */
    public Train() {
        this.state = new PoweredOffState(this);
        this.targetSpeed = 40;
    }

    /**
     * Calls the accelerate() method in this Train object's current state.
     */
    public void accelerate() {
        state.accelerate();
    }

    /**
     * Calls the applyBrakes() method in this Train object's current state.
     */
    public void applyBrakes() {
        state.applyBrakes();
    }

    /**
     * Calls the openDoors() method in this Train object's current state.
     */
    public void openDoors() {
        state.openDoors();
    }

    /**
     * Calls the closeDoors() method in this Train object's current state.
     */
    public void closeDoors() {
        state.closeDoors();
    }

    /**
     * Calls the shutOffTrainPower() method in this Train object's current state.
     */
    public void shutOffTrainPower() {
        state.shutOffTrainPower();
    }

    /**
     * Calls the turnOnTrainPower() method in this Train object's current state.
     */
    public void turnOnTrainPower() {
        state.turnOnTrainPower();
    }

    /**
     * Calls the useHorn() method in this Train object's current state.
     */
    public void useHorn() {
        state.useHorn();
    }

    /**
     * Calls the setTargetSpeed() method in this Train object's current state.
     */
    public void setTargetSpeed(Scanner scan) {
        state.setTargetSpeed(scan);
    }

    /**
     * Calls the emergencyBrake() method in this Train object's current state.
     */
    public void emergencyBrake() {
        state.emergencyBrake();
    }

    /**
     * Sets this Train object's current state to a new TrainState object.
     * @param state The TrainState object to represent the new Train's state.
     */
    public void setState(TrainState state) {
        this.state = state;
    }

    /**
     * Sets the target speed for travelling in this Train object to a new value.
     * @param speed The new target speed.
     */
    public void setTargetSpeed(int speed) {
        this.targetSpeed = speed;
    }

    /**
     * Returns this Train object's current target speed.
     * @return int (target speed)
     */
    public int getTargetSpeed() {
        return targetSpeed;
    }
}
