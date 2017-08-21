package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public abstract class Pet extends Animal {

    public void brush(){
        System.out.println("brushed");
    }

    @Override
    public void takeCare() {
        super.takeCare();
        brush();
    }
}
