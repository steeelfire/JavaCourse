package lesson140710;

public class Termostat {
    public int temperature = 20;
    public TermListener listener;

    public void inc() {
        temperature++;
        listener.temperatureChanged(temperature);
    }

    public void setListener(TermListener termListener) {
        this.listener = termListener;
    }
}
