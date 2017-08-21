package lesson140325;

/**
 * Created by User on 08.08.2017.
 */
public class UseAB {
    public static void main(String[] args) {
        A a = new A();
        a.changeState();
        System.out.println(a.getState());

        a = new B();
        a.changeState();
        System.out.println(a.getState());

        a = new B2();
        a.changeState();
        System.out.println(a.getState());

        a = new C2();
        a.changeState();
        System.out.println(a.getState());

//        a = null;
//        a.changeState();
//        System.out.println(a.getState());

        changeYourSelf(null);
    }

    public static void changeYourSelf(A a){
        if (a == null){
            //TODO
            System.err.println("a is null");
            return;
        }
        a.changeState();
    }
}
