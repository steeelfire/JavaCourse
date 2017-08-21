package lesson140225;

/**
 * Created by User on 13.07.2017.
 */
public class ContinueExample {

    int _x = 0;
    int mx = 0;

    public static void main(String[] args) {
        int a[] ={10, 20, 30, 20, -40, 12};

        int x =20;

        int index = findAll(a,x);
    }

    private static int findAll(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x){
                System.out.println("found at " + i);
                continue;
            }
            //do something
            System.out.println("a[i] != x" + a[i]);
        }
        return 0;
    }
}
