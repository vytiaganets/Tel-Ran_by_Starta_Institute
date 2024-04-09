package de.telran.lesson20240409;

public class SimpleThreads {
    public static void main(String[] args) throws InterruptedException {
        //1 vaiant
        MyThread myThread = new MyThread();
        //myThread.run();//не рекомендуется
        myThread.start();
        //Hello world! -> main
        //-- Главный поток заканчивает работу --

        //2 variant
        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        Thread thread = new Thread(myThreadRunnable);
        thread.start();
        //3 variant
        Thread threadAnonym = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (
                        InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello world  Anonym! -> " + Thread.currentThread().getName());
            }
        };
        threadAnonym.start();
        //Hello world  Anonym! -> Thread-2
        //Hello world -> Thread-1
        //Hello world! -> Thread-0
        //--Главный поток заканчивает работы--
        //3 variant
        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello world  runnable! -> " + Thread.currentThread().getName());
        };

        Thread threadAnonimRunnable = new Thread (runnable);
        threadAnonimRunnable.start();

        myThread.join();
        thread.join();
        System.out.println("--Главный поток заканчивает работы--");
    }
}
class MyThread extends Thread {
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world! -> " + Thread.currentThread().getName());
    }
}

class MyThread1 extends Thread {
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world! -> " + Thread.currentThread().getName());
    }
}

class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world -> " + Thread.currentThread().getName());
    }
}