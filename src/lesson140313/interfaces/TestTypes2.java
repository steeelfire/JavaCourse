package lesson140313.interfaces;

/**
 * Created by User on 21.07.2017.
 */
public class TestTypes2 {
    public static void main(String[] args) {

        Violine violin = new Violine();
        System.out.println(violin);

        Object object = new Trombone(); //Восходящее преобразование типов

        MusicInstruments mi = violin;

        mi.play();
        mi.clean();
//        mi.piccicato();   ERROR
        ((Cleanable)object).clean();
//        ((Violine)object).piccicato();    RUNTIME ERROR!

        ((Violine)mi).piccicato(); //Низходящее явное преобразование типов

    }
}
