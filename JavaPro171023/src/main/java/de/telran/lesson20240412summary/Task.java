package de.telran.lesson20240412summary;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread (() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
            System.out.println(counter.getValue());
        });
        t1.start();
        Thread t2 = new Thread (() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.increment();
            }
            System.out.println(counter.getValue());
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getValue());
        //1104961
        //1979152
        //1979152
    }
}
