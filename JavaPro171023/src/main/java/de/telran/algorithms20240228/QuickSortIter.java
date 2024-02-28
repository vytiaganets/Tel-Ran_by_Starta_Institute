package de.telran.algorithms20240228;

import java.util.Arrays;
import java.util.Stack;

public class QuickSortIter {
    public static void main(String[] args) {
        int[] array = {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        //[17, 14, 15, 28, 6, 8, -6, 1, 3, 18]
        //[-6, 1, 3, 6, 8, 14, 15, 17, 18, 28]
    }

    public static void quickSort(int[] arr, int l, int h) {
        if (l >= h)
            return;
        Stack stack = new Stack<>();
        stack.push(l);
        stack.push(h);
        while (!stack.isEmpty()) {
            h = (int) stack.pop();
            l = (int) stack.pop();
            int pivot = partition(arr, l, h);
            if (pivot - 1 > l) {
                stack.push(l);
                stack.push(pivot - 1);
            }
            if (pivot + 1 < h) {
                stack.push(pivot + 1);
                stack.push(h);
            }
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l;
        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }

        }
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }
}