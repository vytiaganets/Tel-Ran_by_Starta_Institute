package de.telran.lesson20240328;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class SimpleLocalDate {
    public static void main(String[] args) {
        //Создание обьекта
        LocalDate date = LocalDate.now();

        LocalDate date2 = LocalDate.of(2024, Month.MARCH, 27);
        System.out.println(date2);//2024-03-27
        //получение элементов из даты
        int year = date.getYear();
        int month = date.getMonthValue(); //1...12
        System.out.println(month);//3
        Month monthEnum = date.getMonth();
        System.out.println(monthEnum);//MARCH

        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek DayOfWeek = date.getDayOfWeek(); //день недели как элемент перечисления
        System.out.println(date);//2024-03-28
        System.out.println(DayOfWeek);//THURSDAY
        System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);//28.3.2024

        LocalDate date1 = LocalDate.of(1996, 1, 1);
        System.out.println(date1);//1996-01-01

        //Арифметические операциии
        //добавление или удаление любого элемента  даты
        date1 = date1.plusYears(4);
        date1 = date1.plusMonths(3);
        date1 = date1.plusDays(14);
        System.out.println(date1);//2000-04-15

        date1 = date1.minusMonths(10);
        date1 = date1.minusDays(3);
        System.out.println(date1);//1999-06-12

        //сравнение даты
        System.out.println("isAfter = " + date.isAfter(date1));//isAfter = true
        System.out.println("isBefore = " + date.isBefore(date1));//isBefore = false
        System.out.println("equals = " + date.equals(date1));//equals = false
        System.out.println("compareTo = " + date.compareTo(date1));//compareTo = 25
        System.out.println("compareTo = " + date1.compareTo(date));//compareTo = -25
    }
}
