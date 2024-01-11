package org.example2;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    private static final String[] resultHistory = new String[Const.HISTORY_SIZE];

    private static final Scanner sc = new Scanner(System.in);

    private static String inputData(){
        System.out.println("Введите математическое выражение --(10*5+6-1.7)--> ");
        return sc.next();
    }

    private static boolean isSign(char symbol){

        return symbol==Const.SIGN_PLUS || symbol == Const.SIGN_MINUS || symbol==Const.SIGN_DIV || symbol==Const.SIGN_MULT ;

    }
    private static int countNumber(String str) {
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char symble = str.charAt(i);
            if (isSign(symble)){
                count++;
            }
        }
        return count;
    }

    private static double[] makeParsNumber(String str){

        int countNum = countNumber(str);
        double[] numbers = new double[countNum];
        StringBuilder argAsString = new StringBuilder();
        int currentNum = 0;
        for (int i = 0; i < str.length(); i++) {
            char symble = str.charAt(i);
            if (!isSign(symble)) {
                argAsString.append(symble);
            }
            if (isSign(symble) || i==str.length()-1 ){
                double num = Double.parseDouble(argAsString.toString());
                numbers[currentNum++] = num;
                argAsString.delete(0,argAsString.length());
            }
        }
        return numbers;
    }

    private static char[] makeParsOperation(String str){
        int countNum = countNumber(str);
        char[] operations = new char[countNum-1];
        int currentOperationIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            char symble = str.charAt(i);
            if (isSign(symble)) {
                operations[currentOperationIndex++]=symble;
            }
        }
        return operations;
    }

    private static double makeCalc (double num1, double num2, char operation ){

        switch (operation) {
            case Const.SIGN_PLUS:
                return  num1 + num2;

            case Const.SIGN_MINUS:
                return  num1 - num2;

            case Const.SIGN_MULT:
                return  num1 * num2;

            case Const.SIGN_DIV:
                return  num1 / num2;

            default: return 0;
        }


    }

    private static void addResultToHistory(String str , double result){


        for (int i = resultHistory.length-1; i > 0 ; i--) {
            resultHistory[i] = resultHistory[i-1];
        }
        resultHistory[0] = String.format(" %s = %.2f", str , result );
    }
    private static void printResult(String str, double result ){
        System.out.println("---------------------------------");
        System.out.printf(" %s = %.2f", str , result );
        System.out.println("---------------------------------");
    }
    private static void printHistory(){
        System.out.println("---------------------------------");
        System.out.println("История вычислений : ");
        System.out.println(Arrays.toString(resultHistory));
        System.out.println("---------------------------------");
    }

    private static void toContinue() {
        System.out.println("Выполниить еще раз ? (y/n) ");
        String nextCalc = sc.next();
        if (!"Y".equalsIgnoreCase(nextCalc)) {
            System.exit(0);
        }
    }
    public static void doCalc(){

        do {
            String exp = inputData();
            double[] numbers =  makeParsNumber(exp);
            char [] operations = makeParsOperation(exp);
            double result = numbers[0];
            for (int i = 1; i <numbers.length ; i++) {
                double num = numbers [i] ;
                result = makeCalc(result,num,operations[i-1]);
            }

            printResult(exp,result);
            addResultToHistory(exp,result);
            printHistory();
            toContinue();
        }
        while (true);
    }
}
