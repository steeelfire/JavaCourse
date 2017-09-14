package lesson140520.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class CollectionExample {

    public static void main(String[] args) {
        Collection<String> bag = new Vector<>();

        bag.add("Nail");
        bag.add("Pen");
        bag.add("Notebook");
        bag.add("Phone");

        System.out.println(bag);

        for (String item :
                bag) {
            System.out.println(item);
        }
        System.out.println("***");
        Iterator<String> it = bag.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
