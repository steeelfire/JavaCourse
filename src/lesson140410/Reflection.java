package lesson140410;

public class Reflection {

    interface I{

    }
    static class A implements I{

    }
    static class B{

    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        Object o = a;

        System.out.println(String.valueOf(o instanceof A));
        System.out.println(String.valueOf(o instanceof Object));
        System.out.println(o instanceof I);
        System.out.println();
        System.out.println(String.valueOf(o.getClass() == A.class));
        System.out.println(o.getClass() == Object.class);
        System.out.println(o.getClass() == I.class);
        System.out.println();
        System.out.println(o.getClass().isAssignableFrom(A.class));
        System.out.println(o.getClass().isAssignableFrom(Object.class));
        System.out.println(o.getClass().isAssignableFrom(I.class));
        System.out.println();
        System.out.println(A.class.isAssignableFrom(A.class));
        System.out.println(A.class.isAssignableFrom(Object.class));
        System.out.println(A.class.isAssignableFrom(I.class));
        System.out.println();

        try {
            A a2 = A.class.newInstance();
            System.out.println(a2.getClass().getSimpleName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Object o2 = create(A.class);
        System.out.println(o2.getClass().getName());

        try {
            Class bClass = Class.forName("lesson140410.Reflection$B");
            Object o3 = create(bClass);
            System.out.println(o3.getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Object create (Class clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
