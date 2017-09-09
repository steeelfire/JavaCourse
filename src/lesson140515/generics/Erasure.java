package lesson140515.generics;

public class Erasure {

    static class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data, Node<T> next) {
            super();
            this.data = data;
            this.next = next;
        }

        public T getData(){
            return data;
        }
    }

    static class Node2{
        private Object data;
        private Node2 next;

        public Node2(Object data, Node2 next) {
            super();
            this.data = data;
            this.next = next;
        }
        public Object getData(){
            return data;
        }
    }
}
