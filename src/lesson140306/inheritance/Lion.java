package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public class Lion extends Animal {


    @Override
    public void makeSound() {
        System.out.println("roooaarr");
    }

    @Override
    public void feed(String food) {
        if(food.equals("meat")){
            System.out.println("muuurrr");
        }
        else {
            makeSound();
        }
    }
}
