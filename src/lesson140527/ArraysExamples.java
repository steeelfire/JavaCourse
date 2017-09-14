package lesson140527;

import java.util.Arrays;
import java.util.List;

public class ArraysExamples {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30);

        System.out.println(list);

        list.add(40);   //ERROR
    }
}
