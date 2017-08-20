package lesson140415.Invoke;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RobotControlPanel {

    public static void main(String[] args) {

        System.out.println("start");

        SimpleRobot robot = new SimpleRobot();

        Robot2d r2d2 = new Robot2d(100,100);

        DispatcheR dispatcheR = new DispatcheR();
        dispatcheR.add(robot);
        dispatcheR.add(r2d2);

        ControlCenter center = new ControlCenter(dispatcheR);

        new Thread(center).start();

        startKeyboardInterface(center);

        startGraphics(r2d2);
    }

    private static void startGraphics(Robot2d robot) {
        JFrame frame = new JFrame("Robot Control Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        robot.setPreferredSize(new Dimension(600,600));
        frame.add(robot);

        frame.pack();
        frame.setVisible(true);

        while(true){

            robot.repaint();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void startKeyboardInterface(final CommandListener listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                try {
                    while (scanner.hasNextLine()) {  //Ctrl + D
                        String command = scanner.nextLine();
                        listener.command(command);
                    }
                }finally{
                   if (scanner != null){
                       scanner.close();
                   }
                }
            }
        }).start();
    }

}
