package lesson140408.classwork;

import lesson140408.exceptions.List;

public class Queue extends List {
//1.QueueOverFlow
    private class QueueUnderFlow extends Exception {
    }
    private class QueueOverflow extends Throwable {
        private Object _item;

        public QueueOverflow(Object item) {

            _item = item;
        }
        public Object getItem(){
            return _item;
        }
    }
    @Override
    public void add(Object item) {
        throw new UnsupportedOperationException();
    }
    int count;

    private int _mxsize;
    public Queue(int mxsize){

        _mxsize = mxsize;
    }
    public void put(Object item) throws QueueOverflow {
        if (count == _mxsize){
            throw new QueueOverflow(item);
        }
        super.add(item);
        count++;
    }
    public Object take() throws QueueUnderFlow {
        Node temp;

        if (first == null){
            throw new QueueUnderFlow();
        }
        else{
            count--;
            temp = first;
            first = first.next;

        }
        //взять превый элемент
//        если пустой, то эксепшн
//        иначе сделать первым следующий
//        скорректировать размер
//        вернуть данные из бывшего первого

        return temp.data;
    }
    public Object head(){
        return first == null? null : first.data;
    }
    public Object tail() throws QueueUnderFlow {
        if (last == null){
            throw new QueueUnderFlow();
        }
        return last.data;
    }
    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
//        queue.head();
//        queue.add("one");
        try {
            queue.put("one");
            queue.put("two");
        } catch (QueueOverflow e) {
            System.out.println("queue is full, can't put " + e.getItem());
        }

        try {
            System.out.println(queue.take());
            System.out.println(queue.take());
        } catch (QueueUnderFlow queueUnderFlow) {
            queueUnderFlow.printStackTrace();
        }
    }
}
