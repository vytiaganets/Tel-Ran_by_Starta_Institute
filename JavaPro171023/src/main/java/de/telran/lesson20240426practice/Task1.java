package de.telran.lesson20240426practice;

import java.util.concurrent.ArrayBlockingQueue;

public class Task1 {
    public static void main(String[] args) {
        ConcurrentTaskExecutor concurrentTaskExecutor = new ConcurrentTaskExecutor(new ArrayBlockingQueue<>(1),1);
        concurrentTaskExecutor.submit(()-> {
            try {
                Thread.sleep(1_000);
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task1");
        });
        concurrentTaskExecutor.submit(()-> {
            try {
                Thread.sleep(1_000);
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task2");
        });
        concurrentTaskExecutor.submit(()-> {
            try {
                Thread.sleep(1_000);
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task3");
        });
        concurrentTaskExecutor.shutdown();
    }
}
