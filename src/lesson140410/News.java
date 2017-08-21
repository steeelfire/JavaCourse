package lesson140410;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class News {

    private static NewsMaker _newsMaker;

    public static void main(String[] args) {

        setNewsMaker(new MrPresident());

        startRefreshProcess();

        while(true){
            publishNews();

            internalWork();
        }
    }

    private static void startRefreshProcess() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                while (true){
                    if (scanner.hasNextLine()){
                        String line = scanner.nextLine();
                        processLine(line);
                    }
                }
            }
        }).start();
    }

    private static void processLine(String line) {
        try {
            Class newsMakerClass = Class.forName(line);
            if (!NewsMaker.class.isAssignableFrom(newsMakerClass)){
                System.out.println("это не NewsMaker!");
                return;
            }
            NewsMaker newNewsMaker = (NewsMaker) newsMakerClass.newInstance();
            setNewsMaker(newNewsMaker);
        } catch (ClassNotFoundException e) {
            System.out.println("не нашли "+line);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void publishNews() {
        System.out.println(_newsMaker.getClass().getSimpleName() + ": " +  _newsMaker.getNews());
    }

    public static void setNewsMaker(NewsMaker nm){
        _newsMaker = nm;

    }
    private static void internalWork() {
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
