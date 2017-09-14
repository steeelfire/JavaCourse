package lesson140527;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        process(Collections.unmodifiableList(list));

        Collections.sort(list);
    }

    private static void process(List<Integer> list) {
        list.add(20);
    }
}
