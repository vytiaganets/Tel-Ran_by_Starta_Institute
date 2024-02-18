//Найти сумму всех элементов ArrayList.
//Перебрать ArrayList и вывести все элементы на экран.
//Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
package de.telran.home20240208.exercise1;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("" + getArrayListSum(arrayList));//150
        getAllElements(arrayList);//10, 20, 30, 40, 50,
        ArrayList <Cat> arrayList1 = new ArrayList<>();
        Cat cat1  = new Cat("Bob", "white", 1);
        arrayList1.add(cat1);
        Cat cat2  = new Cat("Vob", "black", 2);
        arrayList1.add(cat2);
        Cat cat3  = new Cat("Mob", "green", 3);
        arrayList1.add(cat3);
        Cat cat4  = new Cat("Lob", "brown", 4);
        arrayList1.add(cat4);
        Cat cat5  = new Cat("Tob", "white", 5);
        arrayList1.add(cat5);
    }
    public static int getArrayListSum(ArrayList<Integer> arrayList){
        int summa = 0;
        for(int i = 0; i < arrayList.size(); i++){
            summa += arrayList.get(i);
        }
        return summa;
    }
    public static void getAllElements(ArrayList<Integer>arrayList){
        for (Integer integer : arrayList){
            System.out.print(integer +", ");
        }
    }
}
