public class Counter {
    private String[] buttons;
    private int count;

    public Counter() {
        count = 0;
        buttons = new String[]{"+1", "-1", "C", "+10", "-10", "Reset Counter to Zero", "X", "+"};
    }

    public void pushButton(int button) {
        switch (button) {
            case 1:
                count = count + 1;
                break;
            case 2:
                count = count - 1;
                break;
            case 3:
                count = 0;
                break;
            case 4:
                count = count + 10;
                break;
            case 5:
                count = count - 10;
                break;
            case 6:
                count = 0;
                break;
            case 7:
                count = 0;
                break;
            case 8:
                count = count + 1;
                break;
        }
    }

    public String getCounterDisplay() {
        String output = "";
        output += "====================\n";
        output += "|Counter| " + String.format("%8d", count) + " |\n";
        output += "====================";
        return output;
    }

    public String getButtons() {
        String output = "";

        for (int i = 0; i < buttons.length; i++) {
            output += "[" + buttons[i] + "] <--- " + (i+1) + "\n";
        }

        return output;
    }
}
