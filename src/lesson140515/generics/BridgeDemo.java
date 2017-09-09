package lesson140515.generics;

public class BridgeDemo {

    static class Gen<T>{
        T ob;

        public Gen(T o) {
            this.ob = o;
        }
        T getOb(){
            return ob;
        }
    }

    static class Gen2 extends Gen<String>{

        public Gen2(String o) {
            super(o);
        }

        @Override
        String getOb() {
            System.out.println("called Gen2 version");
            new Exception().printStackTrace();
            return ob;
        }
    }
    public static void main(String[] args) {
        Gen2 g2 = new Gen2("Hello");
        g2.getOb();
    }
}
