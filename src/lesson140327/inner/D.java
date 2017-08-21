package lesson140327.inner;

public class D {

    int state = 50;

    public Printer getPrinter(){
        return new Printer(){

            @Override
            public void printState() {
                System.out.println(state);
            }
        };
    }
}
