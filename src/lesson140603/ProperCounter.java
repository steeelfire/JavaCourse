package lesson140603;

public class ProperCounter {

    private int counter;
    private Object mutex = new Object();

    public void inc(){
        synchronized (mutex){
            counter++;
        }
    }

    public int get(){
        synchronized (mutex){
            return counter;
        }
    }
}
