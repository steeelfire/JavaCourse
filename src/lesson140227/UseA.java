package lesson140227;

/**
 * Created by User on 17.07.2017.
 */
public class UseA {
    public static void main(String[] args) {

        int i = 0;
       A a = new A();    //instance

        a.changeState();

        System.out.println(a.state);
//        System.out.println(a);


        A a2 = new A(10);

        a2.changeState();
        a2.changeState();

        System.out.println(a2.state);
//        System.out.println(a2);

        A a3 = a;
        System.out.println(a3);
        a3.changeState();
        System.out.println(a.state);

        A a4 = null;
//        System.out.println(a4);
        //a4.changeState();

        if (a4 != null){
            a4.changeState();
        }
    }
    void useA(A a){
        if (a == null){
            return;
        }
        //do something
        a.changeState();
    }
}
