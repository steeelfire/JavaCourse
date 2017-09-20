package lesson140603;

public class Counter {

    private int counter;

    public void inc(){
        synchronized (this){   //mutex - mutual exclusion - взаимное исключение
            counter++;
            System.out.println(Thread.currentThread().getName() + ": "+counter);
        }
    }

    synchronized public void mul(){
            counter*=2;
    }
    public int get(){
        return counter;
    }
}
