package tetris;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class View extends KeyAdapter{
    private static final int CELL_SIZE = 30;
    private Graphics2D _graphics;
    private EventProcessor _processor;

    public View(Graphics2D graphics) {

        _graphics = graphics;
    }

    public void setEventProcessor(EventProcessor processor){

        _processor = processor;
    }

    public void updateState(State state) {
        _graphics.clearRect(0,0,400,700);
        _graphics.setColor(Color.black);
        _graphics.fillRect(state.getFigureColumn() * CELL_SIZE, state.getFigureRow() * CELL_SIZE,CELL_SIZE,CELL_SIZE);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
            _processor.moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            _processor.moveRight();
        }
    }
}
