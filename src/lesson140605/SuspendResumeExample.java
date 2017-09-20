package lesson140605;

import lesson140529.Utils;

public class SuspendResumeExample {

    public static void main(String[] args) {

        System.out.println("start");

        final Object mutex = new Object();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long counter = 0;
                synchronized (mutex) {
                    while (true) {
                        Utils.pause(1000);
                        System.out.println("working");
                    }
                }
            }
        });

        thread.start();
        Utils.pause(2000);
        System.out.println("trying to lock mutex");
        synchronized (mutex) {
            System.out.println("before");
        thread.suspend();
            Utils.pause(20000);
            System.out.println("after");
        }
        thread.resume();
    }
}
