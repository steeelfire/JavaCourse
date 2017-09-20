package lesson140610;

import java.util.LinkedList;
import java.util.Queue;

public class Worker {

    private static final Runnable POISON_PILL = new Runnable() {
        @Override
        public void run() {

        }
    };

    private final BlockingQueue<Runnable> _tasks = new BlockingQueue<>();

    private class WorkerTask implements Runnable {
        @Override
        public void run() {
            Runnable task;      //Извлечение из очереди с головы
            while (true) {
                task = _tasks.poll();
                if (task == POISON_PILL) {
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

    public Worker() {
        new Thread(this.new WorkerTask()).start();
    }

    public void execute(Runnable task) {
        _tasks.offer(task);                 //Добавление в очередь в хвост
    }

    public void shutdown() {
        execute(POISON_PILL);
    }
}
