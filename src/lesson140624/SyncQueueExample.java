package lesson140624;

import lesson140529.Utils;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

public class SyncQueueExample {

    public static void main(String[] args) {

        final BlockingQueue<String> queue = new SynchronousQueue<>();
        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("creating thing ");
//                Utils.pause(10000);
                System.out.println("thing is ready");
                try {
                    queue.put("THING");
                    System.out.println("passed thing");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        service.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("doing some other stuff ");
                Utils.pause(10000);
                System.out.println("waiting for thing");
                try {
                    String thing = queue.take();
                    System.out.println("got " + thing);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
