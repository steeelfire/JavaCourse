package lesson140515.generics.restrictions;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {

    public static <E> void print (List<E> list){
        if (list instanceof ArrayList<?>){

        }
    }
}
