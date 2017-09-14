package lesson140527;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindOldestPersons {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("John", 35, 12000));
        persons.add(new Person("Ann", 30, 150000));
        persons.add(new Person("Paul", 27, 250000));
        persons.add(new Person("Mary", 17, 500000));
        persons.add(new Person("Pete", 77, 12000));
        persons.add(new Person("Jane", 77, 12000));
        persons.add(new Person("Mike", 77, 45000));
        persons.add(new Person("A's father", 77, 55000000));

//        Collections.sort(persons);
//        print(persons);
//
//
//        Collections.sort(persons, new AscendingMoneyComparator());
//        print(persons);
//
//
//        Collections.sort(persons, new DescendingMoneyComparator());
//        print(persons);



        Collections.sort(persons, Collections.reverseOrder());
        print(persons);

        Collections.sort(persons, Collections.reverseOrder(new AscendingMoneyComparator()));
        print(persons);
    }

    private static void print(List<Person> persons) {
        for (Person person :
                persons) {
            System.out.println(person);
        }
        System.out.println();
    }

    private static class AscendingMoneyComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.money - o2.money;
        }
    }

    private static class DescendingMoneyComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o2.money - o1.money;
        }
    }
}
