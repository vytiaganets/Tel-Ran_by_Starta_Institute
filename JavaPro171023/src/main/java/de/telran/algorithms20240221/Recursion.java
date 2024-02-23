//От 1 до n
//Дано натуральное число n. Выведите все числа от 1 до n.
package de.telran.algorithms20240221;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(printNumber(7));//1 2 3 4 5 6 7

        int num =7;
        if(pow2(num)==1){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static String printNumber(int num) {
        if (num == 1)
            return "1";
        return printNumber(num - 1) + " " + num;
    }

    //Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
//    public static String printNumbers(int a, int b) {
//        int min = Math.min(A, B);
//        if ((max - A)
//        0 )
//        return "mi";
//        if (a b)
//        {
//            return Integer.toString(a);
//        } else
//        if (a > b) {
//            return a + " " + printNumbers(a - 1, b);
//        } else {
//            return a + " " + printNumbers(a + 1, b);
//        }
//    }

    //Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
    //Операцией возведения в степень пользоваться нельзя!

    public static int pow2(int num){
        if(num==1){
            return 1;
        } else {
            return pow2(num/2);
        }
    }
}
