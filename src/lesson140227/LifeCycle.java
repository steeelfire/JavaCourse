package lesson140227;

import java.util.concurrent.TimeUnit;

/**
 * Created by User on 17.07.2017.
 */
public class LifeCycle {

    static class A{
        {
            System.out.println("created");
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("destroyed");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        A[] arrayOfA = new A[10000000];
        for (int i = 0; i < 10000000; i++) {
            arrayOfA[i] = new A();
            if(i>0){
                arrayOfA[i-1] = null;
            }
        }
//        System.gc();
//        TimeUnit.SECONDS.sleep(10);
    }
}
