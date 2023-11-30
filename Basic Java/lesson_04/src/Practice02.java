import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String myString = sc.nextLine();// Today is good weather

        System.out.print("Введите первый индекс --> ");
        int indexFirst = sc.nextInt();//Введите первый индекс --> 3
        System.out.print("Введите последний индекс --> ");
        int indexLast = sc.nextInt();//Введите последний индекс --> 7

        System.out.println("Длинна Вашей строки: " +
                myString.length() + " Ваша строка содержит " +
                myString.substring(indexFirst - 1, indexLast) +
                " подстроку ");
        //Длинна Вашей строки: 21 Ваша строка содержит day i подстроку
    }
}
