import java.util.Scanner;
//У вас на банковском счету N долларов.
//        Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы на счету и меньше текущей суммы.
//        Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//        Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//        Ввод:  N = 21
//        Выход:  7
//        Объяснение:  N = 21
//        Снято 7, осталось = 14
//        Снято 7, осталось = 7
//        Снято 1, осталось = 6
//        Снято 3, осталось = 3
//        Снято 1, осталось = 2
//        Снято 1, Осталось = 1
//        Снято 1, осталось = 0
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount");
        int userInput = sc.nextInt();
        System.out.println("количество дней " + getDays(userInput));
    }

    public static int getSum(int sum) {
        if (sum != 1) {
            for (int delitel = sum - 1; delitel >= 1; delitel--) {
                if (sum % delitel == 0) {
                    return delitel;
                }
            }
        }
        return 1;
    }
    public static int getDays(int sum) {
        int countDays = 0;
        int divider;
        while (sum >= 1) {
            countDays++;
            divider = getSum(sum);
            sum -= divider;
            System.out.println(" день " + countDays + " пользователь снял: " + divider + " баланс: " + sum);
        }
        return countDays;
    }
}


//public class Bank {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input amount");
//        int userInput = sc.nextInt();
////        int sum = getSum(userInput);
////
////        System.out.println(sum);
//        System.out.println("количество дней " + getDays(userInput));
//
//    }
//    public static int getSum (int sum) {
//        if(sum!=1) {
//            for (int delitel = sum - 1; delitel >= 1; delitel--) {
//                if(sum%delitel==0) {
//                    return delitel;
//                }
//            }
//
//        }
//        return 1;
//
//    }
//    public static int getDays(int sum) {
//        int countDays = 0;
//        int divider;
//        while (sum>=1) {
//            countDays++;
//            divider = getSum(sum);
//            sum-=divider;
//            System.out.println(" день " + countDays + ". пользователь снял:  " + divider + "  " +
//                    "баланс: " + sum);
//        }
//        return countDays;
//    }
//}