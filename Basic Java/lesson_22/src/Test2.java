import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random r = new Random();
        for (int i = 0; i< arr.length; i++){
            arr[i] = r.nextInt(89) + 10;//89 значений от 10-ти счет, т.е. от 10 до 99
        }
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение от 10 до 99: ");
        Integer num = sc.nextInt();
        int index = linearSearch(arr, num);
        if(index != -1){
            System.out.println("Индекс элемента = " + index);
        } else {
            System.out.println("Элемент не найден.");
        }
    }
//    [46, 91, 30, 61, 37, 84, 31, 10, 64, 62]
//    Введите значение от 10 до 99:
//            37
//    Индекс элемента = 4
    public static int linearSearch(Integer[] arr, Integer key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
