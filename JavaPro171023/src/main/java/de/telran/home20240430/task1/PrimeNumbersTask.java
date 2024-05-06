package de.telran.home20240430.task1;

import java.util.concurrent.Callable;

public class PrimeNumbersTask implements Callable<Integer> {
    int start;
    int end;

    public PrimeNumbersTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Integer call() {
        int count = 0;
        for (int i = start; i < end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                count++;
        }
        return count;
    }
}