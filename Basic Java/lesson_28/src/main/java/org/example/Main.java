package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1;
        double num2;
        char operation;
        double result = 0;


        Scanner scr = new Scanner(System.in);

        System.out.println("введите математическую операцию (+ - * /) ");
        operation = scr.nextLine().charAt(0);
        if (!Util.isCorrectOperation(operation)) {
            System.out.println("данная операция не поддерживается");
        } else {
            System.out.println("введите первое число");
            num1 = scr.nextDouble();
            System.out.println("введите второе число");
            num2 = scr.nextDouble();
            if (operation == '+') {
                result = num1 + num2;
            } else if (operation == '-') {
                result = num1 - num2;
            } else if (operation == '*') {
                result = num1 * num2;
            } else if (operation == '/') {
                if (Util.isDiv(num2)) {
                    result = num1 / num2;
                }
                else {
                    System.out.println("делить  на ноль нельзя ");
                }
            }
            // System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            // вывести число после запятой два знака
            System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, result);
        }
    }
}