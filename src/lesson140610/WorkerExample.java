package lesson140610;

import lesson140529.Utils;

public class WorkerExample {

    public static void main(String[] args) {
        System.out.println("start");

//        PrimitiveWorker primitiveWorker = new PrimitiveWorker();
        Worker primitiveWorker = new Worker();

        primitiveWorker.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from " + Thread.currentThread());
            }
        });

        primitiveWorker.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Another Hello from " + Thread.currentThread());
            }
        });

        class Task implements Runnable{

            @Override
            public void run() {
                System.out.println("start task");
                Utils.pause(5000);
                System.out.println("finish task");
                throw new RuntimeException();
            }
        }

        System.out.println("Task 1");
        primitiveWorker.execute(new Task());
        Utils.pause(100);
        System.out.println("Task 2");
        primitiveWorker.execute(new Task());
        System.out.println("finished");

        primitiveWorker.shutdown();
    }
}
