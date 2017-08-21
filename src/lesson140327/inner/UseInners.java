package lesson140327.inner;

public class UseInners {

    public static void main(String[] args) {
        S s = new S();
        s = new S();
        s.print();

        A a = new A();
        A.Ai ai = a.new Ai();
        ai.printState();

        B b = new B();
        Bi bi = new Bi(b);
        bi.printState();

        D d = new D();
        d.getPrinter().printState();
    }
}
