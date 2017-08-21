package lesson140325;

/**
 * Created by User on 08.08.2017.
 */
public class A implements Changeable{

    int state;

    public int getState(){
        return state;
    }

    public void changeState(){
        System.out.println("a");
        state += 10;
    }
    public void changeState(int amount){
        state += amount;
    }
}
