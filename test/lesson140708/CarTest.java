package lesson140708;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {


    @Test
    public void testNewCar(){
        Car car = new Car(4);
        assertEquals(4,car.getWheelsCount());
        Car car2 = new Car(6);
        assertEquals(6,car2.getWheelsCount());
    }


}