package lesson140320;

/**
 * Created by User on 08.08.2017.
 */
public class A {

    final static int MAX = 20;
    final static int MAX2;

    final int state;    //immutable

    static {
        MAX2 = 10;
        System.out.println("static one");
    }

    {
//        state = 10;
        System.out.println("one");
    }

    A(int initialState){
        System.out.println("constructor");
        state = initialState;
    }
    {
        System.out.println("two");
    }

    static {
        System.out.println("static two");
    }

}
