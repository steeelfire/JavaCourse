package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public class Dog extends Pet {
    @Override
    public void makeSound() {
        System.out.println("whooof - whoof");
    }

    @Override
    public void feed(String food) {
        makeSound();
        wag();
    }

    private void wag() {
        System.out.println("tail wags");
    }
}
