//1. У вас в магазине распродажа. К вам набежало 10 000 клиентов и вы пытаетесь корректно всех обслужить с учетом того,
//что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно карантинным нормам)
//и время обслуживания одного покупателя занимает 30 секунд (это время можно менять, чтобы увидеть окончание работы ;)). Сымитируйте данный процесс работы и
//подсчитайте за какой период времени вы сможете обслужить данный объем покупателей?
//Отдельный покупатель - отдельный поток. Какой синхронизатор с библиотеки concurrent Вы бы использовали?
//1. You're having a sale in your store. 10,000 clients have come to you and you are trying to serve everyone correctly, taking into account the fact that
//that you can have no more than 10 customers inside your store at the same time (according to quarantine standards)
//and the service time for one customer takes 30 seconds (this time can be changed to see the end of the work ;)). Simulate this work process and
//calculate over what period of time you can serve this volume of customers?
//Separate buyer - separate thread. Which synchronizer from the concurrent library would you use?

package de.telran.home20240423;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SimpleTask1 {
    private static final int TOTAL_CUSTOMERS = 10_000;
    private static final int CUSTOMERS_INSIDE = 10;
    private static final int SERVICE_TIME = 30;

    private static int customersCount = 0;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(CUSTOMERS_INSIDE);
        Semaphore semaphore = new Semaphore(CUSTOMERS_INSIDE);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TOTAL_CUSTOMERS; i++) {
            executorService.submit(new Customer(semaphore, customersCount++));
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (
                InterruptedException e) {
            e.printStackTrace();


            long endTime = System.currentTimeMillis();

            System.out.println("Все клиенты обслужены");
            long totalTime = endTime - startTime;
            System.out.println("Общее время обслуживания: " + totalTime + "миллисекунд");
        }

    }

    static class Customer implements Runnable {

        private final Semaphore semaphore;
        private final int customerID;

        public Customer(Semaphore semaphore, int customerID) {
            this.semaphore = semaphore;

            this.customerID = customerID;
        }

        @Override
        public void run() {

            try {
                semaphore.acquire();
                System.out.println("Клиент " + customerID + " вошел в магазин");
                TimeUnit.SECONDS.sleep(SERVICE_TIME);
                System.out.println("Клиент " + customerID + " оставил магазин");

            } catch (
                    InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }

    private static String formatTime(long millis) {
        long hours = TimeUnit.MILLISECONDS.toHours(millis);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis) % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }
}