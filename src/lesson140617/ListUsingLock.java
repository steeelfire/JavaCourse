package lesson140617;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ListUsingLock {

    static class Node {
        Object item;
        Node next;
        Lock lock = new ReentrantLock();

        public Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    Node head;

    synchronized public Node getHead() {
        return head;
    }

    public synchronized void add(Object item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        head = new Node(item, head);
    }

    public boolean search(Object x) {
        Node p = getHead();

        if (p == null || x == null) {
            return false;
        }
        //synch p               Невозможно сделать с помощью synchronized
        p.lock.lock();

        while (true) {
            Node nextp = null;
            boolean found;

            try {
                found = x.equals(p.item);
                if (!found) {
                    nextp = p.next;
                    if (nextp != null) {
                        //synch nextp
                        nextp.lock.lock();
                        //unsych  ???
                    }
                }
            } finally {
                p.lock.unlock();
            }
            if (found) {
                return true;
            } else if (nextp == null) {
                return false;
            } else {
                p = nextp;
            }
        }
    }
}
