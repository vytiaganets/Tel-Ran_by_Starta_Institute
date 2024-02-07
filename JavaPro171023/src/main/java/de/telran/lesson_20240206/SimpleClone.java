package de.telran.lesson_20240206;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleClone {
    public static void main(String[] args) {
        //инициализация  с помощью литерала
        int[] arr = {6,7,8,9,10};
        System.out.println(Arrays.toString(arr));//[6, 7, 8, 9, 10]

        int[] arrClone = arr.clone();
        System.out.println(Arrays.toString(arr));//[6, 7, 8, 9, 10]

        System.out.println(arr == arrClone);//false
        System.out.println(arr.equals(arrClone));// false не  переопределено в  массивах, используется от  Object
        System.out.println(Arrays.equals(arr, arrClone));//true

        arr[2] =11;//меняется только в источниках, клон не меняется
        System.out.println(Arrays.equals(arr, arrClone));//false
        System.out.println(Arrays.toString(arr));//[6, 7, 11, 9, 10]
        System.out.println(Arrays.toString(arrClone));//[6, 7, 8, 9, 10]

        //инициализация с помощью литерала 2-мерного массива
        int[][]  arr2  = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println(Arrays.deepToString(arr2));//[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]

        int[][] arr2Clone =  arr2.clone();//поверхностное копирование
        System.out.println(Arrays.deepToString(arr2Clone));//[[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]

        arr2[0][2] =11;
        System.out.println(Arrays.deepToString(arr2));//[[1, 2, 11, 4, 5], [6, 7, 8, 9, 10]]
        System.out.println(Arrays.deepToString(arr2Clone));//[[1, 2, 11, 4, 5], [6, 7, 8, 9, 10]]

        System.out.println(arr2 == arr2Clone);//false
        System.out.println(Arrays.equals(arr2, arr2Clone));//true
        System.out.println(Arrays.deepEquals(arr2, arr2Clone));//true


    }
}
