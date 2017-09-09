package lesson140506;

public class Ex2 {
    static class MyEx1 extends Exception{
    }
    static class MyEx2 extends Exception{

    }

    void m(int k) throws Exception{
        switch (k){
        case 0:
        throw new ArithmeticException();
        case 1:
        throw new ArithmeticException();
        }
    }
}
