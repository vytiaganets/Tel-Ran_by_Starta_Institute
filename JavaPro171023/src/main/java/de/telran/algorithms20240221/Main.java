//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
package de.telran.algorithms20240221;

public class Main {
    public static void main(String[] args) {
            int num  = 5;
            System.out.println(num + " !="+ factorialIter( num));//5 !=120
        System.out.println(fibRecursion(num));//5
        }
        public static int factorialIter(int num) {
            int result = 1;
            for (int i = 2; i <= num ; i++) {
                result *= i;
            }
            return result;
        }
        public static int factorialRecurs(int num) {
            if (num <= 1) {
                return 1;
            }
            return 0;
        }
    public static int fibRecursion(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1 ||num==2){
            return 1;
        }
        return fibRecursion(num-2)+fibRecursion(num-1);
    }
}
