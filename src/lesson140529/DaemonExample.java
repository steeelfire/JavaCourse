package lesson140529;

import java.util.Random;

public class DaemonExample {

    static int stock = 0;

    public static void main(String[] args) {

        System.out.println("start");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();

                while (true) {
                    stock = random.nextInt(1000);
                    Utils.pause(1000);
                }
            }
        });
        t.setDaemon(true);
        t.start();

        for (int i = 0; i < 10; i++) {
            Utils.pause(2000);
            System.out.println("stock = " + stock);
        }

        System.out.println("stop");
    }
}
