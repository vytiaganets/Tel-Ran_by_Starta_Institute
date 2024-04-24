//Реализовать модель кафе:
//посетитель (отдельный поток)
//- заходит в кафе
//- делает заказ
//- ждет кофе
//- пьет кофе
//официант (отдельный поток)
//- ждет посетителя
//- готовит кофе
//- приносит посетителю
//Implement the cafe model:
//visitor (separate thread)
//- enters the cafe
//- makes an order
//- waiting for coffee
//- drinks cofee
//waiter (separate thread)
//- waits for a visitor
//- prepares coffee
//- brings to the visitor
package de.telran.lesson20240422practice;

public class Task2 {
    public static void main(String[] args) {
        Object object = new Object();
        Thread visitor = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " заходит в кафе ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " делает заказ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " ждет кофе");
            synchronized (object) {
                try {
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " пьет кофе");
        });

        Thread waiter = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " ждет посетителя");
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " готовит кофе");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " приносит посетителю");
                object.notify();
            }
        });

        visitor.start();
        waiter.start();
        //Thread-1 ждет посетителя
        //Thread-0 заходит в кафе
        //Thread-0 делает заказ
        //Thread-0 ждет кофе
        //Thread-1 готовит кофе
        //Thread-1 приносит посетителю
        //Thread-0 пьет кофе
    }
}