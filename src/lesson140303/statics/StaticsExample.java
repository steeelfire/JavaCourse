package lesson140303.statics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 19.07.2017.
 */
public class StaticsExample {

    public static final int MAX_NUMBERS = 10;

    public static void main(String[] args) throws InterruptedException {
        int ints[] = new int[MAX_NUMBERS];

        System.out.println("objects created: "+A.getCount());
        A a = new A();
        System.out.println(a.id);
        a = new A();
        System.out.println(a.id);
        a = new A();
        System.out.println(a.id);
        a = new A();
        System.out.println(a.id);

//        System.out.println(A.objectCount);
        System.out.println("objects created: "+A.getCount());

        Class c = A.class;
//        c = a.getClass();
        System.out.println(c.getName());

        for (Method method : c.getMethods()) {
            System.out.println(method.getName());
        }
        for (Field field :
                c.getFields()){
            System.out.println(field.getName());

        }
//        Singleton singleton = new Singleton(); ERROR

        Singleton.report();
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Singlton state is" + Singleton.get().getState());
        System.out.println("Singlton state is" + Singleton.get().getState());
        System.out.println("Singlton state is" + Singleton.get().getState());
    }
}
