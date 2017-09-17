package lesson140529;

public class ThreadExamples {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
            }
        }.start();

        new Thread(new Task()).start();
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread());
        };
    }
}
