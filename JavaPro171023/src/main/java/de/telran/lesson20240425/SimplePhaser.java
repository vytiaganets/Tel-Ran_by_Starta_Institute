package de.telran.lesson20240425;

import java.util.concurrent.Phaser;

public class SimplePhaser {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("Стартуем потоки");

        new Thread(new MyThread(phaser, "A")).start();
        new Thread(new MyThread(phaser, "B")).start();
        new Thread(new MyThread(phaser, "C")).start();


        curPhase = phaser.getPhase();

        // ожидаем завершения всеми потоками первой фазы
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " окончена");


        curPhase = phaser.getPhase();

        // ожидаем завершения всеми потоками второй фазы
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " окончена");

        // снимаем основной поток исполнения с регистрации
        phaser.arriveAndDeregister();
        Thread.sleep(1_000);
        if (phaser.isTerminated())
            System.out.println("Phaser окончил работу");
        //Стартуем потоки
        //Поток A запустился в первой фазе
        //Поток B запустился в первой фазе
        //Поток C запустился в первой фазе
        //Phase 0 окончена
        //Поток C запустился во второй фазе
        //Поток B запустился во второй фазе
        //Поток A запустился во второй фазе
        //Phase 1 окончена
        //Поток A запустился в третьей фазе
        //Поток B запустился в третьей фазе
        //Поток C запустился в третьей фазе
    }
}

class MyThread implements Runnable {
    Phaser phaser;
    String name;

    public MyThread(Phaser phaser, String name) {

        this.phaser = phaser;
        this.name = name;

        phaser.register();
    }

    @Override
    public void run() {
        System.out.println("Поток " + name + " запустился в первой фазе");
        phaser.arriveAndAwaitAdvance();

        // небольшая пауза, чтобы не нарушать порядок вывода. Только для демонстрации, в реальности этого может не быть
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Поток " + name + " запустился во второй фазе");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Поток " + name + " запустился в третьей фазе");
        phaser.arriveAndAwaitAdvance();
    }
}