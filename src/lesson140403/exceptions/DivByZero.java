package lesson140403.exceptions;

public class DivByZero {

    public static void main(String[] args) {

        if (args.length != 2){
            System.out.println("usage DiveByZero <number1> <number2>");
            System.exit(0);
        }

        processArgs(args);
    }

    private static void processArgs(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        int result = divide(number1, number2);

        System.out.println(result);
    }
    private static int divide(int number1, int number2){
        return number1 / number2;
    }
}
