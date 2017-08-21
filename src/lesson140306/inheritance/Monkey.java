package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public class Monkey extends Animal {


    @Override
    public void makeSound() {
        System.out.println("whooop-whooop");
    }

    @Override
    public void feed(String food) {
        if (food.equals("banana")) {
            makeSound();
        }
    }
}
