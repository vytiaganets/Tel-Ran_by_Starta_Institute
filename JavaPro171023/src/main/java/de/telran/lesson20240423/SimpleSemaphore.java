package de.telran.lesson20240423;

import java.util.concurrent.Semaphore;

public class SimpleSemaphore {
    public static void main(String[] args) throws InterruptedException {
        // Ограничить количество одновременно работающих потоков
        Semaphore semaphore = new Semaphore(3, true);
        for (int i = 0; i < 10; i++) {
            new Thread(new ThreadTest(semaphore)).start();
            Thread.sleep(500);
        }
        //Thread-0 начал работать 1713865170882
        //Thread-1 начал работать 1713865171388
        //Thread-2 начал работать 1713865171892
        //Thread-0 закончил работать
        //Thread-3 начал работать 1713865172929
        //Thread-1 закончил работать
        //Thread-4 начал работать 1713865173394
        //Thread-2 закончил работать
        //Thread-5 начал работать 1713865173894
        //Thread-3 закончил работать
        //Thread-6 начал работать 1713865174935
        //Thread-4 закончил работать
        //Thread-7 начал работать 1713865175398
        //Thread-5 закончил работать
        //Thread-8 начал работать 1713865175898
        //Thread-6 закончил работать
        //Thread-9 начал работать 1713865176940
        //Thread-7 закончил работать
        //Thread-8 закончил работать
        //Thread-9 закончил работать
    }
}
