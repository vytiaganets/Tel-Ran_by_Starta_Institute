import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = sc.nextInt();
        if(num >= -10 && num <= -5){
            System.out.println(num + " is line 1"); //-8 is line 1
        } else if (num == 0) {
            System.out.println(num + " is start point");
        } else if (num >= 5 && num <= 10) {
            System.out.println(num + " is line 2");
        } else {
            System.out.println(num + " is not lines");
        }
    }
}

//public class Practice3 {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Введите число: ");
//
//        int num = sc.nextInt();
//
//
//
//        if (num >= -10 && num <= -5) {
//
//            System.out.println(num + " is Line1");
//
//        } else if (num == 0) {
//
//            System.out.println(num + " is start point");
//
//        } else if (num >= 5 && num <= 10) {
//
//            System.out.println(num + " is Line2");
//
//        } else {
//
//            System.out.println(num + " is not Lines");
//
//        }
//
//    }
//
}