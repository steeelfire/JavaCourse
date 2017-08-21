package lesson140320;

import java.util.ArrayList;

/**
 * Created by User on 01.08.2017.
 */
public class Stack extends ArrayList{    //LIFO Last IN First OUT  FIFO - очередь

        public Object top(){

            if (isEmpty()){
                return null;
            }
            return get(size()   -  1);
        }

        public Object pop(){

            if (isEmpty()){
                return null;
            }
            return remove(size() - 1);
        }

        public void push( Object item ){

            super.add(item);
        }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("one");
        stack.push("two");
        stack.push("three");

        while (stack.top() != null){
            System.out.println(stack.pop());
        }

        stack.add("four");

    }


}
