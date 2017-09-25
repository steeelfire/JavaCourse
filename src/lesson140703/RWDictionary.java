package lesson140703;

import lesson140529.Utils;

import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class RWDictionary {
    private final Map<String, String> m = new TreeMap<String, String>();
    private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();

    public String get(String key) {
        r.lock();
        System.out.println(Thread.currentThread().getName() + " is reading");
        Utils.pause(2000);
        try {
            return m.get(key);
        } finally {
            System.out.println(Thread.currentThread().getName() + " finished");
            r.unlock();
        }
    }

    public String put(String key, String value) {
        w.lock();
        System.out.println(Thread.currentThread().getName() + " is writing");
        Utils.pause(10000);
        try {
            return m.put(key, value);
        } finally {
            System.out.println(Thread.currentThread().getName() + "----- finished");
            w.unlock();
        }
    }

    public static void main(String[] args) {
        final RWDictionary dictionary = new RWDictionary();
        class Reader implements Runnable {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " tries reading");
                    dictionary.get("Pete");
                }
            }
        }

        class Writer implements Runnable {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + "----- tries writing");
                    dictionary.put("John", "Chicago");
                }
            }
        }
        dictionary.put("Pete", "New-York");

        new Thread(new Reader(), "Reader-1").start();
        new Thread(new Reader(), "Reader-2").start();
        new Thread(new Reader(), "Reader-3").start();
        new Thread(new Reader(), "Reader-4").start();

        new Thread(new Writer(), "Writer").start();
    }
}
