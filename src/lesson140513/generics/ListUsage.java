package lesson140513.generics;

import java.util.ArrayList;
import java.util.List;

public class ListUsage {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");

        String s = list.get(0);
    }
}
