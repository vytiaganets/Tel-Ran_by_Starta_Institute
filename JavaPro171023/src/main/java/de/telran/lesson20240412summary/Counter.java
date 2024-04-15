package de.telran.lesson20240412summary;

public class Counter {
    private volatile int value = 0;//value is changing


    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }
}
