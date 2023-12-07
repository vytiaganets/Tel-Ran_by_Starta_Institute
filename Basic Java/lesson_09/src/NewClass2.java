import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а: ");//-5
        int a = sc.nextInt();
        System.out.println("Введите b: ");//10
        int b = sc.nextInt();
        System.out.println("Введите c: ");//6
        int c = sc.nextInt();
        boolean d = false;
        if ((a + b) > c) {
            d = !d;
        } else if ((b - c) > a) {
            d = !!d;
        } else {
            d = !false;
        }
        System.out.println("Результат d: " + d);//false
    }
}
