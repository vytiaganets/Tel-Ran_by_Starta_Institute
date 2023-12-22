import java.util.Scanner;

//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите температуру первой колбы: ");
        int temperature1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите температуру второй колбы: ");
        int temperature2 = sc2.nextInt();
        System.out.println(checkDevice(temperature1, temperature2));
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        boolean isCheckDevice;
        if (temperature1 > 100 && temperature2 < 100) {
            isCheckDevice = true;
        } else {
            isCheckDevice = false;
        }
        return isCheckDevice;
    }
}
