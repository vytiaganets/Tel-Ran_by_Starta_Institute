// 1.Quick sort пишем еще раз “с чистого листа”, но сортировка в порядке убывания значения. SimpleHome file
//2.Написать проверку числа "простое" ли оно, используя итерационный подход (не рекурсия) SimplePrime file
//3*.Реализовать Quick sort используя итерационный подход. SimpleIterativQuickSort file
//1.Quick sort We write again “from scratch”, but sort in descending order of value.
//2.Write a check to see if a number is “prime” using an iterative approach. (not recursion)
//3*.Implement Quick sort using an iterative approach.
package de.telran.algorithms20240313;

public class SimplePrime {
    static int i = 2;
    public static void main(String args[])
    {
        System.out.println(prime(121));
        System.out.println(prime(11));
        System.out.println(prime(5));
        //121 не является простым
        //11 является простым
        //5 является простым
    }
        public static String prime(int n){
        if(n <= 0){
            return("Пожалуйста, введите число больше 0");
        }
        while(i < n){
            if(n % i == 0){
                return(n + " не является простым");
            }
            i++;
        }
        return (n + " является простым");
    }
}
