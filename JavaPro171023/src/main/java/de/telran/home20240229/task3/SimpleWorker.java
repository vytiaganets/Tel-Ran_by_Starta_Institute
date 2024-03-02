//У нас есть профессия в строительстве - чернорабочий. Он может выполнять любые низкоквалифицированные  работы на стройке. На каждый день ему дается список работ, которые он должен выполнить, но не факт что в течении рабочего времени его задание может измениться.
//Напишите программу рабочего дня профессии, которая позволяет динамический давать ему задание на работу, в любое нужное время. И он их должен выполнять. Применяйте функциональные интерфейсы.
//English
//We have a profession in construction - laborer. He can perform any low-skilled construction work. For every day he is given a list of work that he must complete, but it is not a fact that during working hours his task may change.
//Write a program for the working day of a profession that allows you to dynamically give him a task to work at any desired time. And he must fulfill them. Use functional interfaces.
package de.telran.home20240229.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SimpleWorker {
    public static void main(String[] args) {
        List<Supplier<String>> tasks = new ArrayList<>();
        //main responsibilities
        tasks.add(() -> "mix the solution");
        tasks.add(() -> "submit building materials");
        tasks.add(() -> "apply solution");

        // change a task at any time
        tasks.add(() -> "to paint walls");
        tasks.add(() -> "bring i don't know what");
        // start the working day
        startWorking(tasks);
        //helper starts working day:
        //done mix the solution
        //done submit building materials
        //done apply solution
        //done paint the walls
        //completed bring i don't know what
    }

    private static void startWorking(List<Supplier<String>> tasks) {
        System.out.println("helper starts working day:");
        tasks.forEach(task -> {
            String result = task.get();
            System.out.println("done: " + result);
        });
    }
}

