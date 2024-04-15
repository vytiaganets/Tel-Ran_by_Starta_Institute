//Спортивное соревнование. Бегут 3 бегуна. Каждый пробегает дистанцию за случайное время. Каждый бегун земеряет свой результат
//и сообщает его тренеру. В конце забега выводится информация о победителе. Реализовать данную модель с помощью запуска отдельных потоков.
//Бегуна представить через класс Runner implements Runnable.
//Sports competition. 3 runners are running. Everyone runs the distance in a random time. Each runner measures his result
//and reports it to the coach. At the end of the race, information about the winner is displayed. Implement this model by launching separate threads.
//Represent the runner through the class Runner implements Runnable.
package de.telran.lesson20240415practice;

import java.util.Random;

public class Runners {
    public static void main(String[] args) {
        System.out.println("Start main");
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();

        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            System.out.println("runner1 -> " + runner1.duration);
            System.out.println("runner2 -> " + runner2.duration);
            System.out.println("runner3 -> " + runner3.duration);
        } catch (
                InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finish main");
    }

    static class Runner implements Runnable {
        public long duration;
        Random random = new Random();

        @Override
        public void run() {
            try {
                long start = System.currentTimeMillis();
                System.out.println(Thread.currentThread().getName() + " Start");
                Thread.sleep(10_000 + random.nextInt(10_000));
                System.out.println(Thread.currentThread().getName() + " Finish");
                long end = System.currentTimeMillis();
                duration = end - start;
            } catch (
                    InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //Start main
        //Thread-1 Start
        //Thread-0 Start
        //Thread-2 Start
        //Thread-0 Finish
        //Thread-2 Finish
        //Thread-1 Finish
        //runner1 -> 12435
        //runner2 -> 17088
        //runner3 -> 15777
        //Finish main
    }
}