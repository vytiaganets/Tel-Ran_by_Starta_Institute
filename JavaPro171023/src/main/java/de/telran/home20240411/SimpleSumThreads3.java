//Запустите в 3 потока просчет количества всех простых чисел в интервале от 2 до 1000000.
//Через 5 секунд завершите принудительно выполнение 1-го потока командой из главного.
//Через 10 секунд завершите и 2-й поток.
//Через 15 секунд - 3-й поток.
//Время подкорректируйте под скорость своего компьютера.
//Run 3 threads to calculate the number of all prime numbers in the range from 2 to 1000000.
//After 5 seconds, forcefully terminate the 1st thread with a command from the main thread.
//After 10 seconds, terminate the 2nd thread.
//After 15 seconds - 3rd thread.
//Adjust the time to the speed of your computer.
package de.telran.home20240411;

public class SimpleSumThreads3 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTask3 task1 = new ThreadTask3(2, 300_000);
        ThreadTask3 task2 = new ThreadTask3(300_001, 600_000);
        ThreadTask3 task3 = new ThreadTask3(600_001, 1_000_000);
        task1.setDaemon(true);
        task2.setDaemon(true);
        task3.setDaemon(true);
        task3.start();
        task2.start();
        task1.start();
        Thread.sleep(5_000);
        task1.interrupt();

        Thread.sleep(5_000);
        task2.interrupt();

        Thread.sleep(5_000);
        task3.interrupt();

        System.out.println("-end-");
        //Thread Thread-0 25997
        //Thread Thread-1 23101
        //Thread Thread-2 29400
        //-end-
    }
}

class ThreadTask3 extends Thread {
    private int start;
    private int end;

    public ThreadTask3(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        long count = 0;
        for (int i = start; i < end; i++) {
            if (checkSimple(i)) {
                count++;
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " " + count);
    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}