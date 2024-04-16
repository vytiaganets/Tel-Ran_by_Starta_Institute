package de.telran.lesson20240416;

public class SimpleDeadlock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
        //Thread-1 получил lock1
        //Thread-2 получил lock2
        //Thread-1 ожидаем lock2
        //Thread-2 ожидаем lock1
    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread-1 получил lock1");
                try {
                    Thread.sleep(1000);// имитация работы
                } catch (
                        InterruptedException e) {
                    System.out.println("Thread-1 interrupted.");
                }
                System.out.println("Thread-1 ожидаем lock2");
                synchronized (lock2) {
                    System.out.println("Thread-1 получил lock2");
                    try {
                        Thread.sleep(1000);// имитация работы
                    } catch (
                            InterruptedException e) {
                        System.out.println("Thread-1 interrupted.");
                    }
                }
                System.out.println("Thread-1 освободил lock2");
            }
            System.out.println("Thread-1 освободил lock1");
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (lock2) { // lock1 - будет решение проблемы deadlock
                System.out.println("Thread-2 получил lock2");
                try {
                    Thread.sleep(1000);// имитация работы
                } catch (
                        InterruptedException e) {
                    System.out.println("Thread-2 interrupted.");
                }
                System.out.println("Thread-2 ожидаем lock1");
                synchronized (lock1) {  // lock2 - будет решение проблемы deadlock
                    System.out.println("Thread-2 получил lock1");
                    try {
                        Thread.sleep(1000);// имитация работы
                    } catch (
                            InterruptedException e) {
                        System.out.println("Thread-2 interrupted.");
                    }
                }
                System.out.println("Thread-2 освободил lock1");
            }
            System.out.println("Thread-2 освободил lock2");
        }
    }
}