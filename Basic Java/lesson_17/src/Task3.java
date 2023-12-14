import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number --> ");
        int num = sc.nextInt();
        summa(num);
    }

    public static void summa(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i == 10) {
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println("Summa = " + sum);
    }
}
