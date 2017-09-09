package lesson140515.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardHelper {


    static void foo (List<?> list){
//            list.set(0, list.get(0));
            helper(list);
    }

    static private <T> void helper(List<T> list) {

        T element = list.get(0);
        list.set(0, element);

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);

        foo(list);
    }
}
