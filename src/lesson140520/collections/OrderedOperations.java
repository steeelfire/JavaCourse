package lesson140520.collections;

import java.util.*;
import java.util.Map.Entry;

public class OrderedOperations {

    public static void main(String[] args) {

        NavigableMap<String,String> calls2 = new TreeMap<>();
        process(calls2);

        System.out.println(calls2.descendingMap());

        //ordered operations - дает только TreeMap
        System.out.println(calls2.ceilingEntry("12:00")); //первый звонок после 12.00
        System.out.println(calls2.floorEntry("12:00")); //последний звонок до 12 часов.
        System.out.println(calls2.firstEntry()); //первый звонок
        System.out.println(calls2.lastEntry()); //последний звонок
        System.out.println(calls2.headMap("12:00"));//все звонки до 12
        System.out.println(calls2.tailMap("12:00"));//все звонки после 12
        System.out.println(calls2.subMap("12:00","18:00"));//все звонки в промежутке 12-18
    }

    private static void process(Map<String, String> calls) {

        System.out.println("-------");
        fillMap(calls);

        for (Entry<String,String> call:
                calls.entrySet()) {
            System.out.println(call.getKey() + " -> " + call.getValue());
        }
    }

    private static void fillMap(Map<String, String> calls) {
        calls.put("09:34","Moscow");
        calls.put("12:06","St.Peter");
        calls.put("14:20","New-York");
        calls.put("07:00","Boston");
        calls.put("21:30","Samara");
        calls.put("16:03","Tegeran");
        calls.put("23:00","Rio");
        calls.put("20:10","Moscow");
        calls.put("14:59","Boston");
        calls.put("11:00","St.Peter");
    }
}
