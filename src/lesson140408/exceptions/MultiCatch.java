package lesson140408.exceptions;

import java.util.Random;

public class MultiCatch {

    static class My1 extends RuntimeException{
        public void process1(){
            System.out.println("one");
        }
    }
    static class My2 extends RuntimeException{
        public void process2(){
            System.out.println("two");
        }
    }
    public static void main(String[] args) {
        try{
            doSomething();
        } catch (My1 | My2 e){
            if (e instanceof My1){
                ((My1)e).process1();
        }
        if (e instanceof My2) {
            ((My2) e).process2();
        }
        e.printStackTrace();
        }
    }

    private static void doSomething() {
        if (new Random().nextBoolean()){
            throw new My1();
        } else{
            throw new My2();
        }
    }
}
