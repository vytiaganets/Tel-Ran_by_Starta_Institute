//№2.
//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                if (arr[i - 1] >= arr[i]) {
                    System.out.println("Последовательность не возрастающая");
                    break;
                }
            }
            if (i == arr.length - 1)
                System.out.println("Последовательность строго возрастающая");
        }
    }
}
