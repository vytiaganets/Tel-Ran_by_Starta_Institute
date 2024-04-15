package de.telran.lesson20240412summary;
import java.util.concurrent.atomic. AtomicInteger;
public class Threads {
        public static void main(String[] args) throws InterruptedException {
            AtomicInteger integer = new AtomicInteger();
            Checker checker = new Checker();
            Thread thread1 = new Thread(checker);
            thread1.setDaemon(true);
            thread1.start();
            Thread.sleep(5000);
            Thread thread2 = new Thread(() -> {
                checker.flag = true;
                System.out.println("Flag is true");
            });
            thread2.start();
//            Thread. sleep (1000);
//            System.out.println(integer);
            thread2.join();

            System.out.println("Here");

        }
}
class Checker implements Runnable {
    public volatile boolean flag = false;

    @Override
    public void run() {
        System.out.println("While Loop started");
        while (!flag) {
        }
        System.out.println("Completed");
    }
}