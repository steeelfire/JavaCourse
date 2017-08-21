package lesson140401.localinner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UIExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("UI Example 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));

        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked!" + e.getX() + "," + e.getY());

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Pressed!" + e.getX() + "," + e.getY());

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Released!" + e.getX() + "," + e.getY());

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("exited");
            }
        });

        panel.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("dragged!" + e.getX() + "," + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("moved!" + e.getX() + "," + e.getY());
            }
        });

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("wheel!" + e.getX() + "," + e.getY());

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked button " + e.getButton());
            }
        });
        frame.add(panel);
        frame.pack();

        frame.setVisible(true);
    }
}
