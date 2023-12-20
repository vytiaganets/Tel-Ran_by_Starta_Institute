import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int leng = sc.nextInt();

        Integer[] arr = new Integer[leng];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {

            if (i+1 == arr.length) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.print(" ]");
        }
    }
//    Введите размер массива:
//        3
//        1
//        3
//        5
//        [ 1, 3, 5 ]

//2
//        1
//        5
//        1 5