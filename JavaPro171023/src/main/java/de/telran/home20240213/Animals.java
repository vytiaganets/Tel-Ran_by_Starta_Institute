//1. В стране Лимпопо количество всех зверей равно 10 миллионов.
//Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
//Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
////2*. -  создать лист, наполнить его 10 элементов
////
////
////внутри тела просто будем присваивать i-тый элемент в переменную temp
////
////перебрать весь список и замерять время выполнения:
////  а) с помощью for-each loop
////  b) классический for, с выполнением условия i<list.size()
////  c) классический for, но проходим список с конца до начала (i--)
////  d) используя Iterator
////  e) используя ListIterator и перемещаясь от начала списка до конца
////  j) используя ListIterator с перемещением от конца списка к началу
////Замер производительности делать для каждого из подпунктов отдельно,
////используя например сходный шаблон кода:  инструкцию java:
////       double startTime = System.currentTimeMillis();
////       //…… Ваша реализация перебора списка, например
////       for (int i : list) {
////           int temp = i;
////       }
////       double endTime = System.currentTimeMillis();
////       System.out.println("for-each loop: " + (endTime - startTime));
////время выполнения каждого перебора вывести в консоль
////Определите, какой вариант перебора списка работает быстрее всего.
package de.telran.home20240213;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Animals {
    public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        for (int i = 1; i <= 10; i++) {
            if (born > 7) {
                born -= 1;
            }
            if (death > 6) {
                death -= 1;
            }
            population += population * (born - death) / 1000;
        }
        System.out.println(population);//10303873

        //2*. -  создать лист, наполнить его 10 элементов
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10000000; i++) {
            list.add(10);
        }
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list1.add(1);
        }

        //а) с помощью for-each loop
        double startTime = System.currentTimeMillis();
        for (Integer i : list1) {
            int temp = i;
        }
        double endTime = System.currentTimeMillis();
        System.out.println("а) с помощью for-each loop: " + (endTime - startTime));

        //  b) классический for, с выполнением условия i<list.size()
        double startTime1 = System.currentTimeMillis();
        for (int i = 0; i < list1.size(); i++) {
            int temp = i;
        }
        double endTime1 = System.currentTimeMillis();
        System.out.println("b) классический for, с выполнением условия i<list.size(): " + (endTime1 - startTime1));

        //  d) используя Iterator
        double startTime2 = System.currentTimeMillis();
        Iterator<Integer> iterator1 = list1.iterator();

        while (iterator1.hasNext()) {
            int temp = iterator1.next();
        }
        double endTime2 = System.currentTimeMillis();
        System.out.println("d) используя Iterator: " + (endTime2 - startTime2));

        //  e) используя ListIterator и перемещаясь от начала списка до конца
        double startTime3 = System.currentTimeMillis();
        ListIterator<Integer> iterator2 = list1.listIterator();

        while (iterator2.hasNext()) {
            int temp = iterator2.next();
        }
        double endTime3 = System.currentTimeMillis();
        System.out.println("e) используя ListIterator и перемещаясь от начала списка до конца: " + (endTime3 - startTime3));

        //  j) используя ListIterator с перемещением от конца списка к началу
        double startTime4 = System.currentTimeMillis();
        ListIterator<Integer> iterator3 = list1.listIterator(list1.size());
        while (iterator3.hasPrevious()) {
            int temp = iterator3.previous();
        }
        double endTime4 = System.currentTimeMillis();
        System.out.println("j) используя ListIterator с перемещением от конца списка к началу: " + (endTime4 - startTime4));

        //а) с помощью for-each loop: 53.0
        //b) классический for, с выполнением условия i<list.size(): 26.0
        //d) используя Iterator: 37.0
        //e) используя ListIterator и перемещаясь от начала списка до конца: 49.0
        //j) используя ListIterator с перемещением от конца списка к началу: 42.0
    }
}

