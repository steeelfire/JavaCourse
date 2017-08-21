package lesson140225;

/**
 * Created by User on 13.07.2017.
 */
public class BreakExample {
    public static void main(String[] args) {
        int a[] ={10, 20, 30, -40, 12};
        int x =20;

        int index = find (a,x);

        if (index == -1){
            System.out.println("not found");
        }else{
            System.out.println("Index of " + x + "is " + index);
        }
    }

    private static int find(int[] a, int item) {
        int found = -1;

        for (int j = 0; j < a.length; j++) {
            if (a[j] == item){
                found = j;
                break;
            }
        }
        //do something
        System.out.println("found at " + found  );
        return found;
    }
}
