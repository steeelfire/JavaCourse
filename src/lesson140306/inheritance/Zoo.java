package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Monkey monkey = new Monkey();

//        Animal animal = new Animal(); ERROR : abstract

        lion.takeCare();
        monkey.takeCare();
        new Cat().takeCare();
        new Dog().takeCare();

    }
}
