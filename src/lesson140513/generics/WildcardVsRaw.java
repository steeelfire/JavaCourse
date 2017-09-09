package lesson140513.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardVsRaw {

    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add(10);
        List l2 = new ArrayList<Integer>();
        l2.add(10);
        l2.add("hello");

//        List<String> list2 = list;
    }
}
