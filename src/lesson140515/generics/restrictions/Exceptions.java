package lesson140515.generics.restrictions;

import java.io.File;

public class Exceptions {

//    static class MyException<T> extends Exception{  //Throwable  ERROR

//    }

    static class Parser<T extends Exception>{
        public void parse(File file) throws T{  //OK

        }
    }
}
