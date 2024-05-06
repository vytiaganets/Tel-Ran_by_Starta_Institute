package de.telran.home20240430.task2;

import java.time.LocalTime;

public class Request implements Runnable {
    private int requestNumber;

    public Request(int taskNumber) {
        this.requestNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Request - " + requestNumber + " - Connection established");
        LocalTime localTime = LocalTime.now();
        System.out.println("Current time: " + localTime);

    }
}