package lesson140227;

/**
 * Created by User on 17.07.2017.
 */
public class F {

    E e;
    String _name;

    F(String name){
        _name = name;
    }

    void doIt(){
        System.out.println("Do it, "+ e._name);

        e.doIt();
    }
}
