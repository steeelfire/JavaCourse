package lesson140227;

/**
 * Created by User on 17.07.2017.
 */
public class A {
    //members

    int state;      //field

    public A(){
        System.out.println("Created " + this);
    }
    A(int initialState){
        this();
        state = initialState;
    }

    void changeState(){ //method
        state++;
    }
}
