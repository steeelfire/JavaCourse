package lesson140306.inheritance;

import lesson140306.D;

/**
 * Created by User on 20.07.2017.
 */
public class TestInheritance {

    public static void main(String[] args) {

        A a = new A(10);
        System.out.println(a.getState());
        a.changeState();
        System.out.println(a.getState());

        B b = new B();
        b.printState();
        b.setState(40);
        b.changeState();
        b.printState();

        D d = new D();
        d.printState();

    }
}
