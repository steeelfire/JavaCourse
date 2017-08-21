package lesson140303.statics;

/**
 * Created by User on 20.07.2017.
 */
public class Singleton {

    //lazy instantiation

    private static Singleton instance;

    public static Singleton get(){

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    static int count = 0;

    public static void report(){
        System.out.println("Objects of singltone: "+count);
    }

    int state = 0;

    {
        count++;
        System.out.println("I am object number" + count);
        state = count;
    }
    private Singleton(){

    }
    public int getState(){
        return state;
    }
}
