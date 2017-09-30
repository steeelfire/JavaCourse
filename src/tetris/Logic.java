package tetris;

public class Logic {
    public State state;

    public Logic(State state) {

        this.state = state;
    }

    public void moveLeft() {
        if (state.getFigureColumn() == 0){
            return;
        }
        state.moveFigureLeft();
    }

    public void moveRight() {
    }

    public void rotate() {
    }

    public void dropDown() {
    }

    public void slideDownOneRow() {
    }
}
