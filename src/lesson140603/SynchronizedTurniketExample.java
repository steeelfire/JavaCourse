package lesson140603;

import lesson140529.Utils;

import java.util.Random;

public class SynchronizedTurniketExample {

    static Counter counter = new Counter();
    static int c2;

    synchronized static void intCounter(){

        c2++;
    }

    static void intCounter2(){
        synchronized (SynchronizedTurniketExample.class){
            c2++;
        }
    }

    static class Turniket implements Runnable{

        @Override
        public void run() {
            Random random = new Random();
            while(true){
//                Utils.pause(2000 + random.nextInt(3000));
                Utils.pause(2000);
                counter.inc();
                int tmp = counter.get();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Thread(new Turniket()).start();
        }

    }
}
