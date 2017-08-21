package lesson140325;

/**
 * Created by User on 09.08.2017.
 */
public class Hiding {

    public static void main(String[] args) {
        H h = new H();
        System.out.println(h.state);
        h.changeState();
        System.out.println(h.state);
    }
}
