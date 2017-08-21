package lesson140320;

/**
 * Created by User on 08.08.2017.
 */
public class UseA {

    public static void main(String[] args) {
        System.out.println(A.class.getName());

        A a = new A(10);
        A a2 = new A(20);

        System.out.println(a.state);
        System.out.println(a2.state);

//        a.state = 30;         ERROR Final!

    }
}
