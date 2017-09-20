package lesson140617;

import lesson140529.Utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    static Lock lock = new ReentrantLock();

    public static void main(final String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    System.out.println("locked");
                    Utils.pause(3000);
                    if (args.length == 0) throw new RuntimeException();
                } finally {
                    lock.unlock();
                }
                System.out.println("unlocked");
            }
        }).start();

        Utils.pause(100);

        lock.lock(); //start of critical section
        //code
        System.out.println("hello there");
        lock.unlock(); //end of crit
    }
}
