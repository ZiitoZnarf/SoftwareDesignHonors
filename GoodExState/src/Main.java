import java.util.Scanner;

/**
 * This Main class is meant to represent someone activating controls on a train interface. In this program
 * it is used to help show the state machine of the Train class.
 *
 * @author Christian S.
 * @version 12-7-24
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Train theTrain = new Train();

        String input = "-1";
        while (!input.toLowerCase().equals("q")) {
            System.out.println("\nWelcome to the Train interface, your train is currently powered off, please select an option below.");
            System.out.println("[1] Accelerate         [2] Apply Brakes                [3] Open Doors\n" +
                               "[4] Close Doors        [5] Shut Off Train Power        [6] Turn On Train Power\n" +
                               "[7] Use Horn           [8] Set Target Speed            [9] Apply EMERGENCY BRAKE");

            System.out.print("\n> ");

            input = scan.nextLine();
            System.out.println();



            switch(input) {
                case "1":
                    theTrain.accelerate();
                    break;
                case "2":
                    theTrain.applyBrakes();
                    break;
                case "3":
                    theTrain.openDoors();
                    break;
                case "4":
                    theTrain.closeDoors();
                    break;
                case "5":
                    theTrain.shutOffTrainPower();
                    break;
                case "6":
                    theTrain.turnOnTrainPower();
                    break;
                case "7":
                    theTrain.useHorn();
                    break;
                case "8":
                    theTrain.setTargetSpeed(scan);
                    break;
                case "9":
                    theTrain.emergencyBrake();
                    break;
            }
        }
    }
}
