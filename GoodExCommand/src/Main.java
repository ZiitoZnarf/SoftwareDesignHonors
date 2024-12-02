import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 1;
        Counter counter = new Counter();

        while (input != -1) {
            System.out.println(counter.getCounterDisplay());
            System.out.println(counter.getButtons());

            System.out.print("Select a Button to Push: ");
            input = scan.nextInt();
            counter.pushButton(input);

            System.out.print("\n\n");
        }
    }


}
