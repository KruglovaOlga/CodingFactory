package gr.aueb.cf.ch19Collections.dequeApp;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Queue<T> {
    private final Deque<T> queue;

    public Queue() {
        this.queue = new LinkedList<>();
    }

    public Deque<T> getQueue() {
        return queue;
    }

    public void enQueue(T t) {
        if (t == null) return;
        queue.addLast(t);
    }

    public T deQueue(){
        return queue.poll();
    }

    public void forEach(Consumer<T> action) {
        queue.forEach(action);
    }
}
