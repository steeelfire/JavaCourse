package lesson140325;

/**
 * Created by User on 08.08.2017.
 */
public class B extends A {  //Замещение


    {
        state = 20;
    }

    @Override
    public void changeState() {
        state *= 10;
    }
}
