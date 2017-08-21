package lesson140327.inner;

public class Bi {

    private B _b;

    public Bi(B b) {

        _b = b;
    }

    public void printState(){
        System.out.println(_b.state);
    }
}
