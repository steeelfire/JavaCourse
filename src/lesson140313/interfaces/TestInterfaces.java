package lesson140313.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 21.07.2017.
 */
public class TestInterfaces {
    public static void main(String[] args) {
        String s = "hello";

        Trombone trombon = new Trombone();
        Violine violine = new Violine();
        StringInstrument si = new Violine();
        MusicInstruments mi = new Violine();
        Object o = new Violine();
        Cleanable cleanable = new Violine();

        violine.piccicato();
//        si.piccicato();   error

        ArrayList<MusicInstruments> list = new ArrayList<>();
        ArrayList<Cleanable> cleanables = new ArrayList<>();

        list.add(violine);
        list.add(trombon);

        cleanables.add(violine);
        cleanables.add(trombon);
        cleanables.add(cleanable);
        cleanables.add(si);
        cleanables.add(mi);
//        cleanables.add(o);  ERROR




        play(list);
        clean(cleanables);
    }

    private static void play(ArrayList<MusicInstruments> instruments) {
        for (MusicInstruments musicInstrument: instruments
             ) {
            musicInstrument.play();
        }
    }

    private static void clean(ArrayList<Cleanable> cleanableObjects) {
        for (Cleanable dirtyObject: cleanableObjects
                ) {
            dirtyObject.clean();

        }
    }
}
