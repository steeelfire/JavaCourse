package lesson140605;

import lesson140529.Utils;

public class InterruptExamples {

    static class SleepingTask implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println("we were interrupted!");
            }
        }
    }

    static class WorkingTask implements Runnable {

        @Override
        public void run() {
            long counter = 0;
            int interruptions = 0;
            while (true) {
                counter++;
                if (Thread.interrupted()) {
                    interruptions++;
                    System.out.println("interrupted "+ interruptions);
                    if (interruptions > 2) {
                        break;
                    }
                }
            }
            System.out.println("we were interrupted!" + counter);
        }
    }

    public static void main(String[] args) {
        System.out.println("start");

        Thread thread = new Thread(new SleepingTask());
        thread.start();

        Utils.pause(3000);
        thread.interrupt();

        thread = new Thread(new WorkingTask());
        thread.start();

        Utils.pause(3000);
        thread.interrupt();
        Utils.pause(2000);
        thread.interrupt();
        Utils.pause(1000);
        thread.interrupt();


    }
}
