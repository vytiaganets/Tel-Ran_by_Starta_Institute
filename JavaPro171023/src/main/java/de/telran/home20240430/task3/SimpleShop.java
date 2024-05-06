//3*. В одном из предыдущий ДЗ у вас была задача:
//У вас в магазине распродажа. К вам набежало 10 000 клиентов и вы пытаетесь корректно всех обслужить с
//учетом того, что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно
//карантинным нормам) и время обслуживания одного покупателя занимает 30 секунд.
//Сымитируйте данный процесс работы и подсчитайте за какой период времени вы сможете обслужить данный
//объем покупателей?
//Отдельный покупатель - отдельный поток.
//Можно было бы реализовать данную задачу не используя семафор?
//3*. In one of the previous DBs you had the task:
//You have a sale in your store. 10,000 clients have come to you and you are trying to serve everyone correctly with
//taking into account the fact that at the same time you can have no more than 10 customers inside the store (according to
//quarantine standards) and the service time for one customer takes 30 seconds.
//Simulate this work process and calculate over what period of time you can service this
//volume of buyers?
//Separate buyer - separate thread.
//It would be possible to implement this task without using a semaphore?
package de.telran.home20240430.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class SimpleShop {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Client> clientList = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) {
            clientList.add(new Client());
        }
        executorService.invokeAll(clientList);
        List<Future<Long>> results = executorService.invokeAll(clientList);
        long timeResult = 0;
        for (Future<Long> result : results) {
            timeResult = timeResult + result.get();
        }
        System.out.println("Total service time: " + timeResult);
        executorService.shutdown();
        //pool-1-thread-1: Customer entered the store
        //pool-1-thread-2: Customer entered the store
        //pool-1-thread-1: The customer left the store
        //pool-1-thread-2: The customer left the store
        //pool-1-thread-2: Service time per customer: 1012
        //pool-1-thread-1: Service time per customer: 1008
        //pool-1-thread-2: Customer entered the store
        //pool-1-thread-1: Customer entered the store
        //pool-1-thread-2: The customer left the store
        //pool-1-thread-2: Service time per customer: 1002
        //pool-1-thread-2: Customer entered the store
        //pool-1-thread-1: The customer left the store
        //pool-1-thread-1: Service time per customer: 1005
        //...
    }
}