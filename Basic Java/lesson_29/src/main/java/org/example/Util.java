package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Util {

    public static void inputMathOper() {
        char operation;
        double num1 = 0;
        double num2 = 0;
        String needNextCalcs;
        Scanner scr = new Scanner(System.in);

        scr.useLocale(Locale.ENGLISH);

        do {
            System.out.println("введите математическую операцию (+ - * /) ");
            operation = scr.next().charAt(0);

            if (!Util.isCorrectOperation(operation)) {
                System.out.println("данная операция не поддерживается");
            } else {

                System.out.println("введите первое число");
                num1 = scr.nextDouble();

                do {
                    System.out.println("введите второе число");
                    num2 = scr.nextDouble();
                }
                while (operation == Constant.SIGN_DIV && num2 == 0);
            }

            printResult(num1, num2, operation, calcResult(num1, num2, operation));

            do {
                System.out.println("\nВыполнить еще раз (Y/N) ?");
                needNextCalcs = scr.next();
            }
            while (!Constant.ANSWER_YES.equalsIgnoreCase(needNextCalcs) && !Constant.ANSWER_NO.equalsIgnoreCase(needNextCalcs));

        }
        while (Constant.ANSWER_YES.equalsIgnoreCase(needNextCalcs));
    }


    public static Double calcResult(double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case Constant.SIGN_PLUS:
                result = num1 + num2;
                break;
            case Constant.SIGN_MINUS:
                result = num1 - num2;
                break;
            case Constant.SIGN_MULT:
                result = num1 * num2;
                break;
            case Constant.SIGN_DIV:
                result = num1 / num2;
                break;
        }
        return result;
    }

    public static void printResult(double num1, double num2, char operation, double result) {

        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        System.out.println(String.format("%.2f %s %.2f = %.2f", num1, operation, num2, result));
        System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, result);
    }


    public static boolean isCorrectOperation(char oper) {
        boolean result = false;
        char[] array = {'+', '-', '*', '/'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oper) {
                result = true;
                break;
            }
        }
        return result;
    }

//        public static void checkDivByZero(double num){
//        if (num == 0) {
//            System.out.println("Делить на ноль нельзя");
//        }
//    }

    public static boolean isDiv(double num) {
        return num != 0;
    }
}


