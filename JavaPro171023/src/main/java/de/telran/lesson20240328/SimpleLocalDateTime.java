package de.telran.lesson20240328;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SimpleLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2024-03-28T12:15:59.653301
        // Adding 1 year, 1 month, 1 week and 1 day
        LocalDateTime localDateTime = now
                .plusYears(1)
                .plusMonths(1)
                .plusWeeks(1)
                .plusDays(1)
                .plusMinutes(1);
        System.out.println(localDateTime);//2025-05-06T12:16:59.653301

        // Adding 1 hour, 1 minute, 1 second and 10000 nanoseconds
        localDateTime = localDateTime.
                plusHours(1)
                .plusMinutes(1)
                .plusSeconds(1)
                .plusNanos(10060);
        System.out.println(localDateTime);//2025-05-06T13:18:00.653311060

        // вывод в строку используя форматтер
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss a");
        now = LocalDateTime.now();
        now = now.minusHours(3);
        // Formatting LocalDateTime to string
        String dateTimeString = now.format(formatter);//2025-05-06T13:20:27.840011060
        System.out.println(dateTimeString);//2024-бер.-28 09:18:26 дп

    }
}
