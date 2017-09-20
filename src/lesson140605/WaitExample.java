package lesson140605;

import lesson140529.Utils;

public class WaitExample {

    public static void main(String[] args) {
        final Object mutex = new Object();
        final Object mutex2 = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start run");
                synchronized (mutex) {
                    synchronized (mutex2) {
                        System.out.println("locked mutex");
                        try {
                            Utils.pause(5000);
                            System.out.println("before wait");
                            mutex.wait(2000);
                            System.out.println("awoke");
                            Utils.pause(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("unlocked mutex");
            }
        }).start();

        Utils.pause(1000);
        System.out.println("main trying to lock mutex");
        synchronized (mutex2) {
            System.out.println("main locked mutex");
            Utils.pause(3000);
        }
        System.out.println("main unlocked mutex");
    }
}
