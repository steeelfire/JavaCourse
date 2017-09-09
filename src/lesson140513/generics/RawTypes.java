package lesson140513.generics;

import java.util.ArrayList;
import java.util.List;

public class RawTypes { //  DRY (Don't Repeat Yourself)

    public static void main(String[] args) {

        List list = new ArrayList();    //Сырые типы

        list.add(10);

        List<String> l2;

        l2 = list;

        String s2 = l2.get(0);

    }
}
