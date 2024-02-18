//Перебрать ArrayList и удалить все четные числа.
//Перебрать ArrayList и объединить все элементы в одну строку.
//Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
package de.telran.home20240208.exercise3;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("" + arrayList);//[10, 20, 30, 40, 50]
        deleteEvenNumbers(arrayList);
        System.out.println(arrayList);//[20, 40]
        mergeAllElements(arrayList);
        System.out.println(arrayList);//20 40
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("Tob");
        System.out.println(arrayList);//[20, 40]
        ArrayList<String> catList = new ArrayList<>();
        catList.add(cat1.getCatName());
        catList.add(cat2.getCatName());
        mergeCatElements(catList);
        System.out.println(arrayList);//Bob Tob
    }
    public static void deleteEvenNumbers(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }
    }
    public static void mergeAllElements(ArrayList<Integer> arrayList) {
        String mergeResult = "";
        for (int i = 0; i < arrayList.size(); i++) {
            mergeResult += arrayList.get(i) + " ";
        }
        System.out.println(mergeResult);
    }
    public static void mergeCatElements(ArrayList<String> arrayList) {
        String mergeResult = "";
        for (int i = 0; i < arrayList.size(); i++) {
            mergeResult += arrayList.get(i) + " ";
        }
        System.out.println(mergeResult);
    }
}
