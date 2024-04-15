// 1. Запустите в 3 потока просчет суммы всех чисел, который без остатка делятся на 17 в интервале от 0 до 10 млн.
//Показывайте на экран, как будет накапливаться сумма по каждому потоку.
//После запуска просчета, главный поток остановите на 1 секунду и завершите его.
//Все дочерние потоки должны автоматически закрыться.
// 1. Run 3 threads to calculate the sum of all numbers that are divisible by 17 without a remainder in the range from 0 to 10 million.
//Show on the screen how the sum will accumulate for each thread.
//After starting the rendering, stop the main thread for 1 second and terminate it.
//All child threads should close automatically.
package de.telran.home20240411;

public class SimpleSumThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadTask task1 = new ThreadTask (17, 3_000_000);
        ThreadTask task2 = new ThreadTask (3_000_001, 6_000_000);
        ThreadTask task3 = new ThreadTask (6_000_001, 10_000_000);
        task1.setDaemon(true);
        task2.setDaemon(true);
        task3.setDaemon(true);
        task3.start();
        task2.start();
        task1.start();
        Thread.sleep(1000);
        System.out.println("-end--");
        //...
        //Thread Thread-2 6444462
        //Thread Thread-2 6444479
        //Thread Thread-2 6444496
        //Thread Thread-2 6444513
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
        long sum = 0;
        for (int i = start; i < end; i++) {
                if (i % 17 == 0) {
                    sum=+i;
                    System.out.println("Thread " + Thread.currentThread().getName() + " " + sum);
                }
        }
    }
}