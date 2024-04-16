package de.telran.lesson20240416;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleAtomic {

    public static void main(String[] args) throws InterruptedException {

//      показывает классический подход, который не отработает желаемым образом
        // classic
        CounterClassic c = new CounterClassic();

        Thread thread1Classic = new Thread(c, "First");
        Thread thread2Classic = new Thread(c, "Second");

        thread1Classic.start();
        thread2Classic.start();

        thread1Classic.join();
        thread2Classic.join();

        System.out.println("Classic = " + c.getCounter());//Classic = 1255375  -  без синхронизации



//      показываем как можно его решить с synchronized
        // synchronized
        CounterSync cs = new CounterSync();

        Thread thread1Sync = new Thread(cs, "First");
        Thread thread2Sync = new Thread(cs, "Second");

        thread1Sync.start();
        thread2Sync.start();

        thread1Sync.join();
        thread2Sync.join();

        System.out.println("Synchronized = " + cs.getCounter());


//       показываем как работают atomic types, можно заменит на atmoiclong для демонстрации
        // atomic
        CounterAtomic ca = new CounterAtomic();

        Thread thread1Atom = new Thread(ca, "First");
        Thread thread2Atom = new Thread(ca, "Second");

        thread1Atom.start();
        thread2Atom.start();

        thread1Atom.join();
        thread2Atom.join();

        System.out.println("Atomic = " + ca.getCounter());
        //Classic = 1823435
        //Synchronized = 2000000
        //Atomic = 2000000
    }
}


class CounterClassic extends Thread {
    private int counter = 0;

    @Override
    public void run() {

        int max = 1_000_000;

        for (int i = 0; i < max; i++)
            ++counter;
        //tmp = counter
        //tmp = tmp+1
        //count = tmp
    }

    public int getCounter() {
        return counter;
    }
}

class CounterSync extends Thread {
    private int counter = 0;

    @Override
    public /*synchronized*/ void run() {
        System.out.println(Thread.currentThread().getName()+" -> started");

        int max = 1_000_000;

        for (int i = 0; i < max; i++)
            synchronized (this) {//2_000_000 is синхронизация критической секции кода
                ++counter;
            }
        System.out.println(Thread.currentThread().getName()+" -> ended");
    }

    public int getCounter() {
        return counter;
    }
}


class CounterAtomic extends Thread {
    private AtomicInteger counter = new AtomicInteger();

    @Override
    public synchronized void run() {

        int max = 1_000_000;

        for (int i = 0; i < max; i++)
            counter.addAndGet(1);


    }

    public int getCounter() {
        return counter.get();
    }
}