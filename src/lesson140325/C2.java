package lesson140325;

/**
 * Created by User on 08.08.2017.
 */
public class C2 extends B2{
    @Override
    public void changeState(int amount) {
        System.out.println("c2");
        state = 0;
    }
}
