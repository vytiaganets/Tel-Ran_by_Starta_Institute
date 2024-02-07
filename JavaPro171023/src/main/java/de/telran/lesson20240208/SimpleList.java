package de.telran.lesson20240208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleList {
    public static void main(String[] args) {
        //List<Object> lst = new ArrayList();//все равно, что <Object>
        List lst = new ArrayList();
        lst.add("Vasia");
        lst.add(1);
        lst.add(true);
        System.out.println(lst);//[Vasia, 1, true]

        List<String> lstStr = new ArrayList<>();
        System.out.println(lstStr.isEmpty());//true
        lstStr.add("add");
        lstStr.add("Two");//<String>
        System.out.println(lstStr);//[add, Two]
        lstStr.add(1, "New Two");
        System.out.println(lstStr);//[add, New Two, Two]
        lstStr.set(1, "2"); //изменение
        System.out.println(lstStr);
        //аналог литерального создания
        List<String> lstStr2 = List.of("5", "6", "7");
        List<String> lstStr3 = Arrays.asList("8", "9", "10element");
        System.out.println(lstStr2);
        System.out.println(lstStr3);

        lstStr.addAll(lstStr2);//[8, 9, 10element] - добавление списка
        System.out.println(lstStr);//[add, 2, Two, 5, 6, 7]
        lstStr.addAll(2, lstStr3);//вставка списка
        System.out.println(lstStr);//[add, 2, 8, 9, 10element, Two, 5, 6, 7]
        //удаление
        lstStr.remove(4); //по индексу
        System.out.println(lstStr);//[add, 2, 8, 9, Two, 5, 6, 7]
        lstStr.remove("Two");//по значению
        System.out.println(lstStr);//[add, 2, 8, 9, 5, 6, 7]
        System.out.println(lstStr.remove("88"));//false

        for(int i = 0; i<lstStr.size();i++){
            System.out.print(lstStr.get(i));//add289567
        }
        System.out.println();
        for(String el : lstStr){
            System.out.print(el);//add289567
        }
        lstStr.sort(String::compareTo);//сортировка (String::compareTo) - это будем учить позже
        System.out.println(lstStr);
        //поиск
        System.out.println(lstStr.contains("6"));
        System.out.println(lstStr.contains("99"));
    }
}
