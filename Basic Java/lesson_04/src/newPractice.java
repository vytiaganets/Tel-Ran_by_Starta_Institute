import java.util.Scanner;

public class newPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите какую-то строку");//The weather is good today
        String str1 = sc.nextLine();
        System.out.println("Вы ввели: " + str1.toLowerCase() + " еще раз " + str1.toUpperCase() + "Мы получили ");
        //Вы ввели: the weather is good today еще раз THE WEATHER IS GOOD TODAYМы получили
    }
}
