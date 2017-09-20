package lesson140617;

//Из Java_140303_05


import lesson140529.Utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEfficiencyExample {

    static class Task implements Runnable {

        private boolean stop;
        final private Lock mutex = new ReentrantLock();

        public boolean isStopped() {
            mutex.lock();
            try {
                return stop;

            } finally {
                mutex.unlock();
            }
        }  //data race

        @Override
        public void run() {
            long counter = 0;
            while (!isStopped()) {
                counter++;
            }
            System.out.println(counter);
        }

        public void stop() {
            mutex.lock();
            try {
                stop = true;

            } finally {
                mutex.unlock();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("start");

        Task task = new Task();
        new Thread(task).start();

        Utils.pause(3000);

        task.stop();
    }
}
