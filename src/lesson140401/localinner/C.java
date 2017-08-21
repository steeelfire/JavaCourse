package lesson140401.localinner;

public class C {

    public I getI(){
        return new StaticInner();
    }

    private class StaticInner implements I {
        @Override
        public void doIt() {
            System.out.printf("I did it inner statically");
        }
    }
}
