package lesson140320;

/**
 * Created by User on 08.08.2017.
 */
public class ByValue {

    public static void main(String[] args) {
        
        final int a = 10; //calc(10)
        
        calc(a);

        System.out.println(a);
    }

    private static void calc(final int param) {
        //param = 10;
        //param = 30;  ERROR
    }
}
