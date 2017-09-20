package lesson140610;

import lesson140529.Utils;

import java.util.Scanner;

public class NotifyAllExample {

    static final Object mutex = new Object();

    static class Task implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is trying to lock mutex");
            synchronized (mutex) {
                System.out.println(Thread.currentThread().getName() + " locked mutex");
                try {
                    mutex.wait();
                    System.out.println(Thread.currentThread().getName() + " was woken");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        Task task = new Task();

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();

        Utils.waitForUserInput();

        System.out.println("1 before locking mutex");

        synchronized (mutex) {
            System.out.println("2 mutex locked");
            Utils.waitForUserInput();
            mutex.notifyAll();
            System.out.println("3 notified");
            Utils.waitForUserInput();
        }
        System.out.println("4 unlocked mutex");
    }
}
