package de.telran.algorithms20240228;

import java.util.Arrays;

public class QuickSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
        //[17, 14, 15, 28, 6, 8, -6, 1, 3, 18]
        //[-6, 1, 3, 6, 8, 14, 15, 17, 18, 28]
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int el = partition(array, low, high);
            quickSort(array, low, el - 1);
            quickSort(array, el + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int mid = low + (high - low) / 2;
        int pivot = array[mid];
        int temp = array[mid];
        array[mid] = array[high];
        array[high] = temp;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
