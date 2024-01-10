package org.example;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.Cons.*;

public class Util {
    public static void printResult(Integer[] winNums, Integer[] userNums){
        System.out.println("Пользовательские номера: " + Arrays.toString(winNums));
        System.out.println("Выиграшные номера: " + Arrays.toString(userNums));
        System.out.println("Выиграшных чисел: " + countWinNum(userNums, winNums));
//        Пользовательские номера: [23, 43, 32, 21, 43]
//        Выиграшные номера: [37, 31, 43, 2, 28, 49, 35, 46, 14, 33, 37, 9, 42, 47, 3]
//        Выиграшных чисел: 2
    }
    public static Integer[] inputUserData(){
        Integer tempNum;
        Integer[] userNums = new Integer[USER_NUM];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < userNums.length; i++) {
            while (true) {
                System.out.println("Введите " + (i + 1) + " число");
                tempNum = sc.nextInt();
                if (tempNum < 1 || tempNum > RANGE) {
                    System.out.println("Your number is out as range.Try again");
                } else {
                    userNums[i] = tempNum;
                    break;
                }
            }

        }
        return userNums;
    }

    public static Integer[] createWinData(){
        Integer[] winNums = new Integer[WIN_NUM];
        for (int i = 0; i < winNums.length; i++) {
            winNums[i] = (int) ((Math.random() * (RANGE - 1)) + 1);
        }

        return winNums;
    }

    public static Integer countWinNum(Integer[] userData, Integer[] winData){
        Integer winsCount =0;
        for (int i = 0; i < userData.length; i++) {
            for (int j = 0; j < winData.length; j++) {
                if (userData[i] == winData[j]) {
                    winsCount++;
                }
            }
        }
        return winsCount;
    }


    public static boolean isNotUniq(Integer[] arr, Integer key) {        boolean result = false;        for (int i = 0; i < arr.length; i++) {            if (arr[i] == key) {                result = true;                break;            }        }        return result;    }
    https://codeshare.io/6pjMDYpublic static Integer[] checkArrayUniq (Integer[] arr, int typeInput) {

// 0    - Manual input
// else - Automatic input

                    boolean checkArr = true;
        Scanner sc = new Scanner(System.in);

        while (checkArr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        if (typeInput == 0) {
                            System.out.print("Input number --> ");
                            arr[i] = sc.nextInt();
                        } else {
                            arr[i] = (int) ((Math.random() * (RANGE - 1)) + 1);
                        }}
                   else {checkArr = false; }
                }
            }
        }
        return arr;
    }
   
                public static void startLottery(){
                Integer[] userNums = checkArrayUniq (inputUserData(),0);
                Integer[] winNums = checkArrayUniq  (createWinData(),1);
                printResult(userNums, winNums);
            }
            


public static Integer[] createWinData() {        int curNum;        Integer[] winNums = new Integer[WIN_NUM];        for (int i = 0; i < winNums.length; i++) {            curNum = (int) ((Math.random() * (RANGE - 1)) + 1);            while (isNotUniq(winNums, curNum)) {                curNum = (int) ((Math.random() * (RANGE - 1)) + 1);            }            winNums[i] = curNum;        }        return winNums;    }

public static Integer[] inputUserData() {        Integer tempNum;        Integer[] userNums = new Integer[USER_NUM];        Scanner sc = new Scanner(System.in);        for (int i = 0; i < userNums.length; i++) {
                    while (true) {                System.out.println("Input a " + (i + 1) + " number (from 1 to 50)");                tempNum = sc.nextInt();                if ((tempNum < 1 || tempNum > RANGE) || isNotUniq(userNums, tempNum)) {                    System.out.println("Your number is out of range or not uniq. Try again");                } else {                    userNums[i] = tempNum; // тестируем длину массива на совпадение с константами                    break;                }            }        }        return userNums;    }
}

//
//    public static Integer[] createWinData(){
//
//        Integer[] winNums   = new Integer[WIN_NUM];
//
//        for (int i = 0; i < winNums.length; i++) {
//            winNums[i] =  (int) ((Math.random()*(RANGE-1))+1);
//        }
//        return winNums;
//    }
//
//    public static Integer countWinNum(Integer[] userData, Integer[] winData) {
//
//        Integer winsCount = 0;
//        for (int i = 0; i < userData.length ; i++) {
//            for (int j = 0; j < winData.length; j++) {
//                if (userData[i] == winData[j]) {
//                    winsCount++;
//                }
//            }
//        }
//        return winsCount;
//    }
//}
//
//Это был Util  из 2-ух кусков
//        package org.example;
//
//public class Const {
//
//    public static final Integer WIN_NUM = 15 ;
//    public static final Integer USER_NUM = 5;
//    public static final Integer RANGE = 50;
//
//}
//
//    Integer[] userNums  = inputUserData();
//    Integer[] winNums   = createWinData();
//
//        System.out.println("Win number " + Arrays.toString(winNums));
//                System.out.println("User numbers " + Arrays.toString(userNums));
//                System.out.println("Win count number " + countWinNum(userNums, winNums));