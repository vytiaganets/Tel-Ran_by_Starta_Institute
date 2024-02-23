//Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
//Операцией возведения в степень пользоваться нельзя!
package de.telran.algorithms20240221;

public class Numbers {
    public class Main {

        public static void main(String[] args) {
//        System.out.println(printNumber(7));
            int num = 7;
            if (pow2(num) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        public static int pow2(double num) {
            if (num == 1) {
                return 1;
            } else if (num > 1 && num < 2) {
                return 0;
            } else {
                return pow2(num / 2);
            }

        }
    }
}
