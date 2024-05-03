//Примеры расчетных задач
//Пример. #2. Проверка целых чисел на делимость
//Задача: найти все простые числа в диапазоне до 1 000 000.
//очевидное решение:
//int count = 0;
//for (int i = 2; i < 1000000; i++) {
//boolean isPrime = true;
//for (int j=2; j < i; it+) {
//if (i % i == 0) {
//isPrime = false;
//break;
//}
//}
//if (isPrime)
//count++;
//}
//System.out println ("Total numbers of prime: " + count);
package de.telran.lesson20240430practice;

import java.util.List;
import java.util.concurrent.*;

public class task2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        int count = 0;
//        for (int i = 2; i < 1000; i++) {
//            boolean isPrime = true;
//            for
//            (int j=2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime)
//                count++;
//        }
//        System.out.println("Total numbers of prime:  "+ count);
        //4
        //Total numbers of prime: 1229

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Task task1 = new Task(2, 2500);
        Task task2 = new Task(2501, 5000);
        Task task3 = new Task(5001, 7500);
        Task task4 = new Task(7501, 10000);
//        executorService.submit(task1);
//        executorService.submit(task2);
//        executorService.submit(task3);
//        executorService.submit(task4);
        List<Task> list = List.of(task1, task2, task3, task4);
        executorService.invokeAll(list);
        //Future<Integer> future1 = executorService.submit(task1);
        List<Future<Integer>> futures = executorService.invokeAll(list);
//        Future<Integer> future2 = executorService.submit(task2);
//        Future<Integer> future3 = executorService.submit(task3);
//        Future<Integer> future4 = executorService.submit(task4);
        int result = 0;
        for (Future<Integer> future : futures){
            result = result + future.get();
        }
        //Integer result = future1.get() + future2.get() + future3.get() + future4.get();
        System.out.println(result);//1229

    }

    static class Task implements Callable<Integer> {
        int start;
        int end;
        public Task(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Integer call() throws Exception {
            int count1 = 0;
            for (int i = start; i < end; i++) {//не включать диапазон
                boolean isPrime = true;
                for
                (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    count1++;
            }
            return count1;
        }
    }
}

