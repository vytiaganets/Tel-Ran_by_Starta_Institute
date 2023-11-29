import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    byte b = 10;
//    Byte bClass = 11;
//        System.out.println("Simple byte = " + b + ". Class Byte = " + bClass);//Simple byte = 10. Class Byte = 11
//    Short sClass = 1;
//    Integer iClass = 12;
//        int number= 345;
//        int num1 = number / 100;
//        int num2 = (number / 10) / 10;
//        //System.out.println(number + " " + num1);//345 3
//        System.out.println(number + " " + num2);
//        int b = 1200;
//        System.out.println("Main b = " + b);
//        someMethod();
//        System.out.println("Main b = " + b);
//        ExampleStatic exampleStatic = new ExampleStatic("John");
//        System.out.println(exampleStatic.name);
//        System.out.println(ExampleStatic.PI);
//        int r = 5;
        //System.out.println(2 * r * ExampleStatic.PI);
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        System.out.println(number);//то что мы вводим в консоль, то и получаем
        char ch = sc.next().charAt(0);//пользователь введет строку но мы возьмем 1 символ
        String str = sc.nextLine();
        System.out.println(ch);//пользователь введет строку но мы берем 1 - й символ
        System.out.println(str.charAt((0)));
    }
    public static void someMethod(){
       byte b = 12;

        System.out.println("someMethod b = " + b);
    }
}