package lesson140304;

/**
 * Created by User on 18.07.2017.
 */
public class ComplexState {

    private int state1 = 10;
    public int state2 = 5;

    public int getState1() {
        return state1;
    }

    public void setState1(int state1) {
        this.state1 = state1;
    }

    public int getState2() {
        return state2;
    }

    public void setState2(int state2) {
        if (state2 > state1){
            return;
        }
        this.state2 = state2;
    }
}
