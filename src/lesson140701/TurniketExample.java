package lesson140701;

import lesson140529.Utils;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class TurniketExample {

    static AtomicInteger counter = new AtomicInteger(0);

    static class Turniket implements Runnable {

        @Override
        public void run() {
            Random random = new Random();
            while (true) {
//                Utils.pause(2000 + random.nextInt(3000));
                Utils.pause(2000);
//                counter++;
//                int tmp = counter;  //LOAD
//                int tmp2 = tmp + 1; //INC
//                counter = tmp2;     //STOR

                int currentValue = counter.incrementAndGet();
                System.out.println(Thread.currentThread().getName() + ": " + counter);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Thread(new Turniket()).start();
        }

    }
}
