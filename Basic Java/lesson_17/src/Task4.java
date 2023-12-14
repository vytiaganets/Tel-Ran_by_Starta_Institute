import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число");
        int num = sc.nextInt();
        faktorial(num);
    }
    public static void faktorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i; // факториал 5 = 1*2*3*4*5 //  i=1, i=2, i=3, i=4, i=5--конец цикла
        }
        System.out.println("факториал числа " + num + " = " + result);
    }
}