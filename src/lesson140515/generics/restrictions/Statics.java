package lesson140515.generics.restrictions;

public class Statics<T> {

//    static T t;   ERROR!

    T state;

//    static void print(T t){       ERROR!
//
//    }

    static <V> void print(V v){
        System.out.println(v);
    }
}
