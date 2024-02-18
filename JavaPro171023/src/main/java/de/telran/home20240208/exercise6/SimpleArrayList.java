//Перебрать ArrayList и найти наибольшую возрастающую последовательность элементов.
//Перебрать ArrayList и удалить все дубликаты элементов.
//Перебрать ArrayList и создать новый список, содержащий только уникальные строки.
//Перебрать ArrayList и объединить все строки в одну с использованием разделителя.
package de.telran.home20240208.exercise6;

import de.telran.home20240208.exercise3.Cat;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("" + arrayList);
        System.out.println(getMaxSubsequence(arrayList));
        System.out.println(arrayList);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Vob");
        arrayList1.add("Mob");
        arrayList1.add("Bob");
        arrayList1.add("Tob");
        deleteDuplicates(arrayList1);
        System.out.println(arrayList1);
        System.out.println(getUniqueStrings(arrayList1));
        System.out.println(getAllToString(arrayList1, "%"));
        //[10, 20, 30, 40, 50]
        //[10, 20, 30, 40, 50]
        //[10, 20, 30, 40, 50]
        //[Bob, Vob, Mob, Tob]
        //[Bob, Vob, Mob, Tob]
        //Bob%Vob%Mob%Tob%
    }

    public static ArrayList<Integer> getMaxSubsequence(ArrayList<Integer> arrayList) {
        int currentIndex = 0;
        int currentLength = 1;
        int longestIndex = 0;
        int longestLength = 1;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
                currentLength++;
            } else {
                currentIndex = i + 1;
                currentLength = 1;
            }
            if (longestLength < currentLength) {
                longestLength = currentLength;
                longestIndex = currentIndex;
            }
        }
        List<Integer> list = arrayList.subList(longestIndex, longestIndex + longestLength);
        return new ArrayList<>(list);
    }

    public static void deleteDuplicates(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                }
            }
        }
    }

    public static ArrayList<String> getUniqueStrings(ArrayList<String> arrayList) {
        ArrayList<String> arrayList1;
        arrayList1 = (ArrayList)arrayList.clone();
        for (int i = 0; i < arrayList1.size() - 1; i++) {
            for (int j = i + 1; j < arrayList1.size(); j++) {
                if (arrayList1.get(i).equals(arrayList1.get(j))) {
                    arrayList1.remove(j);
                }
            }
        }
        return arrayList1;
    }

    public static String getAllToString(ArrayList<String> arrayList, String delimiter) {
        String oneString = "";
        for (String string : arrayList) {
            oneString += (string + delimiter);
        }
        return oneString;
    }
}
