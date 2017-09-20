package lesson140617;

import lesson140529.Utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockUnlockMustBeEqual {

    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                getLock();
                getLock();
                getLock();
                System.out.println("haha");
                Utils.pause(3000);
                System.out.println(lock.getHoldCount());    // Количество локов, которое к нему применено.
                System.out.println(lock.getQueueLength());    //Длина очереди ожидающих потоков.
                freeLock();
                freeLock();
                freeLock();
            }
        }).start();

        Utils.pause(1000);

//        lock.unlock();    //IllegalMonitorException нужно вызывать в том жке потоке в котором заблокировали
//        lock.unlock();

        lock.lock();
        try {
            System.out.println("hello there");
        } finally {
            lock.unlock();
        }
    }

    private static void freeLock() {
        lock.unlock();
    }

    private static void getLock() {
        lock.lock();
    }
}
