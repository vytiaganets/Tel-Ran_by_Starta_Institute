import java.util.Scanner;

public class PracticeLesson04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Добрый день, " + name );//Добрый день, Andrii
        System.out.println("Ваше имя начинается с буквы " +
                name.charAt(0) + " и заканчивается на букву: " +
                name.charAt((name.length())-1));
        //Ваше имя начинается с буквы A и заканчивается на букву: i

    }
}
