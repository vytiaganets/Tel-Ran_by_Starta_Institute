//2*. Создайте 2 потока (1 - Курица, 2 - Яйцо).
//Первый будет постоянно выводить слово "Курица" и останавливаться на 1 сек.
//Второй будет постоянно выводить слово "Яйцо" и тоже останавливаться на 1 сек.
//Главный поток выводит на экран сообщение "Кто же первый? " и запускает оба дочерних потока.
//Потом главный поток спрашивает у пользователя: "Кто же прав?"
//Если пользователь вводит 1, главный поток выключает поток, который выводит "Яйцо".
//Если вводит 2, главный поток выключает дочерний поток, который выводит "Курица".
//Иначе выключает оба потока и возвращает фразу "Как же вы надоели!".
//2*. Create 2 threads (1 - Chicken, 2 - Egg).
//The first one will constantly display the word "Chicken" and stop for 1 second.
//The second one will constantly display the word “Egg” and also stop for 1 second.
//The main thread displays the message "Who's on first?" and starts both child threads.
//Then the main thread asks the user: "Who is right?"
//If the user enters 1, the main thread turns off the thread that outputs "Egg".
//If enters 2, the main thread turns off the child thread, which outputs "Chicken".
//Otherwise, turns off both threads and returns the phrase “How tired of you!”
package de.telran.home20240411;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleThreads2 {
    public static void main(String[] args) throws InterruptedException {
        //conception:
        //1поток средслип
        //2 потока создаем ран метод
        //курица в методе ран
        //в методе мейн
        //Кто же первый?
        //Кто же прав?
        //нью сред
        //сканер
        //интерапт в ифе
//        ThreadTask2 task1 = new ThreadTask2 ("Курица");
//        ThreadTask2 task2 = new ThreadTask2 ("Яйцо");
//        Thread.sleep(1_000);
//        task1.interrupt();


        CyclicBarrier start = new CyclicBarrier(2), end = new CyclicBarrier(3);
        AtomicInteger eq = new AtomicInteger(0), cq = new AtomicInteger(0);
        BlockingQueue<Integer> queuePrint = new ArrayBlockingQueue<>(2);
        Thread egg = new Thread(() -> {
            try {
                do {
                    end.await();
                    start.await();
                    queuePrint.put(0);
                } while (!Thread.currentThread().isInterrupted());
            } catch (
                    InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (
                    BrokenBarrierException ignored) {
            }
        }), chicken = new Thread(() -> {
            try {
                do {
                    end.await();
                    start.await();
                    queuePrint.put(1);
                } while (!Thread.currentThread().isInterrupted());
            } catch (
                    InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (
                    BrokenBarrierException ignored) {
            }
        }), observer = new Thread(() -> {
            try {
                do {
                    end.await();
                    Integer i1 = queuePrint.take(), i2 = queuePrint.take();
                    if (i1 > i2) {
                        eq.incrementAndGet();
                        cq.set(0);
                        System.out.println("яйцо");
                    } else {
                        cq.incrementAndGet();
                        eq.set(0);
                        System.out.println("курица");
                    }
                } while (!Thread.currentThread().isInterrupted() && eq.get() != 2 && cq.get() != 2);
            } catch (
                    InterruptedException e) {
                Thread.currentThread().interrupt();
            } catch (
                    BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        });

        Scanner sc = new Scanner(System.in);
        System.out.println("Кто же прав?");
        System.out.println("Введите номер 1 || 2:");
        int num1 = sc.nextInt();

        egg.start();
        chicken.start();
        observer.start();
        observer.join();
        if(num1 == 1){
            egg.interrupt();
        } else if (num1 == 2) {
            chicken.interrupt();
        } else {
            System.out.println("Как же вы надоели!");
        }
        if (eq.get() > 0) {
            System.out.println("яйцо победа");
        } else {
            System.out.println("куриная победа");
        }
        //Кто же прав?
        //Введите номер 1 || 2:
        //1
        //яйцо
        //курица
        //яйцо
        //яйцо
        //яйцо победа
    }
}