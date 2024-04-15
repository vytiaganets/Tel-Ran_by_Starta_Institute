package de.telran.lesson20240415practice;

public class ThreadExamples {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Action");
                System.out.println(Thread.currentThread());

                try {
                    Thread.sleep(10_000);
                } catch (
                        InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);

        //thread.run();
        thread.start();
        //Action
        //Thread[Thread-0,5,main]
        Thread thread2 = new Thread(runnable);
        thread2.start();
        try {
            Thread.sleep(10_000);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        //Action
        //Thread[Thread-0,5,main]
        //Action
        //Thread[Thread-1,5,main] (5 priority)
    }
}
