//Перебрать ArrayList и найти второй по величине элемент.
//Перебрать ArrayList и вывести все элементы в обратном порядке.
//Перебрать ArrayList и вывести все строки, содержащие только буквы.
//Перебрать ArrayList и найти самую длинную строку, не содержащую пробелов.
//Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.
package de.telran.home20240208.exercise5;

import de.telran.home20240208.exercise3.Cat;

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
        System.out.println(find2ndMaxElement(arrayList));
        convertArray(arrayList);
        System.out.println("" + arrayList);
        System.out.println(arrayList);//20 40
        Cat cat1 = new Cat("Bob");
        Cat cat2 = new Cat("Tob");
        System.out.println(arrayList);//[20, 40]
        ArrayList<String> catList = new ArrayList<>();
        ArrayList<Cat> catList2 = new ArrayList<>();
        catList.add(cat1.getCatName());
        catList.add(cat2.getCatName());
        System.out.println(printLongestString(catList));
        System.out.println(getAgeCat(catList2));
        //[10, 20, 30, 40, 50]
        //40
        //[50, 40, 30, 20, 10]
        //[50, 40, 30, 20, 10]
        //[50, 40, 30, 20, 10]
        //Bob
        //null
    }
    public static int find2ndMaxElement(ArrayList<Integer> arrayList) {
        int firstMaxElement = arrayList.get(0);
        int secondMaxElement = 0;
        for (int i = 1; i < arrayList.size(); i++) {
            if (firstMaxElement < arrayList.get(i)) {
                secondMaxElement = firstMaxElement;
                firstMaxElement = arrayList.get(i);
            }
        }
        return secondMaxElement;
    }
    public static void convertArray(ArrayList<Integer> arrayList) {
        Integer temp;
        for (int i = 0; i < arrayList.size() / 2; i++) {
            temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(arrayList.size() - (i + 1)));
            arrayList.set(arrayList.size() - (i + 1), temp);
        }
    }

    public static void printStringsWithLetters(ArrayList<String> arrayList) {
        boolean isLetter = false;
        for (String string : arrayList) {
            for (int i = 0; i < string.length(); i++) {
                if ((string.codePointAt(i) > 64) && (string.codePointAt(i) < 91) || (string.codePointAt(i) > 96) && (string.codePointAt(i) < 123)) {
                    isLetter = true;
                } else {
                    isLetter = false;
                    break;
                }
            }
            if (isLetter) {
                System.out.println(string);
            }
        }
    }

    public static String printLongestString(ArrayList<String> arrayList) {
        int longestStringLength = 0;
        String longestString = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if ((!arrayList.get(i).contains(" ")) && longestStringLength < arrayList.get(i).length()) {
                longestStringLength = arrayList.get(i).length();
                longestString = arrayList.get(i);
            }
        }
        return longestString;

    }

    public static Cat getAgeCat (ArrayList<Cat> arrayList){
        double maxAge = 0;
        Cat agestCat = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (maxAge < arrayList.get(i).getAge()) {
                maxAge = arrayList.get(i).getAge();
                agestCat = arrayList.get(i);
            }
        }
        return agestCat;

    }

}
