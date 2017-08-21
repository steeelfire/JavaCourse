package lesson140401.localinner;

public class L {

    interface Changer{
        void changeState();
    }

    int state;

    public Changer getChanger(final int changeAmount){
        class MyChanger implements Changer{
//            static int counter;

//            static int get(){
//
//            }
            final static int MAX = 10;
            @Override
            public void changeState() {
                state += changeAmount;
            }
        }
        return new MyChanger();

    }

    public Changer getAnotherChanger(){

        final int amount = 90;

        return new Changer(){
//            static int counter;
            int changeAmount;

            {
                changeAmount = amount;
            }
            @Override
            public void changeState() {
                state += changeAmount;
            }
        };

    }

    public static void main(String[] args) {
        L l = new L();
        Changer changer = l.getChanger(30);
        changer.changeState();
        System.out.println(l.state);

        l.getAnotherChanger().changeState();
        System.out.println(l.state);
    }

}
