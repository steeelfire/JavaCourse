package tetris;

public class Controller implements ModelListener, EventProcessor {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        model.setListener(this);
    }

    @Override
    public void updateState(State state) {
        view.updateState(state);
    }

    @Override
    public void moveLeft() {
        model.moveLeft();
    }

    @Override
    public void moveRight() {
        model.moveRight();
    }

    @Override
    public void rotate() {
        model.rotate();
    }

    @Override
    public void dropDown() {
        model.dropDown();
    }

    @Override
    public void slideDownOneRow() {
        model.slideDownOneRow();
    }
}
