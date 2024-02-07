package de.telran.lesson20240206;

import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] arr2 = {8,7,1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));//[8, 7, 1, 2, 3, 4, 5]

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));//[1, 2, 3, 4, 5, 7, 8]

        //Collection.sort();//работает только с коллекциями
    }
}
