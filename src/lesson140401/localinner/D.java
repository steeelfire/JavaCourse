package lesson140401.localinner;

public class D {

    int state;
    public I getI(){
        return new Inner();
    }

    private class Inner implements I {
        @Override
        public void doIt() {
            System.out.println("I did it from inside" + state);
        }
    }
}
