package lesson140515.generics.restrictions;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<Integer>();

//        list.add("hello");    ERROR!
        list.add(10);
//        String s = list.get(0);   Error!
    }
}
