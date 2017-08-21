package lesson140327.inner;

/**
 * Created by User on 09.08.2017.
 */
public class S {

    private final Si si;

    private static int counter;

    private static int getCounter(){
        return counter;
    }
    static class Si{

        public void print(){
            System.out.println("static inner, counter = " + getCounter());
//            System.out.println(state);    ERROR!!!
        }
    }

    int state;

    public S() {
        counter++;
        si = new Si();
    }

    public int getState(){
        return state;
    }

    public void print(){
        si.print();
    }
}
