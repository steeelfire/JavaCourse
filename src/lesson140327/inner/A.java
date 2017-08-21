package lesson140327.inner;

public class A {

    class Ai {

//         A _a;
//         Ai (A a)
//          {
//               _a =a;
//          }
        public void printState(){
//            System.out.println(_a.state);
            System.out.println(state);
            System.out.println(this);
            System.out.println(A.this);
        }
    }


    int state = 10;
}
