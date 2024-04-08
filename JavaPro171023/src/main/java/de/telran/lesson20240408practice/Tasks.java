//1) создать дату своего рождения
// - вывести на консоль на русском / английском языках
// - найти, на какой день недели выпала дата рождения
// - вычесть 10 лет из созданной даты, вывести на консоль
// - посчитать количество прожитых дней
//2) Найти дату последнего воскресенья апреля 2024. Посчитать количество дней до него.
//3) Составить список времен начала всех занятий по Java Practice за май, если предположить,
//что они будут проходить каждый понедельник/среду c 13:00 CET.
//4) Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м.
//Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.

package de.telran.lesson20240408practice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Locale;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("=========================Task 1=========================");
        //1) создать дату своего рождения
        // - вывести на консоль на русском / английском языках
        // - найти, на какой день недели выпала дата рождения
        // - вычесть 10 лет из созданной даты, вывести на консоль
        // - посчитать количество прожитых дней
        LocalDate newYear = LocalDate.of(2024, Month.JANUARY, 1);
        Locale locale = new Locale("ru");
        System.out.println("Новый Год: " + newYear.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", locale)));
        System.out.println("Новый Год: " + newYear.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH)));
        System.out.println("Day of Week: " + newYear.getDayOfWeek());
        System.out.println("The date minus 10 years: " + newYear.minusYears(10));
        LocalDate now = LocalDate.now();
        System.out.println("The number of days: " + ChronoUnit.DAYS.between(newYear, now));
        //Новый Год: 01 января 2024
        //Новый Год: 01 January 2024
        //Day of Week: MONDAY
        //The date minus 10 years: 2014-01-01
        //The number of days: 98
        System.out.println("=========================Task 2=========================");
        //2) Найти дату последнего воскресенья апреля 2024. Посчитать количество дней до него.
        LocalDate startDate = LocalDate.of(2024, Month.APRIL, 30);
        TemporalAdjuster lastSunday = TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY);
        LocalDate endDate = startDate.with(lastSunday);
        System.out.println(endDate);
        LocalDate nowDate = LocalDate.now();
        System.out.println("The number of days: " + ChronoUnit.DAYS.between(nowDate, endDate));
        //2024-04-28
        //The number of days: 20
        System.out.println("=========================Task 3=========================");
        //3) Составить список времен начала всех занятий по Java Practice за май, если предположить,
        //что они будут проходить каждый понедельник/среду c 13:00 CET.
        //LocalDate  startingDate = LocalDate.of(2024, Month.MAY, 1).with(DayOfWeek.MONDAY);

        LocalDate start = LocalDate.of(2024, Month.MAY, 1);
        List<ZonedDateTime> list = start.datesUntil(start.plusMonths(3), Period.ofDays(1))
                .filter(localDate -> localDate.getDayOfWeek().getValue() == 1 || localDate.getDayOfWeek().getValue() == 3)
                .map(localDate -> ZonedDateTime.of(localDate, LocalTime.of(13, 00), ZoneId.of("CET")))
                .toList();
        System.out.println(list);
        //[2024-05-01T13:00+02:00[CET], 2024-05-06T13:00+02:00[CET], 2024-05-08T13:00+02:00[CET], 2024-05-13T13:00+02:00[CET], 2024-05-15T13:00+02:00[CET], 2024-05-20T13:00+02:00[CET], 2024-05-22T13:00+02:00[CET], 2024-05-27T13:00+02:00[CET], 2024-05-29T13:00+02:00[CET], 2024-06-03T13:00+02:00[CET], 2024-06-05T13:00+02:00[CET], 2024-06-10T13:00+02:00[CET], 2024-06-12T13:00+02:00[CET], 2024-06-17T13:00+02:00[CET], 2024-06-19T13:00+02:00[CET], 2024-06-24T13:00+02:00[CET], 2024-06-26T13:00+02:00[CET], 2024-07-01T13:00+02:00[CET], 2024-07-03T13:00+02:00[CET], 2024-07-08T13:00+02:00[CET], 2024-07-10T13:00+02:00[CET], 2024-07-15T13:00+02:00[CET], 2024-07-17T13:00+02:00[CET], 2024-07-22T13:00+02:00[CET], 2024-07-24T13:00+02:00[CET], 2024-07-29T13:00+02:00[CET], 2024-07-31T13:00+02:00[CET]]
        System.out.println("=========================Task 4, variant 1=========================");
        //4) Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м.
        //Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.
        //variant 1
        ZonedDateTime arrivals = LocalDateTime.of( 2024, 4, 8, 15, 5)
                .atZone(ZoneId.of( "America/Los_Angeles"))
                .plusHours (10)
                .plusMinutes(50)
                .withZoneSameInstant (ZoneId.of ("Europe/Berlin"));
        System.out.println (arrivals);
        System.out.println("=========================Task 4, variant 2=========================");
        //variant 2
        ZonedDateTime from = ZonedDateTime.of(LocalDateTime.of(2024,4,8,15,5), ZoneId.of("America/Los_Angeles"));
        ZonedDateTime to = task4(ZoneId.of("CET"), from, Duration.ofMinutes(650));
        System.out.println(to);
        System.out.println("=========================Task 4, variant 3=========================");
        //variant  3
        System.out.println(getLocalTime(LocalDateTime.of(2024,4,8,15,5), ZoneId.of("CET"), Duration.ofMinutes(650), ZoneId.of("Europe/Berlin")));

    }
    public static ZonedDateTime task4(ZoneId to, ZonedDateTime from, Duration duration) {
        return from.plusMinutes(duration.toMinutes()).withZoneSameInstant(to);
    }
    public static ZonedDateTime getLocalTime (LocalDateTime departure, ZoneId departureZone, Duration duration, ZoneId arrivalZone) {
        ZonedDateTime arrivals = departure
                .atZone(departureZone)
                .plus(duration)
                .withZoneSameInstant(arrivalZone);
        return arrivals;
    }
}
