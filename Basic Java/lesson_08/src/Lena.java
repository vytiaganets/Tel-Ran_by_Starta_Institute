import java.util.Scanner;

public class Lena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        int result = getValue(num);
        System.out.println("Рандомное число " + result);
    }
    public static int getValue(int num){
        int result = (int) (Math.random() * (num - 1));
        return result;
    }
}
