import java.util.Scanner;

public class Numbers {
    //№2
//    Реализовать программу, выводящую на экран результаты:
//    Сложения двух чисел
//    Вычитания двух чисел
//    Умножения двух чисел
//    Деления двух чисел
//    Каждая из арифметических операций должна быть реализована как
//    два отдельных метода - один с типом void, второй - int.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");//2
        String str1 = sc.nextLine();
        int num1 = Integer.parseInt(str1);
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите второе число");//2
        String str2 = scr.nextLine();
        int num2 = Integer.parseInt(str2);
        addition(num1, num2);
        subtraction(num1, num2);
        multiplication(num1, num2);
        division(num1, num2);
        System.out.println(additionInt(num1, num2));
        System.out.println(subtractionInt(num1, num2));
        System.out.println(multiplicationInt(num1, num2));
        System.out.println(divisionInt(num1, num2));
    }

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);//4
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);//0
    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);//4
    }

    public static void division(int num1, int num2) {
        System.out.println(num1 / num2);//1
    }
    public static int additionInt(int num1, int num2) {
        return num1 + num2;//4
    }

    public static int subtractionInt(int num1, int num2) {
        return num1 - num2;//0
    }

    public static int multiplicationInt(int num1, int num2) {
        return num1 * num2;//4
    }

    public static int divisionInt(int num1, int num2) {
        return num1 / num2;//1
    }
}
