package lesson140304;

/**
 * Created by User on 18.07.2017.
 */
public class Counter {

    public int count;
    public void inc(){
        count++;
        System.out.println("write new count: "+count);
    }
    public int get(){
        System.out.println("get current count: " + count);
        return count;
    }

}
