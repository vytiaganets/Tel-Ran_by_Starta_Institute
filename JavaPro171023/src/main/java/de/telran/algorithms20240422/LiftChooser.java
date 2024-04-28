package de.telran.algorithms20240422;

import java.util.Scanner;

public class LiftChooser {

    public static int setLowestFloor() {
        int lowestFloor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, укажите этаж лифта А: ");
        lowestFloor = sc.nextInt();
        return lowestFloor;
    }

    public static int setHighestFloor() {
        int highestFloor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, укажите этаж лифта В: ");
        highestFloor = sc.nextInt();
        return highestFloor;
    }

    public int setCurrentCall() {
        int currentCall;
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите ваш текущий этаж");
        currentCall = sc.nextInt();
        return currentCall;
    }

    public void liftCaller() {
        int low = setLowestFloor();
        int high = setHighestFloor();
        int call = setCurrentCall();

        int border1 = low;  //определение случайного положения лифта А
        int border2 = high;  //определение случайного положения лифта В

        System.out.println("Вы сейчас находитесь на :" + call + " этаж");

        int length1 = Math.abs(call - border1);     //определение длины хода лифта А
        int length2 = Math.abs(call - border2);     //определение длины хода лифта В

        System.out.println("Лифт А включен: " + border1 + " этаж, нужно путешествовать " + length1 + " этаж");
        System.out.println("Лифт Б включен.: " + border2 + " этаж, нужно путешествовать " + length2 + " этаж");
        System.out.println("-----");

        if (length1 < length2) {
            System.out.println("Лифт А отправляем");
        } else if (length1 == length2) {
            System.out.println("Оба лифта отправляем");
        } else {
            System.out.println("Лифт Б отправляем");
        }
    }
}