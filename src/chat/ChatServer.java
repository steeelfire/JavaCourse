package chat;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ChatServer implements Runnable {   //Actor - каждая сущность работает в своем потоке и со своими данными и общается с внешни миром с помощью передачи и приема сообщений, т.е. нет общих данных.
    List<ChatMember> members = new LinkedList<>();
    BlockingQueue<Runnable> actions = new LinkedBlockingQueue<>();
    ExecutorService sender = Executors.newCachedThreadPool();

    public void addMember(final ChatMember member) {

        actions.add(new Runnable() {
            public void run() {
                member.setServer(ChatServer.this);
                broadCast(member.getName() + " has entered");
                members.add(member);
            }
        });
    }

    public void removeMember(final ChatMember member) {
        actions.add(new Runnable() {
            public void run() {
                members.remove(member);
                broadCast(member.getName() + " has left chat");
            }
        });
    }

    public void broadCast(final String message) {
        for (final ChatMember member :
                members) {
            sender.execute(new Runnable() {
                @Override
                public void run() {
                    member.sendMessage(message);
                }
            });
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Runnable action = actions.take();
                action.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void process(final String message) {
        actions.add(new Runnable() {
            @Override
            public void run() {
                broadCast(message);
            }
        });
    }

}
