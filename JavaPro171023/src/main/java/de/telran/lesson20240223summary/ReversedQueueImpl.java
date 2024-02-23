package de.telran.lesson20240223summary;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReversedQueueImpl<T> implements ReversedQueue<T> {
    private Deque<T> deque = new ArrayDeque<>();
    @Override
    public T poll() {
        return deque.poll();
    }

    @Override
    public int getSize() {
        return deque.size();
    }

    @Override
    public void add(T elem) {
        deque.addFirst(elem);
    }

    @Override
    public String toString() {
        return "ReversedQueueImpl{" +
                "deque=" + deque +
                '}';
    }
}
