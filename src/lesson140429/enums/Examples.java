package lesson140429.enums;

import static lesson140429.enums.Examples.Apple.Jonatan;

public class Examples {

    enum Apple{
        Jonatan, GoldenDel, RedDel, Winesap, Cortland
    }

    enum РусскиеЯблоки{
        Семеренка(10), Антоновка(15), СлаваПобедителю(20);

        private int цена;
        РусскиеЯблоки(  int цена){
            this.цена = цена;
        }
        public int стоимость(){
            return цена;
        }
    }

    public static final int MAX_VALUE = 100;



    public static void main(String[] args) {

        Apple ap = Jonatan;

        System.out.println(ap.name());
        System.out.println(Apple.RedDel.ordinal());

        switch (ap){
        case Jonatan:
        //..
        break;

        case RedDel:
        //..
        break;

        case Winesap:
        //..
        break;

        case Cortland:
        //..
        break;
        }

        for (Apple apple :
                Apple.values()) {
            System.out.println(apple.name() + " " + apple.ordinal());
        }

        for (РусскиеЯблоки сортЯблок:
             РусскиеЯблоки.values()) {
            System.out.println(сортЯблок.name() + " " + сортЯблок.стоимость());
        }
    }
}
