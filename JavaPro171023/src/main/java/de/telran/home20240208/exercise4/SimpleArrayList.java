//Перебрать ArrayList и найти сумму квадратов всех элементов.
//Перебрать ArrayList и найти самую короткую строку.
//Перебрать ArrayList и заменить все гласные буквы в каждой строке на символ
package de.telran.home20240208.exercise4;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("" + arrayList);
        System.out.println(getSquareResult(arrayList));//10
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Bob");
        arrayList1.add("Vob");
        arrayList1.add("Mob");
        arrayList1.add("Lob");
        arrayList1.add("Tob");
        System.out.println(findShortestWord(arrayList1));
        System.out.println(arrayList1);
        replaceVowelsString(arrayList1);
        System.out.println(arrayList1);
        //[10, 20, 30, 40, 50]
        //5500
        //Bob
        //[Bob, Vob, Mob, Lob, Tob]
        //[B*b, V*b, M*b, L*b, T*b]
    }
    public static int getSquareResult(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += (int) Math.pow(arrayList.get(i), 2);
        }
        return sum;
    }

    public static String findShortestWord(ArrayList<String> arrayList) {
        String shortestWord = arrayList.get(0);
        for (String word : arrayList) {
            if (shortestWord.length() > word.length()) {
                shortestWord = word;
            }
        }
        return shortestWord;
    }

    public static void replaceVowelsString(ArrayList<String> arrayList) {
        char[] vowels = new char[]{'a','A','o','O', 'u', 'U', 'e', 'E', 'i', 'I'};
        for (int i = 0; i < arrayList.size(); i++) {
            for (char vowel:vowels) {
                arrayList.set(i, arrayList.get(i).replace(vowel, '*'));
            }
        }
    }
}
