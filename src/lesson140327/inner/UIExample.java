package lesson140327.inner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIExample {

    public static void main(String[] args) {
        JFrame  frame = new JFrame("UI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));

        JButton button = new JButton("Click me!");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked!");
            }
        });

        frame.add(panel);
        frame.pack();

        frame.setVisible(true);
    }
}
