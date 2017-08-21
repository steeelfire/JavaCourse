package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public class Cat extends Pet {
    @Override
    public void makeSound() {
        System.out.println("MURR");
    }

    @Override
    public void feed(String food) {
        makeSound();
    }
}
