package lesson140306.vehicle;

/**
 * Created by User on 20.07.2017.
 */
public abstract class Car extends Vehicle {

    Engine _engine;
    Wheel[] _wheels;


    public Car(Engine engine, Wheel[] wheels){

        _engine = engine;
        _wheels = wheels;
        mountWheels();
    }

    private void mountWheels() {
        for (int i = 0; i < _wheels.length; i++) {
            _wheels[i] = createWheel();
        }
    }

    protected Wheel createWheel() {
            return null;
    }

    @Override
    public void moveTo(int x, int y) {
        startEngine();
        pushAccelerator();
        drive();
        stopEngine();

    }

    private void pushAccelerator() {
        System.out.println("pushed accelerator");

    }

    private void stopEngine() {
        _engine.stop();
        System.out.println("stop engine");

    }

    private void drive() {
        System.out.println("moves to destination");
        for (Wheel wheel :
                _wheels) {
            wheel.makeSound();
        }

    }

    private void startEngine() {
        _engine.start();
        System.out.println("engine started");
    }
}
