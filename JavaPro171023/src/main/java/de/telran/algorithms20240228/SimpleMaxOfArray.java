//Divide And Rule Algorithm
//Найти максимальный элемент в массиве.
//Известно, что в таком массиве максимум находится по соседству с меньшими элементами, т.е. предыдущий и следующий за ним элементы гарантировано меньше искомого.
//Пример входного массива: array [0,1,2,3,4,5,10,9,8,7,6]
//max = 10;

package de.telran.algorithms20240228;

public class SimpleMaxOfArray {
    public static void main(String[] args) {
        System.out.println("Max " + getMaxElement(arr, 1, 10));//Max 10
    }
    static int arr[] = {0, 1, 2, 3, 4, 5, 10, 9, 8, 7, 6};

    static int getMaxElement(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return arr[mid];
        }
        if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
            return getMaxElement(arr, low, mid - 1);
        } else {
            return getMaxElement(arr,  mid + 1, high);
        }
    }
}