package de.telran.home20240423;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Person extends Thread {
    private int weight;
    private CyclicBarrier cyclicBarrier;
    private Elevator elevator;

    public Person(int weight, CyclicBarrier cyclicBarrier, Elevator elevator) {
        this.weight = weight;
        this.cyclicBarrier = cyclicBarrier;
        this.elevator = elevator;

    }

    @Override
    public void run() {


        System.out.println(Thread.currentThread().getName() + " зашел в лифт");
        try {
            cyclicBarrier.await(5000, TimeUnit.MILLISECONDS);
        } catch (
                InterruptedException |
                BrokenBarrierException ignore) {

        } catch (
                TimeoutException e) {
            System.out.println("Лифт не полный");
            elevator.start();
        }
    }
}