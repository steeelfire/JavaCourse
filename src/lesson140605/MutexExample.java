package lesson140605;

import lesson140529.Utils;

public class MutexExample {

    private Object mutex = new Object();    //monitor

    void a() {
        System.out.println("start a");
        synchronized (mutex) {
            System.out.println("locked mutex in a");
            Utils.pause(50000);
            System.out.println("unlocked mutex in a");
        }
        System.out.println("finish a");

    }
    void b(){
        System.out.println("start b");
        synchronized (mutex){
            System.out.println("locked mutex in b");
            Utils.pause(50000);
            System.out.println("unlocked mutex in b");
        }
        System.out.println("finish b");
    }

    public static void main(String[] args) {
        final MutexExample me = new MutexExample();

        new Thread(new Runnable() {
            @Override
            public void run() {
                me.a();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                me.b();             //Starvation
            }
        }).start();
    }
}
