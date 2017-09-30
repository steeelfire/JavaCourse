package tetris;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Tetris {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setup graphics
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 700));


        frame.add(panel);

        frame.pack();
        frame.setVisible(true);


        Graphics2D graphics = (Graphics2D) panel.getGraphics();

        Model model = new Model();
        View view = new View(graphics);
        final Controller controller = new Controller(model, view);
        view.setEventProcessor(controller);


        frame.addKeyListener(view);

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                controller.slideDownOneRow();
            }
        },0,1, TimeUnit.SECONDS);
    }
}
