package lesson140520.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list.add("one");

//        list.add(10,"ten");   ERROR

        list2.add("one");
        list2.add("one");
        list2.add("one");
        list2.add("one");
        list2.add("one");
        list2.add("one");
        list2.add("one");
        list2.add("one");
//        list2.add(10,"ten");  ERROR

        list.add(0,"zero");
        System.out.println(list);
        System.out.println(list.get(1));

        list.set(1,"один");
        System.out.println(list);
        System.out.println(list2);

    }
}
