package lesson140327.inner;

public class Conditioner implements TemperatureObserver{

    @Override
    public void currentTemp(int temp) {
        if (temp > 25){
            hot();
        }
        if (temp < 20){
            cold();
        }
    }

    public void hot() {
        System.out.println("Cond on");
    }

    public void cold() {
        System.out.println("Cond off");
    }

    public static void main(String[] args) {
        Conditioner c = new Conditioner();
        Termometer t = new Termometer();

        t.setObserver(c);

        t.inc();
        t.inc();
        t.inc();

        t.dec();
        t.dec();
        t.dec();
        t.dec();
        t.dec();
        t.dec();
        t.dec();

        t.setObserver(new TemperatureObserver() {
            @Override
            public void currentTemp(int temp) {
                System.out.println("кажется дождь начинается");
            }
        });

        t.inc();
        t.dec();
    }
}
