package lesson140605;

import lesson140529.Utils;

public class Deadlock {

    static Object fork = new Object();
    static Object knife = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (fork){
                    Utils.pause(1000);
                    synchronized (knife){
                        System.out.println("first person is eating");
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (fork){
                    Utils.pause(1000);
                    synchronized (knife){
                        System.out.println("second person is eating");
                    }
                }
            }
        }).start();
    }
}
