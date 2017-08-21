package lesson140408.exceptions;

public class Classes {

    interface Vehicle{
        void move();
    }
    static class Car implements Vehicle{

        @Override
        public void move() {

        }
    }
    public static void main(String[] args) {
        inspect("hello");
        inspect(new Car());
    }

    private static void inspect(Object object) {
        System.out.println(object.getClass().getSimpleName());
        if (object instanceof String){
            System.out.println("String");
        }
        if (object instanceof Car){
            System.out.println("Car");
        }
        if (object instanceof Vehicle){
            System.out.println("vehicle");
        }
        if (object.getClass() == Car.class){
            System.out.println("car class");
        }
        if (object.getClass() == Vehicle.class){
            System.out.println("vehicle class");
        }
    }
}
