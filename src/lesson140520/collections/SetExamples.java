package lesson140520.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        fillSet(hashSet);
        fillSet(treeSet);
        fillSet(linkedHashSet);

        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);
    }

    private static void fillSet(Set<Integer> set) {
        set.add(2000);
        set.add(2000);
        set.add(2001);
        set.add(1990);
        set.add(1996);
        set.add(1918);
        set.add(1918);
        set.add(1867);
        set.add(2050);
        set.add(1990);
    }
}
