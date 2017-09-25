package lesson140703;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncDataHolders {

    public static void main(String[] args) {

        //Java 1.0
        Vector v = new Vector();
        Hashtable table = new Hashtable();

        //Java 1.2
        List<String> list = new ArrayList<>();      //Не потокобезопасны
        Map<String, String> map = new HashMap<>();  //Не потокобезопасны

        synchronized (map) {
            if (!map.containsKey("Pete")) {
                //<---- some other thread changed map here
                map.put("Pete", "New-York");
            }
        }

        //Thread Safe
        //Обертка. Слабая производительность.
        List<String> synclist = Collections.synchronizedList(list);
        Map<String, String> syncMap = Collections.synchronizedMap(map);

        //Java 1.5 Thread-Safe, Efficient. Эффективные и потоко-безопасные
        //Эффективно тогда когда редко меняется список и много читателей
        List<String> concurentList = new CopyOnWriteArrayList<>();

        //Травер по очереди блочится 2 эл-та пишится и читается
        Queue<String> queue = new ConcurrentLinkedQueue<>();

        ConcurrentMap<String, String> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.putIfAbsent("Pete","New-York");

    }
}
