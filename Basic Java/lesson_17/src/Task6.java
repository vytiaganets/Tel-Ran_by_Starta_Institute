//        Получите от пользователя Строку.
//        Напечатайте все буквы из строки, игнорируйте знаки препинания ?, !, ., ,’ и пробел
//        Для решения используйте цикл и charAt() метод
//        Например:
//        Вход = “I don’t like rain !”
//        выход = I,d,o,n,t,l,i,k,e,r,a,i,n

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("put out string");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '!'
                    && str.charAt(i) != '?'
                    && str.charAt(i) != '.'
                    && str.charAt(i) != ','
                    && str.charAt(i) != ' '
            ) {
                System.out.println(str.charAt(i));
//                I Koding
//                I
//                        K
//                o
//                        d
//                i
//                        n
//                g

            }
        }
    }
}
