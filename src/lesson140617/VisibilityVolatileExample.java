package lesson140617;

//Из Java_140303_05


import lesson140529.Utils;

public class VisibilityVolatileExample {

    static class Task implements Runnable{

        volatile private long stop;

        public boolean isStopped(){
            return stop==Long.MAX_VALUE;
        }  //data race

        @Override
        public void run() {
            long counter = 0;
            while(!isStopped()){
                counter++;
            }
            System.out.println(counter);
        }
        public void stop(){
            stop = Long.MAX_VALUE;
        }
    }

    public static void main(String[] args) {

        System.out.println("start");

        Task task = new Task();
        new Thread(task).start();

        Utils.pause(3000);

        task.stop();
    }
}
