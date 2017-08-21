package lesson140408.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UseFinallyAndResources {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        lock.lock();
        try{
            //critical section
        }finally {
            lock.unlock();
        }

        File file = new File("tmp.txt");
        try {
            FileInputStream fis = new FileInputStream(file);

            try{

            } finally{
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
