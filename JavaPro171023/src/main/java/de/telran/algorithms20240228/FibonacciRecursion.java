package de.telran.algorithms20240228;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(fibonacciRecursion(3));
        System.out.println(fibonacciUpgrade(3, arr));
//3
//4
    }

    private static int fibonacciRecursion(int n) {
        if (n < 2) {
            return 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    private static int fibonacciUpgrade(int n, int[] arr) {
        if (n < 2) {
            return 1;
        }
        if (arr[n] != -1) {
            return arr[n];
    }
        arr[n] = fibonacciUpgrade(n - 1, arr) + fibonacciUpgrade(n - 2, arr);
        return arr[n];
    }
}