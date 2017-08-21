package lesson140227;

/**
 * Created by User on 17.07.2017.
 */
public class C {
//    D changeState = new D("init field");
    D d;

    {
//        changeState = new D("init instance");
//        System.out.println("changeState = "+changeState);
    }
    C(){

//        changeState = new D("default constructor");
    }
    C(D d){
        this.d = d;
    }

    void setD(D d){

        this.d = d;
    }

    void doIt(){

        d.doIt();
    }

    void doIt(D d){
        if (d == null) {
            d = new D("Lazy");
        }
        d.doIt();
    }

    void doIt2(){

        new D("temporary internal worker").doIt();
    }
}
