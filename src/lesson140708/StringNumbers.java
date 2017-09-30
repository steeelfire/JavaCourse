package lesson140708;

import java.util.HashMap;
import java.util.Map;

public class StringNumbers {

    static final Map<Integer,String> words = new HashMap<>();
    static {
        words.put(1,"one");
        words.put(2,"two");
        words.put(3,"three");
        words.put(4,"four");
        words.put(5,"five");
        words.put(6,"six");
        words.put(7,"seven");
        words.put(8,"eight");
        words.put(9,"nine");
        words.put(10,"ten");
    }
    public static String convert(int number) {
        return words.get(number);
    }
}
