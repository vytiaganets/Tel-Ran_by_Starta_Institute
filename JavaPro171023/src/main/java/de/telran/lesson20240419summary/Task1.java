
package de.telran.lesson20240419summary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        int numOfThreads = 8;
        Object object = new Object();
        List<Integer> wholeNumbers = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        int k = 100_000;
        CountDownJoin countDownJoin = new SyncCountDownJoin(numOfThreads);

       long startTime = System.nanoTime();
        for (int i = 0; i < numOfThreads; i++) {

            int finalI = i;
            Thread thread = new Thread(() -> {

                for (int j = 0; j < k; j++) {
                    synchronized (object) {
                        wholeNumbers.add(j);
                    }
                }
                countDownJoin.countDown();
            });

            thread.start();
//            thread.join();

//            threads.add(thread);
        }
//        for (int i = 0; i < threads.size(); i++) {
//            threads.get(i).join();
//        }

        countDownJoin.waitWhenZero();

        long endTime = System.nanoTime();

//        System.out.println(wholeNumbers);
        System.out.println(wholeNumbers.size());
        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime));

        //800000
        //242
    }


}
// Нужно создать N потоков, каждый из которых добавляет целые числа от (i * n) до ((i + 1) * n) в общий список
// Потоку main нужно дождаться завершения всех потоков и вывести вписок на экран.
