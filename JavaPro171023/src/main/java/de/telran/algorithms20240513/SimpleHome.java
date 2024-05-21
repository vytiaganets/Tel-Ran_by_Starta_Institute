// 1. Проверьте, равны ли два массива или нет
//Два массива называются равными, если:
//оба они содержат один и тот же набор элементов,
//расположение (или перестановки) элементов может/не может быть одинаковым.
//Если есть повторения, то количество повторяющихся элементов также должно быть одинаковым, чтобы два массива были равны.
//Ввод: arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1}
//Вывод: Да
// 1. Check if two arrays are equal or not
//Two arrays are said to be equal if:
//they both contain the same set of elements,
//the arrangement (or permutations) of elements may/may not be the same.
//If there are repetitions, then the number of repeated elements must also be the same for the two arrays to be equal.
//Input: arr1[] = {1, 2, 5, 4, 0}, arr2[] = {2, 4, 5, 0, 1}
//Output: Yes
//2*. Для задания, которое выполняли в классе, реализуйте поиск с использованием MAP:
//Первый элемент, встречающийся k раз в массиве
//Дан массив из n целых чисел. Задача состоит в том, чтобы найти первый элемент, который встречается k раз.
//Если ни один элемент не встречается k раз, выведите -1.
//Распределение целочисленных элементов может быть в любом диапазоне.
//Ввод : {1, 7, 4, 3, 4, 8, 7}, k = 2
//Вывод : 7
//Объяснение: 7 и 4 встречаются 2 раза. Но 7 — это первое, которое встречается 2 раза.
//2*. For an assignment done in class, implement a search using MAP:
//First element occurring k times in the array
//Given an array of n integers. The task is to find the first element that occurs k times.
//If no element occurs k times, print -1.
//The distribution of integer elements can be in any range.
//Input : {1, 7, 4, 3, 4, 8, 7}, k = 2
//Output: 7
//Explanation: 7 and 4 occur 2 times. But 7 is the first one that occurs 2 times.
package de.telran.algorithms20240513;

import java.util.HashSet;
import java.util.HashMap;

public class SimpleHome {
    public static void main(String[] args) {

        System.out.println("=====================Task 01=====================");
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        System.out.println("Эти два массива идентичны: " + checkArrays(arr1, arr2));

        System.out.println("=====================Task 02=====================");
        int[] array = {1, 7, 4, 3, 4, 8, 7};
        int n = array.length;
        int k = 2;
        System.out.print("Первое число, которое появилось дважды, это: " + firstElement(array, n, k));
    }

    public static boolean checkArrays(int[] array1, int[] array2) {

        HashSet<Integer> setForChecking = new HashSet<>();
        boolean result = true;
        for (int element : array1) {
            setForChecking.add(element);
        }

        for (int element : array2) {
            if (setForChecking.add(element)) {
                result = false;
            }
        }
        return result;
    }

    public static int firstElement(int[] array, int n, int k) {
        HashMap<Integer, Integer> mapForChecking = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int count = 0;
            if (mapForChecking.get(array[i]) != null) {
                count = mapForChecking.get(array[i]);
            }
            mapForChecking.put(array[i], count + 1);
        }
        for (int i = 0; i < n; i++) {
            if (mapForChecking.get(array[i]) == k) {
                return array[i];
            }
        }
        return -1;
    }
}
