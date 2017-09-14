package lesson140527;

public class Person implements Comparable<Person>{

    String name;
    int age;
    int money;

    public Person(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    @Override
    public String toString() {
        return name + ": " + age + " - $" + money;
    }

    @Override
    public int compareTo(Person other) {
        return age - other.age;
    }
}
