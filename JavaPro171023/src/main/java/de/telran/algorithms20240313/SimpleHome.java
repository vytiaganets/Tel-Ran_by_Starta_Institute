// 1.Quick sort пишем еще раз “с чистого листа”, но сортировка в порядке убывания значения. SimpleHome file
//2.Написать проверку числа "простое" ли оно, используя итерационный подход (не рекурсия) SimplePrime file
//3*.Реализовать Quick sort используя итерационный подход. SimpleIterativQuickSort file
//1.Quick sort We write again “from scratch”, but sort in descending order of value.
//2.Write a check to see if a number is “prime” using an iterative approach. (not recursion)
//3*.Implement Quick sort using an iterative approach.
package de.telran.algorithms20240313;

import java.util.Arrays;

public class SimpleHome {
    public static void main(String[] args) {
        int[] array = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        sorting(array,0,array.length - 1);
        System.out.println(Arrays.toString(array));
        //[7, 6, 5, 4, 2, 1, 0, -2, -4]
    }
    public static int partition(int arr[], int left, int right){
        int pivot = arr[left];
        int i = left;
        for(int j = left + 1; j <= right; j++){
            if (arr[j] > pivot){
                i = i + 1;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        return i;

    }
    public static void sorting(int arr[], int left, int right){
        if(left < right)
        {
            int q = partition(arr, left, right);
            sorting(arr, left, q);
            sorting(arr, q + 1, right);
        }
    }


}
