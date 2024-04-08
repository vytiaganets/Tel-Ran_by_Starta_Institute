package de.telran.lesson20240408practice;

import java.time.Duration;
import java.time.Instant;

public class TestTime {


    public static void main(String[] args) {

        Instant start = Instant.now();
        process();
        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).getNano());

        System.nanoTime();
        System.currentTimeMillis();
    }

    private static void process() {
        for (int i = 0; i < 10_000_000; i++) {
            i++;
        }

    }


}