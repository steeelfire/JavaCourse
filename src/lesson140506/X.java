package lesson140506;

public class X {

    int i = 10;
    class A{

        void m(){
           X x = X.this;
        }
    }

    static void m(){
//        int a = 10;

    }

    public static void main(String[] args) {
        X x = new X();
        x.i = 20;

    }
}
