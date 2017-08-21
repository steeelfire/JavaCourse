package lesson140325;

/**
 * Created by User on 08.08.2017.
 */
public class B2 extends A{  //Уточнение

    {
        state = 20;
    }
    @Override
    public void changeState() {
        state /= 2;
        myChangeState(100); //
        state *=3;
    }

    @Override
    public void changeState(int amount) {
        myChangeState(amount);
    }

    private void myChangeState(int amount) {
        System.out.println("b2");
        state -= amount;
    }
}
