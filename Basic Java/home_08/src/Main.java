//№1.
//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 49 + 1);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                arr[i] = 0;
            System.out.println(arr[i] + " ");
        }
    }
}
