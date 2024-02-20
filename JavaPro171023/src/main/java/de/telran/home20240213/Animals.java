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
////  e) используя ListIterator с перемещением от конца списка к началу
////Замер производительности делать для каждого из подпунктов отдельно,
////используя например сходный шаблон кода:  инструкцию java:
////       long startTime = System.currentTimeMillis();
////       //…… Ваша реализация перебора списка, например
////       for (int i : list) {
////           int temp = i;
////       }
////       long endTime = System.currentTimeMillis();
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
        for(int i = 1; i <= 10; i++){
            if (born > 7) {
                born -= 1;
            }
            if  (death > 6) {
                death -=1;
            }
            population += population * (born - death) / 1000;
        }
        System.out.println(population);//10303873
        List<Integer> list = new ArrayList<>();
        for(int i =1; i < 10; i++){
            list.add(10);
        }
    }
}
