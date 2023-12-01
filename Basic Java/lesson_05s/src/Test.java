import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//=========================№ 1
//        Создайте строку через new - I study Basic Java!
//                Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//        Распечатать пред-последний символ строки. Используем метод String.charAt().
//                Вырезать строку Java c помощью метода String.substring().
//                Преобразуйте строку к верхнему регистру.
//        Преобразуйте строку к нижнему регистру.
//
        //String str = new String("I study Basic Java!");
        String str = "I study Basic Java!";
        printString(str);


        //=========================№ 2
//        Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main
//        Результат распечатайте в консоль
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");//2
        String str1 = sc.nextLine();
        int num1 = Integer.parseInt(str1);
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите первое число");//2
        String str2 = scr.nextLine();
        int num2 = Integer.parseInt(str2);
        addition(num1, num2);
        subtraction(num1, num2);
        multiplication(num1, num2);
        division(num1, num2);
    }

    public static void printString(String str) {
        System.out.println(str);//I study Basic Java!
        System.out.println(str.charAt(str.length() - 2));//a
        System.out.println(str.substring(14, 18));//Java
        System.out.println(str.toLowerCase());//i study basic java!
        System.out.println(str.toUpperCase());//I STUDY BASIC JAVA!
    }

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);//4
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);//0
    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);//4
    }

    public static void division(int num1, int num2) {
        System.out.println(num1 / num2);//1
    }
}
