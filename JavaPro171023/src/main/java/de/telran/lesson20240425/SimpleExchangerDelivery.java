package de.telran.lesson20240425;

import java.util.Random;
import java.util.concurrent.Exchanger;

public class SimpleExchangerDelivery {
    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger = new Exchanger<>();

        //Формируем груз для 1 грузовика
        String[] p1 = new String[]{"{посылка A->D}", "{посылка A->C}"};

        //Формируем груз для 2 грузовика
        String[] p2 = new String[]{"{посылка B->C}", "{посылка B->D}"};


        //Отправляем 1 грузовик А -> D
        new Thread(new Truck(1, "A", "D", p1, exchanger)).start();

        Thread.sleep(100);

        //Отправляем 2 грузовик В -> С
        new Thread(new Truck(2, "B", "C", p2, exchanger)).start();

        //В грузовик 1 погрузили: {посылка A->D} и {посылка A->C}
        //Грузовик 1 выехал из пункта A в пункт D с остановкой в пункте E
        //В грузовик 2 погрузили: {посылка B->C} и {посылка B->D}
        //Грузовик 2 выехал из пункта B в пункт C с остановкой в пункте E
        //Грузовик 2 приехал в пункт Е -> 1714034921656
        //Грузовик 1 приехал в пункт Е -> 1714034923539
        //В грузовик 1 переместили посылку для пункта D
        //В грузовик 2 переместили посылку для пункта C
        //Грузовик 1 приехал в D и доставил: {посылка A->D} и {посылка B->D}
        //Грузовик 2 приехал в C и доставил: {посылка B->C} и {посылка A->C}
    }
}

// Задача из логистики, как выбрать наиболее оптимальный путь при доставке товаров
//  A  _ _ _ _             _ _ _ _ B
//            \          /
//              - - E - -
//    _ _ _ _ /          \ _ _ _ _
//  C                              D
//
// E - точка обмена

// необходимо доставить посылки двумя грузовиками
// грузовик 1: посылка A -> C и A -> D
// грузовик 2: посылка B -> C и B -> D

// каждый грузовик может поехать по наиболее прямому пути, но это не оптимально
// можно создать пункт E для обмена конечными посылками, что
// итоговые конечные точки были одинаковые, то есть
// грузовик 1: посылка A -> C и A -> D, после обмена: A -> D и B -> D
// грузовик 2: посылка B -> C и B -> D, после обмена: B -> C и A -> C

class Truck implements Runnable {
    private int number;
    private String departure;
    private String destination;
    private String[] parcels;
    private Exchanger<String> exchanger;

    public Truck(int number, String departure, String destination, String[] parcels, Exchanger<String> exchanger) {
        this.number = number;
        this.departure = departure;
        this.destination = destination;
        this.parcels = parcels;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            System.out.println("В грузовик " + number + " погрузили: " + parcels[0] + " и " + parcels[1]);
            System.out.println("Грузовик " + number + " выехал из пункта " + departure + " в пункт " + destination + " с остановкой в пункте E");

            Thread.sleep(r.nextInt(2, 5) * 1000L); // имитация времени поездки

            System.out.println("Грузовик " + number + " приехал в пункт Е -> " + System.currentTimeMillis());

            //При вызове exchange() поток блокируется и ждет пока другой
            // поток вызовет exchange(), после этого произойдет обмен посылками
            parcels[1] = exchanger.exchange(parcels[1]);

            System.out.println("В грузовик " + number + " переместили посылку для пункта " + destination);

            Thread.sleep(r.nextInt(2, 5) * 1000L); //имитация времени второй половины дороги

            System.out.println("Грузовик " + number + " приехал в " + destination + " и доставил: " + parcels[0] + " и " + parcels[1]);
        } catch (
                InterruptedException e) {
        }
    }
}