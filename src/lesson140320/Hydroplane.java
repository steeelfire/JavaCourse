package lesson140320;

/**
 * Created by User on 01.08.2017.
 */
public class Hydroplane implements SeaAirTransport{

    Boat boat = new Boat();
    AirTransport _airTransport = new Airplane();

    @Override
    public void fly(){
        _airTransport.fly();
    }

    @Override
    public void sail(){
        boat.sail();
    }
}
