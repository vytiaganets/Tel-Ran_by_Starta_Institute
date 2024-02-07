package de.telran.lesson20240206;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class SimpleBinarySearch {
    public static void main(String[] args) {
        //инициализация  с  помощью литерала
        int[] arr2 = {8,7,1,2,3,4,5};
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2, 3));//2
        System.out.println(binarySearch(arr2, 0, arr2.length-1,3));//2
    }
    public static int binarySearch(int[] arr, int  leftIndex, int rightIndex, int element) {
        if (rightIndex >= leftIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if(arr[mid]>element){
                return binarySearch(arr, leftIndex, mid-1, element);
            }
            return binarySearch(arr,  mid+1, rightIndex, element);
        }
        return -1;
    }
}
