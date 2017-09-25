package lesson140624;

import lesson140529.Utils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {    //курок, спусковой крючок

    static class Runner implements Runnable{

        private CountDownLatch _latch;

        public Runner(CountDownLatch latch) {
            _latch = latch;
        }

        @Override
        public void run() {
            try {
                System.out.println(this + " is ready");
                _latch.await();
                long currentTimeMillis = System.nanoTime();
                System.out.println(this +"(" + Thread.currentThread().getName() + ")" + " has started at "+ currentTimeMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        CountDownLatch latch = new CountDownLatch(3);

        service.execute(new Runner(latch));
        service.execute(new Runner(latch));
        service.execute(new Runner(latch));
        service.execute(new Runner(latch));

        System.out.println("----");

        Utils.pause(3000);

        System.out.println("на старт!..");
        latch.countDown();

        Utils.pause(2000);

        System.out.println("внимание!..");
        latch.countDown();

        Utils.pause(2000);

        System.out.println("марш!..");
        latch.countDown();
    }
}
