//Вы едете на экскурсию. Каждый человек, при входе в автобус, называет свою фамилию. Экскурсовод ставит у себя в блокноте птичку и если количество людей по списку совпадает автобус уезжает на экскурсию. Сымитируйте данный процесс работы. Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?

//You are going on an excursion. Each person, upon entering the bus, says his last name. The guide puts a bird in his notebook and if the number of people on the list matches, the bus leaves for the excursion. Simulate this work process. Which synchronizer from the concurrent library would you use for this process?
package de.telran.home20240423;

import java.util.concurrent.CountDownLatch;

public class SimpleTask2 {
    public static void main(String[] args) throws InterruptedException {
        String[] touristNames = new String[]{"Smith", "Green", "Anderson", "Brown", "Johnson", "Taylor", "Wilson", "Evans"};

        CountDownLatch countDownLatch = new CountDownLatch(touristNames.length);

        for (int i = 0; i < touristNames.length; i++) {
            new Tourist(touristNames[i], countDownLatch).start();
            Thread.sleep(100);
        }
        System.out.println("Все туристы собрались, и автобус уехал на экскурсию");
        //Моя фамилия: Smith
        //Smith ждёт в автобусе.
        //Моя фамилия: Green
        //Green ждёт в автобусе.
        //Моя фамилия: Anderson
        //Anderson ждёт в автобусе.
        //Моя фамилия: Brown
        //Brown ждёт в автобусе.
        //Моя фамилия: Johnson
        //Johnson ждёт в автобусе.
        //Моя фамилия: Taylor
        //Taylor ждёт в автобусе.
        //Моя фамилия: Wilson
        //Wilson ждёт в автобусе.
        //Моя фамилия: Evans
        //Evans ждёт в автобусе.
        //Все туристы собрались, и автобус уехал на экскурсию
    }
}
