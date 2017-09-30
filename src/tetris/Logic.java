package tetris;

public class Logic implements EventProcessor {
    public State state;

    public Logic(State state) {

        this.state = state;
    }

    @Override
    public void moveLeft() {
        if (state.hasConflictWhenShifted(0,-1)){
            return;
        }
        state.moveFigureLeft();
    }

    @Override
    public void moveRight() {
        if (state.hasConflictWhenShifted(0,1)){
            return;
        }
        state.moveFigureRight();
    }

    @Override
    public void rotate() {
    }

    @Override
    public void dropDown() {
    }

    @Override
    public void slideDownOneRow() {
        if (state.hasConflictWhenShifted(1,0)){
            state.pasteFigure();
            state.newFigure();

            return;
        }
        state.slideDown();
    }
}
