package lesson140325;

/**
 * Created by User on 08.08.2017.
 */
public class UseDE {

    public static void main(String[] args) {

        D d = new D();
        E e = new E();
        A a = new A();

        use(d);
        use(e);
        use(a);
        use(new C2());
    }

    private static void use(Changeable object) {
        object.changeState();
//        if (object instanceof D){
//            D d = (D)object;
//            d.changeState();
//            return;
//        }
//        if (object instanceof E){
//            E e = (E)object;
//            e.changeState();
//            return;
//        }
//        if (object instanceof A){
//            A a = (A)object;
//            a.changeState();
//            return;
//        }
    }
}
