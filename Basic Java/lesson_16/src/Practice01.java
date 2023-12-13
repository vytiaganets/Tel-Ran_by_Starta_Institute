import java.util.Random;


//Создайте switch-блок, который мог бы определить, является ли переданный день выходным или рабочим днем.
//
//        Создайте переменные int day; String dayString;
//
//        Используйте объединение для несколько случаев без операторов break
//
//        Реализуйте тот же процесс используя if-else блоки
//
//        Реализуйте тот же процесс используя тернарное выражение
//
//        Сравните решения
import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {


        final int a = 10;

        final int b = 33;

        final int c = 99;


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 100");

        int num = sc.nextInt();

        switch (num) {

            case a:

            case b:

            case c:

                System.out.println("Вы выйграли!");

                break;

            default:

                System.out.println("Вам повезет в следующий раз!");

        }


        if (num == a || num == b || num == c) {

            System.out.println("Вы выйграли!");

        } else if (num < 1 || num > 100) {


            System.out.println("Неправильное число");

        } else {

            System.out.println("Вам повезет в следующий раз!");

        }

    }


    String res = num == a || num == b || num == c ? "Вы выйграли!" : "Вам повезет в следующий раз!";

        System.out.println(res);


}

}

 

 

 