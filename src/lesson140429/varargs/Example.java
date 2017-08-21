package lesson140429.varargs;

public class Example {

    public static void main(String[] args) {

        int s = sum(1,2);
        int s2 = sum(1, 2, 3);

        sum2(10,20,30);
//        sum2(); //ERROR!

        System.out.println(s + " " + s2);
    }

    private static void sum2(int i, Object ...v) {
    }

    private static int sum(int ... v) {
        System.out.println(v.length);
        int s = 0;

        for (int i :
                v) {
            s+=i;
        }
        return s;
    }

}
