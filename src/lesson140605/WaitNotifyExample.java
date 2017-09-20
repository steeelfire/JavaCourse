package lesson140605;

import lesson140529.Utils;

import java.util.Random;

public class WaitNotifyExample {

    static String meal;

    static Object bell = new Object();

    static String[] menu = {"Steak", "Pasta", "IceCream", "Soup"};

    static class Cook implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                int pause = 1000 + random.nextInt(1000);
                Utils.pause(pause);
                String readyMeal = menu[random.nextInt(menu.length)];
                System.out.println("Cook: " + readyMeal);
                synchronized (bell) {
                    meal = readyMeal;
                    bell.notify();
                }
            }
        }
    }

    static class Waiter implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (bell) {
                    while (meal == null) {
                        try {
                            bell.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    String readyMeal = meal;
                    meal = null;
                    System.out.println("Waiter: got " + readyMeal);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new Cook()).start();
        new Thread(new Waiter()).start();
    }
}
