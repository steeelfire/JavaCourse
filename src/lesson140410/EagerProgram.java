package lesson140410;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class EagerProgram {

    static class Data{
        int[] state = new int[10000];
    }

    public static void main(String[] args) {

        System.out.println("start");
        while (true){
            work();
            rest();
        }
    }

    private static void work() {
        for (int i = 0; i < 10000; i++) {
            Data d = new Data();
            process(d);
        }
    }

    private static void process(Data d) {
        Random r = new Random();
        for (int i = 0; i < d.state.length; i++) {
            d.state[i] = r.nextInt();
        }
    }

    private static void rest() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
