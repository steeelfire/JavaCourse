package lesson140610;

import lesson140529.Utils;

import java.util.LinkedList;
import java.util.Queue;

public class PrimitiveWorker {

    private static final Runnable POISON_PILL = new Runnable() {
        @Override
        public void run() {

        }
    };

    private final Queue<Runnable> _tasks = new LinkedList<>();

    private class WorkerTask implements Runnable {
        @Override
        public void run() {
            Runnable task;      //Извлечение из очереди с головы
            while (true) {
                synchronized (_tasks) {
                    while (!hasNewTask()) {
                        try {
                            _tasks.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = _tasks.poll();
                }

                if (task == POISON_PILL){
                    break;
                }
                try {
                    task.run();
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public PrimitiveWorker() {
        new Thread(this.new WorkerTask()).start();
    }

    private boolean hasNewTask() {
        return !_tasks.isEmpty();
    }

    public void execute(Runnable task) {
        synchronized (_tasks) {
            _tasks.offer(task);                 //Добавление в очередь в хвост
            _tasks.notify();
            System.out.println("added task");
        }
    }

    public void shutdown(){
        execute(POISON_PILL);
    }
}
