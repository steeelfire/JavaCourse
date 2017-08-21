package lesson140401.localinner;

public class F {

    int state = 30;

    public I getI(){
        return new I() {
            @Override
            public void doIt() {
                System.out.println("I did it annonymously" + state);
            }
        };
    }
}
