//Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
//Массив 1 - 100 112 256 349 770
//Массив 2 - 72 86 113 119 265 445 892
//к = 7
//Вывод : 256
//Окончательный отсортированный массив -
//72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//7-й элемент этого массива равен 256.
//English:
//Given two sorted arrays of size m and n respectively, you need to find the element that will be in the kth position in the final sorted array.
//Array 1 - 100 112 256 349 770
//Array 2 - 72 86 113 119 265 445 892
//k = 7
//Output: 256
//Final sorted array -
//72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//The 7th element of this array is 256.
package de.telran.algorithms20240228;

import java.util.Arrays;

public class ArraysSortAndSearch {
    public static void main(String[] args) {
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;
        int[] c = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            c[i] = arr1[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            c[count++] = arr2[j];
        }
        Arrays.sort(c);
        System.out.print("Окончательный отсортированный массив ");
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            if ((k - 1) == i) {
                System.out.print(k + "-й элемент этого массива равен " + c[i]);
            }
        }
    }
    //Окончательный отсортированный массив 72 86 100 112 113 119 256 265 349 445 770 892
    //7-й элемент этого массива равен 256
}
