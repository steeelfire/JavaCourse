/**
 * Created by User on 01.08.2017.
 */
public class Recursive {
    public static void main(String[] args) {

        doIt();
    }

    private static void doIt() {
        try {
            System.out.println("did it");
        } finally {

        }
        doIt();
    }
}
