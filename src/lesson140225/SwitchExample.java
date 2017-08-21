package lesson140225;

/**
 * Created by User on 13.07.2017.
 */
public class SwitchExample {

    public static final int DIFF = 30;
    public static final int POW = 40;
    public static final int PROD = 20;
    public static final int OLD_SUM = 1;
    public static final int SUM = 10;

    public static void main(String[] args) {
        int[] program = {OLD_SUM, SUM, PROD, PROD, 12, POW};

        for (int command:program) {
            doCommand(command);

        }
    }

    private static void doCommand(int command) {
        switch (command) {
            case OLD_SUM:
            case SUM:
                System.out.println("SUM");
                break;
            case PROD:
                System.out.println("PROD");
                break;
            case DIFF:
                System.out.println("DIF");
                break;
            case POW:
                System.out.println("POW");
                break;
            default:
                System.out.println("unknown command");
        }
        System.out.println("---");
    }
}
