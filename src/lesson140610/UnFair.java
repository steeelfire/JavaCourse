package lesson140610;

import lesson140529.Utils;

public class UnFair {

    final static Object mutex = new Object();

    static class Task implements Runnable {

        @Override
        public void run() {
            synchronized (mutex) {
                System.out.println(Thread.currentThread());
            }
        }
    }

    public static void main(String[] args) {
        synchronized (mutex) {
            new Thread(new Task()).start();
            Utils.pause(1000);
            new Thread(new Task()).start();
            Utils.pause(1000);  
            new Thread(new Task()).start();
            Utils.pause(1000);
        }


        synchronized (mutex) {
            mutex.notifyAll();
        }
    }
}
