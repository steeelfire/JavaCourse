package lesson140624;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

    private static ScheduledExecutorService service;
    private static ScheduledFuture<?> timeoutFuture;
    private static ScheduledFuture<?> countDownFuture;

    static class CountDownAction implements Runnable {

        private int _countdown;

        public void setScheduledFuture(ScheduledFuture<?> scheduledFuture) {
            _scheduledFuture = scheduledFuture;
        }

        private ScheduledFuture<?> _scheduledFuture;

        public CountDownAction(int seconds) {

            _countdown = seconds;
        }

        @Override
        public void run() {
            System.out.println("time left " + (_countdown--));
            if (_countdown == 0) {
                _scheduledFuture.cancel(true);
            }
        }
    }

    static class TimeoutAction implements Runnable {

        @Override
        public void run() {
            System.out.println("Timeout! Try Again");
            resetActions();
        }
    }

    public static void main(String[] args) {
        service = Executors.newSingleThreadScheduledExecutor();

        resetActions();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            resetActions();
        }
    }

    public static void resetActions() {

        if (timeoutFuture != null) {
            timeoutFuture.cancel(true);
        }
        if (countDownFuture != null) {
            countDownFuture.cancel(true);
        }
        timeoutFuture = service.schedule(new TimeoutAction(), 10, TimeUnit.SECONDS);

        CountDownAction countdownAction = new CountDownAction(10);
        countDownFuture = service.scheduleAtFixedRate(countdownAction, 0, 1, TimeUnit.SECONDS);
        countdownAction.setScheduledFuture(countDownFuture);
    }
}
