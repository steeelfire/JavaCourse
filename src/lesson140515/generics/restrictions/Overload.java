package lesson140515.generics.restrictions;

import java.util.List;

public interface Overload {

//    public void print(List<String> list);     ERROR!
    public void print(List<Integer> list);
}
