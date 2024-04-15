package de.telran.lesson20240412summary;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        InterruptThread interruptThread = new InterruptThread(3, new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Iteration");
                    try {
                        Thread.sleep(1000);
                    } catch (
                            InterruptedException e) {
                        break;
                    }
                }
                System.out.println("Thread completed");
            }
        });
        interruptThread.start();
        interruptThread.interrupt();
        System.out.println("1");
        Thread.sleep(3000);
        interruptThread.interrupt();
        System.out.println("2");
        Thread.sleep(3000);
        interruptThread.interrupt();
        System.out.println("3");
//Iteration
//1
//Iteration
//Iteration
//2
//Iteration
//Iteration
//Iteration
//3
//Thread completed
    }
}