//1. Напишите метод, который принимает целое число в качестве параметра и выдает "!!!проверяемое!!!" исключение, если число нечетное.
package de.telran.lesson20240318practice;

public class ExceptionOddNumber {
        public static void main(String[] args) {
            int n = 8;
            tryNumber(n);
            n = 3;
            tryNumber(n);
        }
        public static void tryNumber(int n) {
            try {
                checkEvenNumber(n);
                System.out.println(n + " число непарное.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        public static void checkEvenNumber(int number) {
            if (number % 2 != 0) {
                throw new IllegalArgumentException(number + " парное число.");
            }
        }
    }
