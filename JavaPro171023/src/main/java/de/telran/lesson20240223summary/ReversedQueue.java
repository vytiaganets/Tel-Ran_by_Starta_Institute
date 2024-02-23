package de.telran.lesson20240223summary;

public interface ReversedQueue<T> {
    T poll();
    int getSize();
    void add(T elem);
}
