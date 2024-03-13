package de.telran.algorithms20240313;

public class PrimeIndirect {
    public static void main(String[] args) {
        System.out.println(isPrime(7));//true
        System.out.println(isPrime(10));//false
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1)
            return true;
        return div2(number, 2);
    }

    private static boolean div1(int number, int divider) {
        if (number == divider)
            return true;
        if (number % divider == 0)
            return false;
        else
            return div2(number, divider + 1);//indirect recursion
    }
    private static boolean div2(int number, int divider) {
        if (number == divider)
            return true;
        if (number % divider == 0)
            return false;
        else
            return div1(number, divider + 1);//indirect recursion
    }
}
