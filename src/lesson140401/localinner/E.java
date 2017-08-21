package lesson140401.localinner;

public class E {

    int state = 10;

    public I getI(){
        class Local implements I{

            @Override
            public void doIt() {
                System.out.println("I did it locally" + state);
            }
        }
        return new Local();
    }
}
