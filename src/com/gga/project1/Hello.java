package com.gga.project1;

/**
 * Created by User on 13.07.2017.
 */
public class Hello {
    public static void main(String[] p) {
        int j = 0;
        System.out.println(++j);
        j=0;
        System.out.println(j++);
        System.out.println(j);


        System.out.println("Hello, world");
        for (int i = 0; i < p.length; i++) {
            System.out.println("Arg " + i + p[i]);
        }

        int i = 0;
        while (i<p.length) {
            System.out.println("Arg " + i + p[i++]);
            //i++; //i +=1; ++i;
        }

        i = 0;
        do {
            System.out.println("Arg " + i + p[i++]);
        } while (i<p.length);

    }
}

