//2*. Одна компания решила заработать миллион. Для этого они решили создать курсы, где за 1000
//можно обучиться чему-то очень интересному и полезному:
//они наняли преподавателей, которые получают 10% от суммы оплаты каждого студента.
//Напишите программу, которая даст возможность набирать студентов на курс до тех пор,
//пока компания не заработает миллион :) Используйте AtomicInteger для накопления.
//2*. One company decided to make a million. To do this, they decided to create courses where for 1000
//you can learn something very interesting and useful:
//they hired teachers who receive 10% of each student's fee.
//Write a program that will make it possible to enroll students in a course until
//until the company makes a million :) Use AtomicInteger for accumulation.
package de.telran.home20240416;

import java.util.concurrent.atomic.AtomicInteger;

public class SimpleTask2 {
    public static void main(String[] args) {
        int price = 1_000;
        int clearPrice = price - (price * 10 / 100); //price -10% for teachers
        int finalSum = 1_000_000;
        int counter = 0;

        AtomicInteger atomic = new AtomicInteger(0);

        while (atomic.get() < finalSum) {
            Student student = new Student();
            student.run();
            atomic.addAndGet(clearPrice);
            counter++;

            System.out.println("Student -> " + counter + " graduated");
        }
        System.out.println("Your million dollar goal has been achieved!");
        //Student learns something very useful and interesting.
        //Student -> 1 graduated
        //Student learns something very useful and interesting.
        //Student -> 2 graduated
        //...
        //Student -> 1111 graduated
        //Student learns something very useful and interesting.
        //Student -> 1112 graduated
        //Your million dollar goal has been achieved!
    }
}

class Student implements Runnable {
    @Override
    public void run() {
        System.out.println("Student learns something very useful and interesting.");
    }
}