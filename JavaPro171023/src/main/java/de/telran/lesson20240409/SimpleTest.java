package de.telran.lesson20240409;

public class SimpleTest {
    public static void main(String[] args) {
        int count = 0;
        int start = 1;

        for (int i = 2; 1 < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
                    if(isPrime) {
                        count++;
                        System.out.println(i);
                    }
                }
                //System.out.println("Count = " + count);
                //System.out.println("Time = "+ (System.currentTimeMillis () - start));
            }
        }
