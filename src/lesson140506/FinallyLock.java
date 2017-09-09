package lesson140506;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyLock {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        try{

        }finally {
            if (lock != null) {
                lock.unlock();
            }
        }
    }
}
