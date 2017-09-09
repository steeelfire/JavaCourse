package lesson140513.generics;

import java.util.Vector;

public class OldStyle {

    //before Java 5.0

    static class A{
    }

    static class VectorOfString extends Vector{
        public boolean add(String element){
            return super.add(element);
        }
        public boolean add(Integer element){
            throw new UnsupportedOperationException();
        }

        public String get(int index){
            return (String) super.get(index);
        }
    }
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("one");
        v.add("two");
        v.add("three");
        v.add(10); //new Integer(10)
        v.add(new A());

        System.out.println(v.get(1));
        System.out.println(v.get(4));

//        String s2 = (String) v.get(3);

        VectorOfString vos = new VectorOfString();

        vos.add("hello");
        vos.add(10);
        String s2 = vos.get(0);
    }
}
