package lesson140320;

/**
 * Created by User on 01.08.2017.
 */
public class Amphibia extends Car implements SeaTransport {

    SeaTransport _seaTransport = new Boat();

    @Override
    public void sail(){
        _seaTransport.sail();
    }
}
