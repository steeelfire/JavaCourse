package com.gga.project1;

/**
 * Created by User on 13.07.2017.
 */
public class A {
    public static void main(String[] args) {
        int a[]={10, 20, 30, -40};
        printArray(a);
        int []b = null;
        System.out.println(b);

        b = new int [10];
        printArray(b);

        b = new int [] {10, 2 , 4, 5};
        printArray(b);

        b = new int [] {10, 5};

        String[] s = new String[5];
        printArray(s);
        for (int i = 0; i < s.length ; i++) {
            System.out.println("s[" + i + "]=" + s[i]);
        }

    }

    static int max (int[] a)
    {
        int max = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    private static void printArray(String[] s) {
        for (int i = 0; i < s.length ; i++) {
            System.out.println("s[" + i + "]=" + s[i]);
        }
    }

    private static void printArray(int[] a) {
        System.out.println(a.length);
        for (int i = 0; i < a.length ; i++) {
            System.out.println("[" + i + "]=" + a[i]);
        }
        System.out.println("max element = "+max(a));
    }
}
