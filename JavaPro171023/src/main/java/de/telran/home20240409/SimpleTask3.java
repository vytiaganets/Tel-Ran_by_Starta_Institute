//3**. В классе писали задачу для поиска всех простых числа в диапазоне до 1_000_000.
//Напишите программу, запустив которую вы сможете определить оптимальное количество
//создаваемых потоков для выполнения этой задачи на текущем компьютере.
//Используйте общее время выполнения программы при обработке всего диапазона чисел
//для расчета оптимального количества созданных потоков.
//3**. In class we wrote a problem to find all prime numbers in the range up to 1_000_000.
//Write a program that, by running it, you can determine the optimal amount
//threads to create to perform this task on the current computer.
//Use the total program execution time when processing the entire range of numbers
//to calculate the optimal number of created threads.
package de.telran.home20240409;

public class SimpleTask3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-- старт --");
        long startTime = System.currentTimeMillis();
        ThreadTask task1 = new ThreadTask(2, 200000);
        ThreadTask task2 = new ThreadTask(200001, 400000);
        ThreadTask task3 = new ThreadTask(400001, 600000);
        ThreadTask task4 = new ThreadTask(600001, 8000000);
        ThreadTask task5 = new ThreadTask(800001, 1_000_000);
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();

        task1.join();
        task2.join();
        task3.join();
        task4.join();
        task5.join();

        System.out.println(Thread.currentThread().getName() + "  -> Main Time = " + (System.currentTimeMillis() - startTime));
        System.out.println("--конец--");

        //-- старт --
        //Thread-0 -> Count = 17984 ---- 2 .... 200000
        //Thread-0  -> Time = 14504
        //Thread-1 -> Count = 15876 ---- 200001 .... 400000
        //Thread-1  -> Time = 36504
        //Thread-2 -> Count = 15238 ---- 400001 .... 600000
        //Thread-2  -> Time = 54573
        //Thread-4 -> Count = 14547 ---- 800001 .... 1000000
        //Thread-4  -> Time = 74801
    }
}

class ThreadTask extends Thread {
    private int start;
    private int end;

    public ThreadTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        System.out.println(Thread.currentThread().getName() + " -> Count = " + count + " ---- " + start + " .... " + end);
        System.out.println(Thread.currentThread().getName() + "  -> Time = " + (System.currentTimeMillis() - startTime));

    }
}
