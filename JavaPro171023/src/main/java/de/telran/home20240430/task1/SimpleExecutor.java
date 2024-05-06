//1. Напишите программу просчета количества всех простых в диапазоне до 1 000 000.
//Просчет выполняйте в 4 потоках, которые создаются с помощью Callable.
//Получите результаты подсчета из каждого потока и напечатайте общий результат.
//1. Write a program to calculate the number of all primes in the range up to 1,000,000.
//Perform the calculation in 4 threads, which are created using Callable.
//Get counting results from each thread and print the total result.
package de.telran.home20240430.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SimpleExecutor {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        int numberOfThreads = Runtime.getRuntime().availableProcessors();

        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        int totalRange = 1_000;
        int currentRange = totalRange / numberOfThreads;
        int start = 0;
        int end = start + currentRange;

        List<PrimeNumbersTask> taskList = new ArrayList<>();
        for (int i = 0; i < numberOfThreads; i++) {

            taskList.add(new PrimeNumbersTask(start, end));

            start = end + 1;
            end = start + currentRange - 1;
            if (i == (numberOfThreads - 2)) {
                end = totalRange;
            }
        }
        executorService.invokeAll(taskList);

        List<Future<Integer>> futures = executorService.invokeAll(taskList);

        int result = 0;
        for (Future<Integer> future : futures) {

            System.out.println("Counting results from each thread: " + future.get());
            result = result + future.get();
        }
        System.out.println("Overall result: " + result);

        executorService.shutdown();
        //Counting results from each thread: 55
        //Counting results from each thread: 42
        //Counting results from each thread: 37
        //Counting results from each thread: 36
        //Overall result: 170
    }
}