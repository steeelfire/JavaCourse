package lesson140415.Invoke;

import javax.swing.*;
import java.awt.*;

public class Robot2d extends JPanel implements Robot {

    private static final int DY = 10;
    private static final int DX = 10;
    private int _x;
    private int _y;

    public Robot2d(int x, int y) {
        _x = x;
        _y = y;
    }

    public int getX() {
        return _x;
    }

    public int getY() {
        return _y;
    }

    @Override
    public void up() {
        _y -= DY;
    }

    @Override
    public void down() {
        _y += DY;
    }

    @Override
    public void left() {
        _x -= DX;
    }

    @Override
    public void right() {
        _x += DX;
    }

    @Override
    public void stop() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fillOval(_x,_y,30,30);
    }
}
