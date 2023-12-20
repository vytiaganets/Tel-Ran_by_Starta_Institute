
import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год  ");
        year = scanner.nextInt();

        if (isLeap(year)) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
    static boolean isLeap(int year) {
        Boolean isLeapYear = false;
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    return isLeapYear = true;
                }
                return isLeapYear = true;

            } else {
                return false;
            }
        } else {
            System.out.println("Год до 1582 ");
        }
        return isLeapYear;
    }
}