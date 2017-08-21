package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public abstract class  Animal{
    public abstract void makeSound();
    public abstract void feed(String food);

    public void takeCare(){
        makeSound();
        feed("banana");
        feed("meat");
    }
}
