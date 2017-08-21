package lesson140325;

/**
 * Created by User on 09.08.2017.
 */
public class Overload {

    int state;

    public void changeState(int amount){
        state+=amount;
    }

    public void changeState(boolean positive){
        if (positive){
            state++;
        }else {
            state--;
        }
    }

    public void changeState(boolean positive, int amount ){
        if (positive){
            state += amount;
        }else {
            state -= amount;
        }

    }
    public void changeState(int amount, boolean product){
        if (product){
            state *= amount;
        }else {
            state /= amount;
        }

    }
}
