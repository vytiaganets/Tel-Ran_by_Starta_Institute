//2*. На склад приезжает машина, в которой загружено N ящиков (пользователь вводит с клавиатуры).
//Автоматизированный разгрузчик вытягивает с машины ящик и кладет на рампу с определенным интервалом времени, на которой может одновременно разместиться например 2 ящика.
//В это время подъезжает автоматизированный погрузчик и везет его на место хранения. Он за раз может взять всего 1 ящик. Каждый участник процесса представлен в виде отдельного потока Java.
//Создайте программу, которая синхронизирует работу в данном процессе разгрузки автомобиля, с условием того, что Разгрузчик может быть только один, а Погрузчиков может быть 2 и более (на ваше усмотрение).
//2*. A machine arrives at the warehouse loaded with N boxes (the user enters from the keyboard).
//The automated unloader pulls a box from the machine and places it on a ramp at a certain time interval, which can accommodate, for example, 2 boxes at the same time.
//At this time, an automated forklift arrives and takes it to the storage location. He can only take 1 box at a time. Each participant in the process is represented as a separate Java thread.
//Create a program that synchronizes the work in this process of unloading a car, with the condition that there can be only one Unloader, and there can be 2 or more Loaders (at your discretion).
package de.telran.home20240418;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество коробок:");
        int boxes = sc.nextInt();

        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(boxes);
        Unloader unloader = new Unloader(queue);//unloader - Разгрузчик
        Loader loader1 = new Loader(queue);//loader1 -  Погрузчик 1
        Loader loader2 = new Loader(queue);//loader2 - Погрузчик 2
        // запуск Разгрузчика для создания сообщений в очереди
        new Thread(unloader).start();

        // запуск Погрузчика1 и Погрузчика2 для получения сообщений из очереди
        new Thread(loader1).start();
        new Thread(loader2).start();

        System.out.println("Запущен Разгрузчик и Погрузчик1, Погрузчик2");
        //Введите количество коробок:
        //2
        //Запущен Разгрузчик и Погрузчик1, Погрузчик2
        //Перемещено погрузчиком Thread-1
        //Перемещено погрузчиком Thread-2
        //Перемещено разгрузчиком
        //Перемещено разгрузчиком
        //Перемещено погрузчиком Thread-2
        //Перемещено разгрузчиком
        //Перемещено разгрузчиком
        //Перемещено погрузчиком Thread-1
    }
}