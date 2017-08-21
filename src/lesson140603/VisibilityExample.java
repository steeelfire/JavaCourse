package lesson140603;


import sun.plugin.com.Utils;

/**
 * Created by User on 18.07.2017.
 */
public class VisibilityExample {

    static class Task implements Runnable{
        boolean stop;

        public void run(){
            while(!stop){
                System.out.println("working..");

            }
        }
    }
}
