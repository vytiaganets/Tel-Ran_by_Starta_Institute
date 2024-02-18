//Перебрать ArrayList и найти наименьший элемент.
//Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
//Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
package de.telran.home20240208.exercise2;

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
        System.out.println(getMinElement(arrayList));//10
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Vob");
        arrayList1.add("Mob");
        arrayList1.add("Lob");
        arrayList1.add("Tob");
        char letter = 't';
        System.out.println(countElement(arrayList1, letter));
        System.out.println("Original: " + arrayList1);
        deleteElements(arrayList1, 3);
        System.out.println("deleteElementNum: " + arrayList1);
//[10, 20, 30, 40, 50]
//10
//1
//Original: [Bob, Vob, Mob, Lob, Tob]
//deleteElementNum: [Bob, Vob, Mob, Tob]
    }

    public static int getMinElement(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (min > arrayList.get(i)) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public static int countElement(ArrayList<String> arrayList, char letter) {
        int counter = 0;
        for (String word : arrayList) {
            if (word.toLowerCase().charAt(0) == letter) {
                counter++;
            }
        }
        return counter;
    }
    public static void deleteElements(ArrayList<String> arrayList, int deleteElementNum){
        for (int i = deleteElementNum; i < arrayList.size(); i++) {
            arrayList.remove(i);
        }
    }
}


