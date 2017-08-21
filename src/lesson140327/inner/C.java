package lesson140327.inner;

public class C {

    static class Ci{
        C _c;
        Ci (C c){
            _c = c;
        }
        public void printState(){
            System.out.println(_c.state);
        }
    }
    int state = 30;
}
