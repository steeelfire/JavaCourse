package lesson140527;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class CollectionsExamples {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Collections.addAll(list, 40, 50,60,70);

        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        Collections.addAll(set,100, 200, 300,10);

        System.out.println(Collections.disjoint(list,set));

        Collections.reverse(list);
        System.out.println(list);

        Collections.rotate(list,1);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}
