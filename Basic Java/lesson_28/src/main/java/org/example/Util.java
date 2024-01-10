package org.example;

public class Util {
    public static boolean isCorrectOperation(char oper) {
        boolean result = false;
        char[] array = {'+', '-', '*', '/'};
        for (int i=0; i<array.length; i++) {
            if (array[i] == oper) {
                result = true;
                break;
            }
        }
        return result;
    }

//    public static void checkDivByZero(double num) {
//       if (num == 0) {
//           System.out.println("делить  на ноль нельзя ");
//       }
//    }

    public static boolean isDiv(double num) {
        return num !=0;
    }



}