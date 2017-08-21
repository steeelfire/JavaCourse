package com.gga.project1;

/**
 * Created by User on 13.07.2017.
 */
public class B {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Usage: B <number>");
            //return;
            System.exit(0);
        }
        System.out.println("Args: " + args[0]);
        int age = Integer.parseInt(args[0]);
        System.out.println(age);

        if (age<11){
            System.out.println("ребенок");
        }else
        if (age<16){
            System.out.println("подросток");
        }else
        if (age<25){
            System.out.println("юноша");
        }else
        if (age<40){
            System.out.println("молодой человек");
        }else
        if (age>=40){
            System.out.println("папаша");
        }

        if (age%2 == 0){
            System.out.println("четное");
        }
        else{
            System.out.println("нечетное");
        }


    }
}
