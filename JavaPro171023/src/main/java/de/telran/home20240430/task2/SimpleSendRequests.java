//2*. У вас есть задача проверять какой то сайт, с целью проверки опубликования
//на нем новой информации, но если мы будем слишком часто проверять этот сайт,
//то нас могут "забанить" за спам. Чтобы избежать этого, вы должны слать свои запросы
//не чаще чем один раз в минуту.
//Ваша задача должна работать параллельно основной функциональности и не занимать ресурсы
//главного потока.
//Подумайте, какой механизм Java вы могли бы использовать для автоматизации данной задачи.
//Как реализацию работы с сайтом, просто выведите сообщение о том, что соединение
//установлено и выведите текущее время.
//2*. You have a task to check some site in order to check the publication
//there is new information on it, but if we check this site too often,
//then we can be “banned” for spam. To avoid this, you should send your requests
//no more than once per minute.
//Your task should work in parallel with the main functionality and not take up resources
//main thread.
//Think about what Java mechanism you could use to automate this task.
//As an implementation of working with the site, simply display a message indicating that the connection
//set and print the current time.
package de.telran.home20240430.task2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SimpleSendRequests {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        long delay = 0;
        for (int i = 0; i < 10; i++) {
            scheduler.schedule(new Request(i), delay, TimeUnit.MINUTES);
            delay++;
        }
        scheduler.shutdown();
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " - The main thread continues to run");
            Thread.sleep(1_000);
        }
        //0 - The main thread continues to run
        //pool-1-thread-1: Request - 0 - Connection established
        //Current time: 21:01:13.043610
        //1 - The main thread continues to run
        //2 - The main thread continues to run
        //3 - The main thread continues to run
        //4 - The main thread continues to run
        //5 - The main thread continues to run
        //6 - The main thread continues to run
        //7 - The main thread continues to run
        //8 - The main thread continues to run
        //9 - The main thread continues to run
        //pool-1-thread-1: Request - 1 - Connection established
        //Current time: 21:02:12.987013
        //10 - The main thread continues to run
        //11 - The main thread continues to run
        //12 - The main thread continues to run
        //13 - The main thread continues to run
        //14 - The main thread continues to run
        //15 - The main thread continues to run
        //16 - The main thread continues to run
        //17 - The main thread continues to run
        //18 - The main thread continues to run
        //19 - The main thread continues to run
        //pool-1-thread-1: Request - 2 - Connection established
        //Current time: 21:03:12.983690
        //pool-1-thread-1: Request - 3 - Connection established
        //Current time: 21:04:12.986007
        //pool-1-thread-1: Request - 4 - Connection established
        //Current time: 21:05:12.988618
        //pool-1-thread-1: Request - 5 - Connection established
        //Current time: 21:06:12.988610
        //pool-1-thread-1: Request - 6 - Connection established
        //Current time: 21:07:12.985646
        //pool-1-thread-1: Request - 7 - Connection established
        //Current time: 21:08:12.989254
        //pool-1-thread-1: Request - 8 - Connection established
        //Current time: 21:09:12.985712
        //pool-1-thread-1: Request - 9 - Connection established
        //Current time: 21:10:12.989128
    }
}