package lesson140513.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardSuper {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        fill(list, 10, 0);


        List<Number> l2 = new ArrayList<>();
        fill(l2, 20, 100);

        List<Object> l3 = new ArrayList<>();
        fill(l3, 30, -10);
    }

    private static void fill(List <? super Integer> list, int qty, int value) {

        for (int i = 0; i < qty; i++) {
            list.add(value);
        }
    }
}
