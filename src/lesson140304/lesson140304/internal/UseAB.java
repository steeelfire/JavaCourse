package lesson140304.lesson140304.internal;

//import lesson140304.A;
import lesson140304.*;
import lesson140304.A;

import java.util.LinkedList;

/**
 * Created by User on 18.07.2017.
 */
public class UseAB {

    public static void main(String[] args) {

//        lesson140304.A a = new lesson140304.A();
        A a = new A();
//        B b;  ERROR
        a.doIt ();

        ComplexState cs = new ComplexState();
        cs.state2 = 100;

        Counter counter = new Counter();

        counter.count++;
        System.out.println("write to log current count" + counter);

        counter.count++;
        System.out.println("write to log current count" + counter);

        counter.count++;
        System.out.println("write to log current count" + counter);


        System.out.println(counter.count);
        counter.count++;
        System.out.println("write to log current count" + counter);

        counter.count++;
        System.out.println("write to log current count" + counter);

        counter.count++;
        System.out.println("write to log current count" + counter);

        System.out.println(counter.count);

        counter.inc();
        counter.inc();
        counter.get();
        counter.inc();
        counter.inc();
        counter.get();

        LinkedList<String> list = new LinkedList<>();

    }
}
