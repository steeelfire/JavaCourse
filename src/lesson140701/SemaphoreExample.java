package lesson140701;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    static class Counter {
        volatile int count;
        final Semaphore sem = new Semaphore(1);

        public int get() {
            return count;
        }

        public void inc(){
                sem.acquireUninterruptibly();
            try {
                count++;
            } finally{
                sem.release();
            }
            count++;
        }
    }
}
