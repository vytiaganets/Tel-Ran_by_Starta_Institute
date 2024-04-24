//// пример применения CountDownLatch в процессе отправления людей в отпуск, у нас 8 человек, которые
//// желают отправиться в отпуск. В аэропорту они выполняют обычные действия, такие как регистрация,
//// сдача багажа. Делают они это по отдельности, а после этого уже группой садятся в самолет и вылетают
package de.telran.lesson20240423;

import java.util.concurrent.CountDownLatch;

public class SimpleCountDownLatch {
    public static void main(String[] args) throws Exception {

        CountDownLatch countDownLatch = new CountDownLatch(8);

        // список людей, кто желает полететь на отдых
        String[] personNames = new String[]{"Roman", "Alena", "Kira", "Anna", "Leo", "Bob", "Vladislav", "Inna"};

        for (int i = 0; i < personNames.length; i++) {
            new Thread(new PersonInAirport(personNames[i], countDownLatch)).start();
            Thread.sleep(700);
        }
        //-> Roman приехал в аэропорт.
        //[!] Roman сдал багаж
        //[!] Roman успел перекусить
        //
        //-> Alena приехал в аэропорт.
        //[!] Alena сдал багаж
        //[!] Alena успел перекусить
        //
        //-> Kira приехал в аэропорт.
        //[!] Kira сдал багаж
        //[!] Kira успел перекусить
        //
        //-> Anna приехал в аэропорт.
        //[!] Anna сдал багаж
        //[!] Anna успел перекусить
        //
        //-> Leo приехал в аэропорт.
        //[!] Leo сдал багаж
        //[!] Leo успел перекусить
        //
        //-> Bob приехал в аэропорт.
        //[!] Bob сдал багаж
        //[!] Bob успел перекусить
        //
        //-> Vladislav приехал в аэропорт.
        //[!] Vladislav сдал багаж
        //[!] Vladislav успел перекусить
        //
        //-> Inna приехал в аэропорт.
        //[!] Inna сдал багаж
        //[!] Inna успел перекусить
        //
        //Inna группой вылетел на отдых
        //Roman группой вылетел на отдых
        //Alena группой вылетел на отдых
        //Kira группой вылетел на отдых
        //Anna группой вылетел на отдых
        //Leo группой вылетел на отдых
        //Bob группой вылетел на отдых
        //Vladislav группой вылетел на отдых
    }
}
class PersonInAirport implements Runnable {
    private String personName;
    private CountDownLatch countDownLatch;

    public PersonInAirport(String personName, CountDownLatch countDownLatch) {
        this.personName = personName;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {

        try {
            // список дел, которые буду выполнены в рамках каждого потока (человека) самостоятельно
            System.out.println("-> " + personName + " приехал в аэропорт.");
            System.out.println("[!] " + personName + " сдал багаж");
            System.out.println("[!] " + personName + " успел перекусить");

            countDownLatch.countDown(); //-1

            System.out.println(" ожидает других.");
            countDownLatch.await(); // когда count==0 все выходят из состояния ожидания

            // финальное - выполнится то, что находится после await() метода
            System.out.println(personName + " группой вылетел на отдых");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}