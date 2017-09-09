package lesson140515.generics.restrictions;

import java.util.List;

public class Arrays {

    public static void main(String[] args) {
        List<?>[] arrayOfLists = new List<?>[10];   //OK
//        List<Integer>[] arrayOfLists = new List<Integer>[10]; ERROR
        List<?>[] arrayOfLists2 = new List[10];   //OK

        List<String>[] aos = (List<String>[]) new List[10];
    }
}
