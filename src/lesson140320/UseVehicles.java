package lesson140320;

/**
 * Created by User on 01.08.2017.
 */
public class UseVehicles {
    public static void main(String[] args) {
        Car car = new Car();
        SeaTransport seaTransport = new Boat();
        Amphibia amphibia = new Amphibia();
        AirTransport airTransport = new Airplane();
        Hydroplane hydroplane = new Hydroplane();

        car.drive();
        seaTransport.sail();
        amphibia.sail();
        amphibia.drive();
        airTransport.fly();


        travelBySea(seaTransport);
        travelBySea(amphibia);
        travelBySea(hydroplane);


        travelByAir(airTransport);
        travelByAir(hydroplane);

        travelByLand(car);

    }

    private static void travelByAir(AirTransport airTransport) {
        airTransport.fly();
    }

    private static void travelBySea(SeaTransport seaTransport) {
        seaTransport.sail();
    }

    private static void travelByLand(LandTransport landTransport){
        landTransport.drive();
    }
}
