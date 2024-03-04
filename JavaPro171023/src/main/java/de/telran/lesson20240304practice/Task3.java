//3. Напишите рекурсивный метод для вычисления возведения числа х в степень п.
//2^8
//2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 ---> 7 операций умножения
//((2 * 2) * (2 * 2)) * ((2 * 2) * (2 * 2))
//2 * 2 --> 4 * 4 - --> 16 * 16 = 256 ---> 3 операции умножения
//219 = 2 * 218
//0 (n) ----> 0(log n)
//n - четное
//xsh = x1 /2 * ×^p /2
//n - нечетное
//X^n = x^ (n-1)*×
//
package de.telran.lesson20240304practice;

public class Task3 {
    public static void main(String[] args) {
        int x = 2;
        int n = 7;
        System.out.println(power(x, n));
    }
//// n - четное
//    //x^n = x^(n/2) * x^(n/2)
//    //
//    //n - нечетное
//    //x^n = x^(n-1)*x
    public static int power(int x, int n) {
        if (n == 1)
            return x; //base  condition
        if (n % 2 == 0) {
            int a = power(x, n / 2);
            return a * a;
        } else {
            return power(x, n - 1);
        }
    }
}
