package lesson140401.localinner;

public class B {

    public I getI(){
        return new OuterI();
    }
}
