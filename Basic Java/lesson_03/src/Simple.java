import java.util.Scanner;

public class Simple {
    //psvm:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш имя: ");
        String name = sc.nextLine();
        System.out.println("Введите Ваш возраст: ");
        byte age = sc.nextByte();
        System.out.println("Вас зовут: " + name + " ваш возраст: " + age);//Вас зовут: Andre ваш возраст: 11
        byte pensionAge = 65;
        byte beforePension = (byte)(pensionAge - age);
        System.out.println(beforePension);//34
        System.out.println("до пенсии осталось: " + beforePension + " лет ");//до пенсии осталось: 24 лет
    }
}
