package lesson140515.generics.restrictions;

import java.util.List;

public class PrimitiveTypes {

    enum Apples {A,B,C,D};
    public static void main(String[] args) {
//        List<int> listOfInt;  ERROR!
        List<Apples> listOfInt;
        List<int[]> listOfArray = null;

        listOfArray.add(new int[]{0,2});
    }
}
