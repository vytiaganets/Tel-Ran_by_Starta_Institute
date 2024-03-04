// Напишите рекурсивный метод для нахождения суммы цифр заданного целого числа.
// Write a recursive method to find the sum of the digits of a given integer.
package de.telran.lesson20240304practice;

public class Task2 {
    public static void main(String[] args) {
        int number = 1023;
        System.out.println(sumNumbers(number));//6
        System.out.println(sumNumbersWithLoop(number));//6
    }

    public static int sumNumbersWithLoop(int number) {//effective
        int numberToCalculate = number;
        int sum = 0;
        while (numberToCalculate>0){
            int currentNumber = numberToCalculate % 10;
            numberToCalculate = numberToCalculate / 10;
            sum += currentNumber;
        }
        return sum;
    }
    private static int sumNumbers(int number) {
        if (number < 10)
            return number;// base condition
        int currentNumber = number % 10;
        int numberToCalculate = number / 10;
        return currentNumber + sumNumbers(numberToCalculate);
    }
}
