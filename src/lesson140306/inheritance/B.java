package lesson140306.inheritance;

/**
 * Created by User on 20.07.2017.
 */
public class B extends A{

//    public B(){
//        super(13);
//    }
    public void printState(){
        System.out.println(getState());
    }
    @Override
    public void changeState(){
        setState(getState() * 3);
    }
}
