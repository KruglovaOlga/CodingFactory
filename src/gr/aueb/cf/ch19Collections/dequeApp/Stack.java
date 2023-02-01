package gr.aueb.cf.ch19Collections.dequeApp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

public class Stack <T>{
    private final Deque<T> stack;

    public Stack(){
        stack = new ArrayDeque<>();
    }

    public Stack(Stack<T> stack) {
        this.stack = stack.getStack();
    }

    public Deque<T> getStack() {
        return stack;
    }

    public void push(T t) {
        if (t == null) return;
        stack.push(t);
    }

    public T pop(){
        return stack.pop();
    }

    public void forEach(Consumer<T> action) {
        stack.forEach(action);
    }
}
