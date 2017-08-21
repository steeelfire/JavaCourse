package lesson140225;

/**
 * Created by User on 13.07.2017.
 */
public class Operators {
    public static void main(String[] args) {

        int x =20;

        if(x%2 == 0){
            System.out.println("четное");
        }else{
            System.out.println("нечетное");
        }

        System.out.println(!(x % 2 == 0) ? "нечетное": "четное");

        System.out.println(!true);

        String s = null;
        if(s != null && s.equals("Hello")){
            System.out.println("hello too");
        }
        System.out.println(1<<3);
        System.out.println(256>>4);

        x = 2334234;

        System.out.println(x & 0xFF);
    }
}
