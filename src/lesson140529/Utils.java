package lesson140529;

import java.util.Scanner;

public class Utils {

    static final Scanner scanner = new Scanner(System.in);

    public static String waitForUserInput(){
        while(!scanner.hasNextLine()){}
        return scanner.nextLine();
    }

    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
