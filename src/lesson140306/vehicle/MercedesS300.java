package lesson140306.vehicle;

/**
 * Created by User on 20.07.2017.
 */
public class MercedesS300 extends Car {
    public MercedesS300() {
        super(new Mers30(), new Wheel[4]);
    }

    @Override
    protected Wheel createWheel() {
        return new Michelin();
    }
}
