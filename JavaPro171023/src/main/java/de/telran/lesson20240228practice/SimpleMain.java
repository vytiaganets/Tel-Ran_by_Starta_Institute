//1. Напишите рекурсивный метод, чтобы проверить, является ли данная строка палиндромом. ~ АВССВА
//2. Напишите рекурсивный метод для нахождения суммы цифр заданного целого числа.
//3. Напишите рекурсивный метод для вычисления возведения числа х в степень п.
//1. Write a recursive method to check whether a given string is a palindrome. ~ ABCWA
//2. Write a recursive method to find the sum of the digits of a given integer.
//3. Write a recursive method to calculate the number x raised to the power n.
//1. Имеется класс Cat с полями:
//public class Cat {
//private String name;
//private int age;
//private String colour;
//private boolean isHungry;
//На основе тестового списка экземпляров данного класса List<Cat> cats а. Получить Map<String, Boolean> имя / информация, голодна ли кошка
package de.telran.lesson20240228practice;

public class SimpleMain {
    public static void main(String[] args) {
        String str1 = "АВССВА";
        String str2 = "АССВА";
        if (isPalindrome(str1, 0))
        { System.out.println("Yes"); }
        else
        { System.out.println("No"); }
    }
//    public static boolean isPalindrome2 (String s) {
//        if (s.length() == 1)
//            return true; // base condition
//        int i = s.length() - 1;
//        return s.charAt(i) == s.charAt(0) && isPalindrome(s.substring(1, s.length() - 1));
//    }

    public static boolean isPalindrome(String s, int i){
        if(i > s.length()/2)
        {
            return true ;
        }
        return s.charAt(i) == s.charAt(s.length()-i-1) && isPalindrome(s, i+1) ;
    }
}