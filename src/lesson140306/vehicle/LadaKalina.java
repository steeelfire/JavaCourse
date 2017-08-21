package lesson140306.vehicle;

/**
 * Created by User on 20.07.2017.
 */
public class LadaKalina extends Car {
    public LadaKalina() {
        super(new Vaz14(), new Wheel[4]);
    }

    @Override
    protected Wheel createWheel() {
        return new Pirelli();
    }
}
