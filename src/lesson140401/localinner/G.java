package lesson140401.localinner;

public class G implements Changeable {
    String state = "";

    @Override
    public void changeState() {
        state = state + "ha";
    }

    @Override
    public Object getState() {
        return state;
    }
}
