package de.telran.lesson20240328;

import java.time.LocalTime;

public class SimpleLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("Текущее время = " + localTime);// Текущее время = 11:55:39.257152
        LocalTime time = LocalTime.of(10, 30);
        System.out.println("Любое время = " + time);//Любое время = 10:30

        LocalTime time1 = LocalTime.ofSecondOfDay(10_000);
        System.out.println("Любое время = " + time1);//Любое время = 02:46:40

        //Получение элементов
        LocalTime now = LocalTime.now();
        System.out.println(now.getHour());//12
        System.out.println(now.getMinute());//0
        System.out.println(now.getSecond());//53
        System.out.println(now.getNano());//822556000
        //Изменение
        LocalTime time2 = localTime.plusHours(2);
        LocalTime time3 = localTime.minusMinutes(40);
        LocalTime time4 = localTime.plusSeconds(3600);

        System.out.println(localTime);//12:05:29.287558
        System.out.println(time2);//14:05:29.287558
        System.out.println(time3);//11:25:29.287558
        System.out.println(time4);//13:05:29.287558

//        System.currentTimeMillis();
//        System.nanoTime();
    }
}
