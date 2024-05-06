package de.telran.home20240430.task3;

import java.util.concurrent.Callable;

public class Client implements Callable<Long> {
    public Client() {
    }

    @Override
    public Long call() {
        long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + ": Customer entered the store");
        try {
            Thread.sleep(1_000);
        } catch (
                InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + ": The customer left the store");
        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + ": Service time per customer: " + (endTime - startTime));
        return (endTime - startTime);
    }
}