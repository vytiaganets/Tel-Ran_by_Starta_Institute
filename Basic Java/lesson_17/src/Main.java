import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
//        ТО что делится на 100 будет всегда делится на 4.

//        1. Реализуйте метод, принимающий в параметре число.
//        2. Распечатайте все входящие значения числа
//        Например:
//        Вход = 8
//        Выход =
//                1
//        2
//        3
//…
//        8
//        int i;

//        for (int i = 0; i <= 8; i++) {
//            System.out.println(i);
//        }
////        System.out.println("Out of for i: " + i);
//        int i = 100;

//        String[] strs = new String[3];
//        strs[0] = "11";
//        strs[1] = "22";
//        strs[2] = "33";
//        for (String str: strs) {
//            System.out.println(str);
//        }

        //        infinity loop
//        for (int i = 0; i >= 0; i++) {
//            System.out.println("infinity loop");
//        }
//        for(;;) {
//            System.out.println("infinity loop");
//        }
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Input string: ");
            String input = sc.nextLine();
            if (Objects.equals(input, "q")) {
                System.out.println("Buy!");
                break;
            }
        }
    }
}
