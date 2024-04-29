//Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек. Создайте группу людей, каждый из которых будет иметь характеристику вес. Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).

//There is an elevator to get to the observation deck, in which no more than 5 people can sit at a time. Create a group of people, each of whom will have a weight characteristic. Create a program to simulate the operation of an elevator, with a different number of people in the group (can be entered from the keyboard).
package de.telran.home20240423;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CyclicBarrier;

public class SimpleTask3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количестве людей в группе");
        int groupSize = scanner.nextInt();

        Elevator elevator = new Elevator();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, elevator);


        for (int i = 0; i < groupSize; i++) {
            Random random = new Random();
            int weight = random.nextInt(50, 100);
            new Person(weight, cyclicBarrier, elevator).start();
            Thread.sleep(500);
        }
        //Введите количестве людей в группе
        //3
        //Thread-1 зашел в лифт
        //Thread-2 зашел в лифт
        //Thread-3 зашел в лифт
        //Лифт не полный
        //Лифт поднимается на смотровую площадку
    }
}
