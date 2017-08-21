package lesson140320;

import java.util.LinkedList;

/**
 * Created by User on 01.08.2017.
 */
public class Queue extends LinkedList{

    @Override
    public void addFirst(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
