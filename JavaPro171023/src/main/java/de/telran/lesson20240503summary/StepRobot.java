package de.telran.lesson20240503summary;

public class StepRobot {

    private static final Object monitor = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (monitor) {
                while (true) {
                    System.out.println("Left leg");
                    try {
                        monitor.wait();
                        Thread.sleep(300);
                    } catch (
                            InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    monitor.notify();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (monitor) {
                while (true) {
                    System.out.println("Right leg");
                    try {
                        monitor.notify();
                        Thread.sleep(100);
                    } catch (
                            InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        monitor.wait();
                    } catch (
                            InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}