package lesson140619;

import lesson140529.Utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

    private static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("hello from "+ Thread.currentThread());
            Utils.pause(5000);
            System.out.println("bye from "+ Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor(); //Однопоточный сервис

        service.execute(new Task());
        service.execute(new Task());

        service.shutdown();
//        service.shutdownNow();
        try {
            service.awaitTermination(1, TimeUnit.HOURS);
            System.out.println("finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
