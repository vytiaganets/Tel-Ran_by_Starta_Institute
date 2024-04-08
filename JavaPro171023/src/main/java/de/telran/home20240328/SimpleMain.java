package de.telran.home20240328;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("=========================Task 1=========================");
        //1) реализовать метод, который принимает год и проверяет на високосность
        //1) implement a method that takes a year and checks for leap years
        String year1 = "2023";
        isLeapYear(year1);
        String year2 = "2024";
        isLeapYear(year2);

        System.out.println("=========================Task 2=========================");
        //2) вывести на консоль дату локализованную для Индии (например)
        //2) display the date localized for India (for example) to the console
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        LocalDate localDate = LocalDate.now(zoneId);
        System.out.println("Now in India: " + localDate);

        System.out.println("=========================Task 3=========================");
        //3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
        //3) display the date in the format 19-12-22, 19, 353, 11:47 <date, day of the month, day of the year, time>
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy, dd, D, HH:mm", Locale.ENGLISH);
        LocalDateTime today = LocalDateTime.now();
        String todayString = today.format(dateTimeFormatter);
        System.out.println("Today's date in specified format: " + todayString);

        System.out.println("=========================Task 4=========================");
        //4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
        //4) create your date of birth, output it to the console in the format "January 10, 1985"
        LocalDate myBirthday = LocalDate.of(1991, Month.AUGUST, 24);
        Locale locale = new Locale("ru");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        String birhtdayString = myBirthday.format(dateTimeFormatter1);
        System.out.println("My date of birth: " + birhtdayString);

        System.out.println("=========================Task 5=========================");
        //5) проверить дата "10 Января 1985" - это пятница?
        //5) check the date "January 10, 1985" - is it Friday?
        String dateRussian = "10 Января 1985";
        String dayRussian = "пятница";
        String dayRussian1 = "четверг";
        String localeRussian = "ru";
        checkDayOfWeek(dateRussian, dayRussian, localeRussian);
        checkDayOfWeek(dateRussian, dayRussian1, localeRussian);

        System.out.println("=========================Task 6=========================");
        //6) вычесть 10 лет из созданной даты, вывести на консоль
        //6) subtract 10 years from the created date, output to the console
        LocalDate date = LocalDate.of(2024, Month.APRIL, 8);
        System.out.println("Original date: " + date);
        date = date.minusYears(10);
        System.out.println("Received date: " + date);

        System.out.println("=========================Task 7=========================");
        //7) получить обьект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        //7) get the Instant object from "2022-12-19T06:55:30.00Z", output to the console
        String string = "2022-12-19T06:55:30.00Z";
        Instant instant = Instant.parse(string);
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());

        System.out.println("=========================Task 8=========================");
        //8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль
        //8) get ZonedDateTime from "Pacific/Midway", output to the console
        ZoneId zoneId1 = ZoneId.of("Pacific/Midway");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId1);
        System.out.println(zonedDateTime);
        //=========================Task 1=========================
        //2023 is not a leap year.
        //2024 is a leap year.
        //=========================Task 2=========================
        //Now in India: 2024-04-08
        //=========================Task 3=========================
        //Today's date in specified format: 08-04-24, 08, 99, 18:59
        //=========================Task 4=========================
        //My date of birth: 24 августа 1991
        //=========================Task 5=========================
        //10 января 1985 --> пятница? --> false
        //10 января 1985 --> четверг? --> true
        //=========================Task 6=========================
        //Original date: 2024-04-08
        //Received date: 2014-04-08
        //=========================Task 7=========================
        //2022-12-19T06:55:30Z
        //1671432930
        //=========================Task 8=========================
        //2024-04-08T05:59:14.100992-11:00[Pacific/Midway]
    }

    public static void isLeapYear(String stringYear) {
        String stringDate = stringYear.concat("-01-01");
        LocalDate date = LocalDate.parse(stringDate);
        boolean isLeap = date.isLeapYear();
        if (isLeap) {
            System.out.println(date.getYear() + " is a leap year.");
        } else {
            System.out.println(date.getYear() + " is not a leap year.");
        }
    }

    public static void checkDayOfWeek(String date, String dayWeek, String localeString) {
        if (localeString.equals("ru")) {
            date = date.toLowerCase();
        }

        if (localeString.equals("de")) {
            date = date.replace(".", "");
        }

        boolean result = false;

        Locale locale = new Locale(localeString);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        LocalDate dateToCheck = LocalDate.parse(date, formatter);

        DayOfWeek dayOfWeek = dateToCheck.getDayOfWeek();
        String dayOfWeekString = dayOfWeek.getDisplayName(TextStyle.FULL, locale);

        if (dayWeek.equals(dayOfWeekString)) {
            result = true;
        }
        System.out.println(date + " --> " + dayWeek + "? --> " + result);

    }
}