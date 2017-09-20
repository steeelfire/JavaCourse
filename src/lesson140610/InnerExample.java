package lesson140610;

public class InnerExample {

    static class A{

        class B{

        }
    }

    public static void main(String[] args) {

        A a = new A();
        A.B ab = a.new B();
    }
}
