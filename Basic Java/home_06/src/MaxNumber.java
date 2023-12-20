import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        int maxNumber = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите " + (i + 1) + " число  ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 1; i < 3; i++) {
            maxNumber = numbers[i - 1] > numbers[i] ? numbers[i - 1] : numbers[i];
        }
        System.out.println("Наибольшим из 3х чисел является = " + maxNumber);
    }

}