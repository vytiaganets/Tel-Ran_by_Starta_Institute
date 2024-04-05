package de.telran.lesson20240328;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SimpleZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone);//2024-03-28T12:36:47.136763+01:00[Europe/Berlin]
        String text = "2022-12-20T00:35:47.023323700+02:00[Europe/Oslo]";
        zone = ZonedDateTime.parse(text);
        System.out.println(zone);//2022-12-19T23:35:47.023323700+01:00[Europe/Oslo]
        LocalDate date = LocalDate.now();
// getting current time
        LocalTime time = LocalTime.now();
// getting system default zone id
        ZoneId zoneId = ZoneId.systemDefault();
// creating a new ZonedDateTime object
        ZonedDateTime zoneDateTime = ZonedDateTime.of(date, time, zoneId);
        System.out.println(zoneDateTime);//2024-03-28T12:36:47.192977+01:00[Europe/Berlin]
// getting a new ZonedDateTime object
        ZoneId newZoneId = ZoneId.of("Australia/Lindeman");
        zone = ZonedDateTime.now(newZoneId);
        System.out.println(zone);//2024-03-28T21:36:47.194164+10:00[Australia/Lindeman]


        // getting a new ZonedDateTime object
        ZoneId newZoneId1 = ZoneId.of("Australia/Lindeman");
        zone = ZonedDateTime.now(newZoneId1);
        System.out.println(zone);//2024-03-28T21:36:47.194388+10:00[Australia/Lindeman]


        //// getting list all zones
//        for (String s : ZoneId.getAvailableZoneIds()) {
//            newZoneId = ZoneId.of(s);
//            System.out.println(s + "---> " + ZonedDateTime.now(newZoneId));
//        }
//        // getting list all zones
//        for (String s: ZoneId.getAvailableZoneIds())
//            System.out.println(s);
        }
    }
