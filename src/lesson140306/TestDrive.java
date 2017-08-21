package lesson140306;

import lesson140306.vehicle.*;

/**
 * Created by User on 20.07.2017.
 */
public class TestDrive {
    public static void main(String[] args) {
        LadaKalina lada = new LadaKalina();
        lada.moveTo(10,20);

//        lada.createWheel(); ERROr : protected

        MercedesS300 mers = new MercedesS300();
        mers.moveTo(10,20);

//        Car car = new Car(new Engine(),new Wheel[0]);
//        car.moveTo(30, 40);
    }
}
