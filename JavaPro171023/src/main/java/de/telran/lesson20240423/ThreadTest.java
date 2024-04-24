package de.telran.lesson20240423;

import java.util.concurrent.Semaphore;

class ThreadTest implements Runnable
{
    Semaphore semaphore;
    public ThreadTest(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()+" начал работать "+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" закончил работать");
            semaphore.release();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}