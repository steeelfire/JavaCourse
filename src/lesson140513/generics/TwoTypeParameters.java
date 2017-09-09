package lesson140513.generics;

import static lesson140513.generics.GenericExample.*;

public class TwoTypeParameters {

    interface Pair<K,V>{
        K getKey();
        V getValue();
    }

    static class ConcretePair<KEY, VALUE> implements Pair <KEY, VALUE>{

        private KEY key;
        private VALUE value;

        @Override
        public KEY getKey() {
            return key;
        }

        @Override
        public VALUE getValue() {
            return value;
        }
    }
    static class IntegerStringPair implements Pair<Integer,String>{

        @Override
        public Integer getKey() {
            return null;
        }

        @Override
        public String getValue() {
            return null;
        }
    }

    static class IntegerSomethingPair<Value> implements Pair<Integer,Value>{

        @Override
        public Integer getKey() {
            return null;
        }

        @Override
        public Value getValue() {
            return null;
        }
    }

    public static void main(String[] args) {

        ConcretePair<Integer,Float> p1 = new ConcretePair<>();

        IntegerStringPair p2 = new IntegerStringPair();

        IntegerSomethingPair<Runnable> p3 = new IntegerSomethingPair<>();
        IntegerSomethingPair<String> p4 = new IntegerSomethingPair<>();

        ConcretePair<Integer,Box<String>> p5 = new ConcretePair<>();

        Box b = new Box();
        b.set("Hello");

        p5.key = 10;
        p5.value = b;

    }
}
