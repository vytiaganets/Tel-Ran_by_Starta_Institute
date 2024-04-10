//2*.Count the number of all integers in the range from Integer.MINVALUE to Integer.MAXVALUE,
//which are divisible by the number entered by the user without a remainder.
//Calculate the time it takes to calculate a given result in one thread.
//Calculate the time it takes the user to complete these tasks in parallel,
//the user must also enter the number of threads to be created countThreads manually.
//2*.Count the number of all integers in the range from Integer.MINVALUE to Integer.MAXVALUE,
//which are divisible by the number entered by the user without a remainder.
//Calculate the time it takes to calculate a given result in one thread.
//Calculate the time it takes the user to complete these tasks in parallel,
//the user must also enter the number of threads to be created countThreads manually.
package de.telran.home20240409;

import java.util.Scanner;

public class SimpleTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer in the range Integer.MINVALUE to Integer.MAXVALUE");
        int number = scanner.nextInt();
        countInteger(number);
        //Enter any integer in the range from Integer.MINVALUE to Integer.MAXVALUE
        //100
        //42949673
        //Time of process: 13059753329
    }
    public static void countInteger(int number) {
        long start = System.nanoTime();
        int count = 0;
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % number == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("Time of process:" + (System.nanoTime() - start));
    }
}