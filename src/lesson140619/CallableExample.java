package lesson140619;

import lesson140529.Utils;

import java.util.concurrent.*;

public class CallableExample {

    static class Task implements Callable<String>{

        @Override
        public String call() throws Exception {
            Utils.pause(5000);
            return "hello";
        }
    }
    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<String> future = service.submit(new Task()); //Возвращается tracking number

        try {
            System.out.println("waiting for result...");
            String result = future.get();       //ждем когда задача досчитается и получаем рез-т
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }
}
