//В. Кассир в магазине. К нему подходят клиенты с товарам отдают ему деньги и получают сдачу.
//По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
//Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы. Сумма оплаты и сумма сдачи может быть сгенерирована случайным образом.
//Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?
//B. Cashier in a store. Customers come up to him with goods, give him money and receive change.
//At the end of work, the cashier counts the amount in the cash register and hands over the proceeds.
//The cashier and each customer are separate threads. Simulate this work process. The payment amount and change amount can be generated randomly.
//Which synchronizer from the concurrent library would you use for this process?
package de.telran.home20240425;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleTask1 {
    public static void main(String[] args) {
        int buyersCounter = 5;
        int id = 1;
        Lock lock = new ReentrantLock();
        Buyer b = new Buyer(id, lock);
        Thread buyer = new Thread(b);

        for (int i = 0; i < buyersCounter; i++) {
            buyer.run();
        }
        //Customer 1 paid: 181,11 total: 448,13
        //Customer 1 got change: -267,02
        //Total at the box office: 715,16
        //Customer 2 paid: 77,36 total: 203,63
        //Customer 2 got change: -126,26
        //Total at the box office: 329,89
        //Customer 3 paid: 88,32 total: 192,36
        //Customer 3 got change: -104,05
        //Total at the box office: 296,41
        //Customer 4 paid: 31,31 total: 43,37
        //Customer 4 got change: -12,06
        //Total at the box office: 55,42
        //Customer 1 paid: 71,25 total: 469,99
        //Customer 1 got change: -398,75
        //Total at the box office: 868,74
        //Customer 2 paid: 73,45 total: 198,76
        //Customer 2 got change: -125,31
        //Total at the box office: 324,08
        //Customer 3 paid: 155,76 total: 255,30
        //Customer 3 got change: -99,54
        //Total at the box office: 354,84
        //Customer 4 paid: 251,09 total: 463,30
        //Customer 4 got change: -212,22
        //Total at the box office: 675,52
        //Customer 1 paid: 3,83 total: 126,46
        //Customer 1 got change: -122,63
        //Total at the box office: 249,09
        //Customer 2 paid: 318,35 total: 379,53
        //Customer 2 got change: -61,18
        //Total at the box office: 440,71
        //Customer 3 paid: 183,23 total: 372,54
        //Customer 3 got change: -189,30
        //Total at the box office: 561,84
        //Customer 4 paid: 258,14 total: 366,30
        //Customer 4 got change: -108,16
        //Total at the box office: 474,46
        //Customer 1 paid: 256,50 total: 427,92
        //Customer 1 got change: -171,42
        //Total at the box office: 599,34
        //Customer 2 paid: 112,31 total: 402,13
        //Customer 2 got change: -289,83
        //Total at the box office: 691,96
        //Customer 3 paid: 110,12 total: 130,10
        //Customer 3 got change: -19,99
        //Total at the box office: 150,09
        //Customer 4 paid: 58,90 total: 78,64
        //Customer 4 got change: -19,74
        //Total at the box office: 98,37
        //Customer 1 paid: 309,02 total: 375,18
        //Customer 1 got change: -66,15
        //Total at the box office: 441,33
        //Customer 2 paid: 173,57 total: 486,86
        //Customer 2 got change: -313,29
        //Total at the box office: 800,15
        //Customer 3 paid: 159,97 total: 161,87
        //Customer 3 got change: -1,89
        //Total at the box office: 163,76
        //Customer 4 paid: 164,42 total: 497,85
        //Customer 4 got change: -333,42
        //Total at the box office: 831,27
    }
}

class Buyer implements Runnable {
    private int id;
    private Lock lock;

    public Buyer(int id, Lock lock) {
        this.id = id;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            Random random = new Random();
            double payment = random.nextDouble(5) * 100;
            double paid = random.nextDouble() * payment;
            double change = paid - payment;
            double sum = payment - change;
            lock.lock();
            System.out.println("Customer " + i + " paid: " + String.format("%.2f", paid) + " total: " + String.format("%.2f", payment));
            System.out.println("Customer " + i + " got change: " + String.format("%.2f", change));
            System.out.println("Total at the box office: " + String.format("%.2f", sum));
        }
    }
}