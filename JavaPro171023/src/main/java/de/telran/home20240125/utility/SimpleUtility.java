//1. Напишите утилитный класс, в котором реализованы методы получения среднего значения AVG, максимального MAX и минимального значения MIN из следующих наборов данных:
//пары целых чисел
//пары дробных чисел
//одного целого и одного дробного числа
//массива целых чисел
//массива дробных чисел
//Используйте механизм перегрузки.
package de.telran.home20240125.utility;

public class SimpleUtility {
    public static void main(String[] args) {
        double num1 = 3.843;
        int num2 =3;
        int[] ints = new int[] {34,56,2,67,89,38};
        double[] doubles = new double[] {3.487,5.623,2.042,6.743,8.987,3.834};

        System.out.println(Utility.getAvg(num1, num2));//3.4215
        System.out.println(Utility.getMax(num1, num2));//3.843
        System.out.println(Utility.getMin(num1, num2));//3.0
        System.out.println(Utility.getAvg(doubles));//5.119333333333333
    }
}
