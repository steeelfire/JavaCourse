package lesson140313.interfaces;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 21.07.2017.
 */
public class TestTypes {
    public static void main(String[] args) {

        String s = "hello";

        List<String> names = new LinkedList<String>();

        names.add("Pete");
        names.add("John");
        names.add("Steve");
        names.add("Ann");

        Collections.sort(names);

        for (String name:
             names) {
            System.out.println(name);
        }


    }
}
