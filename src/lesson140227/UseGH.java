package lesson140227;

/**
 * Created by User on 17.07.2017.
 */
public class UseGH {
    public static void main(String[] args) {
        G g = new G();
        H h = new H();

        g.h = h;
        g.doIt();
    }
}
