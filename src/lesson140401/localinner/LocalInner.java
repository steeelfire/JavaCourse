package lesson140401.localinner;

import lesson140313.interfaces.MyList;
import lesson140313.interfaces.SimpleList;

public class LocalInner{

    interface Jumper{
        void jump();
    }


//    static class Twins{
//        Jumper elder;
//        Jumper junior;
//    }

    public static void main(String[] args) {
        SimpleList jumpers =  createJumpers();
        for (Object object : jumpers){
            Jumper jumper = (Jumper) object;
            jumper.jump();
        }
    }

    private static SimpleList createJumpers() {
        SimpleList jumpers = new MyList();

        class Person implements Jumper{

            String name;

            Person(String name){
                this.name = name;
            }
            @Override
            public void jump() {
                System.out.println(name + " jumps!");
            }
        }

        jumpers.add(new Person("John"));
        jumpers.add(new Person("Pete"));
        jumpers.add(new Person("Ann"));

        return jumpers;
    }
}
