package lesson140610;

import lesson140529.Utils;

public class AlwaysBlocking {

    static final Object mutex = new Object();

    public static void main(String[] args) {

        System.out.println("start");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("start heavy duty");
                synchronized (mutex){
                    while(true){

                    }
                }
            }
        }).start();

        Utils.pause(1000);

        System.out.println("trying to lock mutex");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (mutex){
                    System.out.println("hello there");
                }
            }
        });

        thread.start();

        Utils.pause(1000);

        thread.interrupt();
        thread.stop();
    }
}
