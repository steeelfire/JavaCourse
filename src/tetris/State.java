package tetris;

public class State {
    public Field field = new Field();
    public Figure figure = Figure.randomFigure();
    public int figureRow;
    public int figureColumn =  field.box[0].length / 2 -
            figure.data[0].length / 2 + 1;

    void moveFigureLeft() {
        figureColumn--;
    }


    public int getFigureColumn() {
        return figureColumn;
    }
}
