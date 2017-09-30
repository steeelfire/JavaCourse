package lesson140708;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CarTest2 {

    private Car car;


    @Before
    public void setup(){
        car = new Car(4);
    }
    @Test
    public void testEngine()throws Exception{
        assertTrue(car.hasEngine());
    }

    @Test
    public void testPower()throws Exception{

    }

}