package org.example;
import org.example.Cons;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static org.example.Util.*;

public class Main {
    public static void main(String[] args) {
//        Реализовать простую лотерею, используя конструкцию if-else-if:
//        Создать класс для лотереи
//        В методе main() реализовать лотерею
//        Добавить переменные для выигрышных номеров (5 номеров)
//        Добавить переменные для номеров пользователя
//        Получить от пользователя 5 номеров, используем Сканер
//        Ограничить игровые номера от 1 до 50
//        Рандомально присвоить в переменные выигрышные номера
//        Распечатать на консоль номера лотереи и номера введенные пользователем

        Integer nums = 5;
//        Integer userNum1;
//        Integer userNum2;
//        Integer userNum3;
//        Integer userNum4;
//        Integer userNum5;
        //Integer range = 50;

//        Integer luckyNum1;
//        Integer luckyNum2;
//        Integer luckyNum3;
//        Integer luckyNum4;
//        Integer luckyNum5;
        Integer winsCount = 0;
        Integer winNum = 5;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите первое число");
//        userNum1 = sc.nextInt();
//        System.out.println("Введите второе число");
//        userNum2 = sc.nextInt();
//        System.out.println("Введите третье число");
//        userNum3 = sc.nextInt();
//        System.out.println("Введите четвертое число");
//        userNum4 = sc.nextInt();
//        System.out.println("Введите пятое число");
//        userNum5 = sc.nextInt();

//        luckyNum1 = (int)(Math.random() * (range - 1) + 1);
//        luckyNum2 = (int)(Math.random() * (range - 1) + 1);
//        luckyNum3 = (int)(Math.random() * (range - 1) + 1);
//        luckyNum4 = (int)(Math.random() * (range - 1) + 1);
//        luckyNum5 = (int)(Math.random() * (range - 1) + 1);

//        Integer[] userNums = new Integer[nums];
        Integer[] userNums = inputUserData();
//        Integer[] winNums = new Integer[nums];
        Integer[] winNums = createWinData();
                //Integer tempNum;

//        for (int i = 0; i < userNums.length; i++) {
//            while (true) {
//                System.out.println("Введите " + (i + 1) + " число");
//                tempNum = sc.nextInt();
//                if (tempNum < 1 || tempNum > RANGE) {
//                    System.out.println("Your number is out as range.Try again");
//                } else {
//                    userNums[i] = tempNum;
//                    break;
//                }
//            }
//
//        }


//        for (int i = 0; i < winNums.length; i++) {
//            winNums[i] = (int) ((Math.random() * (range - 1)) + 1);
//        }
//        for (int i = 0; i < userNums.length; i++) {
//            for (int j = 0; j < winNums.length; j++) {
//                if (userNums[i] == winNums[j]) {
//                    winsCount++;
//                }
//            }
//        }
//        System.out.println("Выиграшные номера: " + Arrays.toString(winNums));
        System.out.println("Выиграшные номера: " + Arrays.toString(winNums));
        System.out.println("Пользовательские номера: " + Arrays.toString(userNums));
//        System.out.println("Выиграшных чисел: " + winsCount);
        System.out.println("Выиграшных чисел: " + countWinNum(userNums, winNums));
        //Выиграшные номера: [43, 35, 10, 22, 45]
        //Пользовательсие номера: [23, 43, 65, 87, 65]
        //Выиграшных чисел: 1
    }

}
