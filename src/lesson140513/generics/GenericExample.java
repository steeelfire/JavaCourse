package lesson140513.generics;

public class GenericExample {

    static class Box<E> {   //Generic class (type) Обобщенный тип

        /*
            *   E - element
            *   K - key
            *   N - number
            *   T - type
            *   V - value
            *   S,U,X ... -
         */
        private E object;


        public E get () {
            return object;
        }

        public void set(E object) {
            this.object = object;
        }
        
    }

    static class BoxOfString extends Box<String>{

    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();  //parametrized type тип параметр
        
        box.set("Hello");
//        box.set(10);  COMPILER ERROR!

        String s = box.get();

        BoxOfString bos = new BoxOfString();
        bos.set("hello");

        String s2 = bos.get();
    }
}
