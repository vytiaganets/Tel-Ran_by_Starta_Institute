package de.telran.lesson20240223summary;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegeReversedQueue implements ReversedQueue<Integer> {
    private final Deque<Integer> deque = new ArrayDeque<>();
    @Override
    public Integer poll() {
        return deque.poll();
    }

    @Override
    public int getSize() {
        return deque.size();
    }

    @Override
    public void add(Integer elem) {
    deque.addFirst(elem);
    }

    @Override
    public String toString() {
        return "IntegeReversedQueue{" +
                "deque=" + deque +
                '}';
    }
}
