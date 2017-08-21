package lesson140408.exceptions;

import java.util.Scanner;

public class UseClosable {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Start Enter something");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            System.out.println("finished");
        }
    }
}
