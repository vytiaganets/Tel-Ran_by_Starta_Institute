//1. Напишите Java-программу для поиска чисел меньше 7 в TreeSet.
//2. Написать метод, возвращающий очередь в обратном порядке.
//3. На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек:
//Создать класс CustomStack с методами push(), рор(), реек(). Протестировать работу класса.
//4. Дан список из п товаров. У каждого товара есть название и цена.
//Написать метод для получения списка топ-к самых дешевых товаров, где к - входной параметр.
package de.telran.lesson20240226practice;

import java.util.Iterator;
import java.util.TreeSet;

public class SimpleSearch {
    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(10);

        // Найдите числа меньше 7
        treeheadset = (TreeSet) treeSet.headSet(7);

        // создать итератор
        Iterator iterator = treeheadset.iterator();

        //Отображение данных набора деревьев
        System.out.println("Данные набора деревьев: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        //Данные набора деревьев:
        //1
        //2
        //3
        //5
        //6
    }
}


