//1) СКОЛЬЗЯЩЕЕ ОКНО
//Дан массив целых чисел размера «n», наша цель — вычислить минимальную сумму «k» последовательных элементов в массиве.
//
//Ввод: arr[] = {10, 20, 30, 40}, k = 2
//Вывод: 30
//
//Вход: arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
//Выход: 24
//Мы получаем минимальную сумму, добавляя подмассив {3, 1, 0, 20} размера 4.
//
//2*) ДВА УКАЗАТЕЛЯ
//Для двух заданных отсортированных в возрастающем порядке целочисленных массивов A и B длин n и m соответственно,
//найти пару самых близких между собой по значению элементов. Более формально: найти такие элементы A[i] и B[j],
//что их модуль разности минимален по сравнению с другими парами элементов из этих массивов.
//
//Пример. Для заданных массивов {1, 2, 10} и {8, 20, 30} ответом будет пара чисел 10 и 8.
//
//3) Итоговый тест по алгоритмам:
//https://skilldesk.starta.university/algorithm-final-test
//1) SLIDING WINDOW
//Given an array of integers of size 'n', our goal is to calculate the minimum sum of 'k' consecutive elements in the array.
//Input: arr[] = {10, 20, 30, 40}, k = 2
//Output: 30
//Input: arr[] = {1, 45, 2, 10, 23, 3, 1, 0, 20}, k = 4
//Output: 24
//We get the minimum sum by adding a subarray {3, 1, 0, 20} of size 4.
//
//2*) TWO POINTERS
//For two given integer arrays A and B of lengths n and m respectively sorted in ascending order,
//find a pair of elements that are closest in value to each other. More formally: find elements A[i] and B[j],
//that their difference modulus is minimal compared to other pairs of elements from these arrays.
//Example. Given arrays {1, 2, 10} and {8, 20, 30}, the answer is a pair of numbers 10 and 8.
//3) Final test on algorithms:
//https://skilldesk.starta.university/algorithm-final-test
package de.telran.algorithms20240527;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleHome {
        //=======================Variant 1=======================
        static int minSum1(int arr[], int n, int k)
        {
            int min_sum = 0;
            for (int i = 0; i + k <= n; i++) {
                int temp = 0;
                for (int j = i; j < i + k; j++) {
                    temp += arr[j];
                }
                if (temp > min_sum)
                    min_sum = temp;
            }

            return min_sum;
        }
        //=======================Variant 2=======================
        // Функция для нахождения максимальной суммы подмассива размера k
        static int minSum2(int arr[], int n, int k)
        {
            // k должно быть меньше n
            if (n < k) {
                System.out.println("Неверный");
                return -1;
            }

            // Создать очередь
            Queue<Integer> q = new LinkedList<Integer>();

            // Инициализируем максимальную и текущую сумму
            int m = Integer.MIN_VALUE;
            int su = 0;

            // Вычисляем сумму первых k элементов и сохраняем их в очереди
            for (int i = 0; i < k; i++) {
                q.add(arr[i]);
                su += arr[i];
            }

            // Вычисляем сумму оставшихся элементов
            for (int i = k; i < n; i++) {

            // удаляем первый элемент из очереди
                su -= q.peek();
                q.remove();

            // добавляем текущий элемент в очередь
                q.add(arr[i]);
                su += arr[i];

            // обновляем минимальную сумму
                m = Math.max(m, su);
            }
            return m;
        }
    //=======================Variant 3=======================
    // Возвращает минимальную сумму в подмассиве размера k.
    public static int minSum3(int arr[], int n, int k)
    {
        // k должно быть меньше n
        if (n < k)
        {
            System.out.println("Неверный");
            return -1;
        }

        // Вычислить сумму первого окна размера k
        int res = 0;
        for (int i=0; i<k; i++)
            res += arr[i];

        // Вычисляем суммы оставшихся окон, удаляя первый элемент предыдущего окна и добавляя последний элемент текущего окна.
        int curr_sum = res;
        for (int i=k; i<n; i++)
        {
            curr_sum += arr[i] - arr[i-k];
            res = Math.max(res, curr_sum);
        }

        return res;
    }
        public static void main(String[] args)
        {
            System.out.println("=======================Variant 1=======================");
            int arr1[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
            int k1 = 2;
            int n1 = arr1.length;

            // грубой силой
            int max_sum = minSum1(arr1, n1, k1);
            System.out.println(max_sum);

            System.out.println("=======================Variant 2=======================");
            int arr2[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
            int k2 = 4;
            int n2 = arr2.length;
            System.out.println(minSum2(arr2, n2, k2));

            System.out.println("=======================Variant 3=======================");
            int arr3[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
            int k3 = 4;
            int n3 = arr3.length;
            System.out.println(minSum3(arr3, n3, k3));
            //=======================Variant 1=======================
            //24
            //=======================Variant 2=======================
            //24
            //=======================Variant 3=======================
            //24
        }
    }

