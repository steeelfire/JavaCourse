package lesson140617;

import lesson140529.Utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AvoidBlockingExample {

    static final Lock mutex = new ReentrantLock();

    public static void main(String[] args) {

        System.out.println("start");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start heavy duty");

                mutex.lock();
                try {
                    while (true) {

                    }
                } finally {
                    mutex.unlock();
                }

            }
        }, "heavy job").start();

        Utils.pause(1000);

        System.out.println("trying to lock mutex");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    mutex.lockInterruptibly();
                    try {
                        System.out.println("hello there");
                    } finally {
                        mutex.unlock();
                    }
                } catch (InterruptedException e) {
                    System.out.println("we were interrupted");
                }

            }
        }, "second thread");

        thread.start();

        Utils.pause(1000);

        System.out.println("interrupt");
        thread.interrupt();
//        System.out.println("stop");
//        thread.stop();
    }
}
