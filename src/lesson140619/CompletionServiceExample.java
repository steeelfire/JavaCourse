package lesson140619;

import lesson140529.Utils;

import java.util.Random;
import java.util.concurrent.*;

public class CompletionServiceExample {

    static class Task implements Callable<String> {

        private int _id;
        private int _millis;

        public Task(int id, int millis) {

            _id = id;
            _millis = millis;
        }


        @Override
        public String call() throws Exception {
            Utils.pause(_millis);
            return _id + " - " + _millis;
        }
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();  //Резиновый


        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<String>(service); //Обертка над реальным исполнителем
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            completionService.submit(new Task(i, random.nextInt(7000) + 3000));
        }
        for (int i = 0; i < 10; i++) {
            try {
                Future<String> future = completionService.take();
                try {
                    System.out.println(future.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
