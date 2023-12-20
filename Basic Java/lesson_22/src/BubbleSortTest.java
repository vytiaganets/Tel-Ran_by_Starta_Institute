import java.util.Arrays;

//1. Дан массив {22, 3, 4, 2, 50}
//2. Реализуйте метод bubbleSort(int[] array)
//3. Выведите на консоль массив до и после сортировки
//4. Проанализируйте код
public class BubbleSortTest
{
    public static void main(String[] args) {
        Integer[] arr = {22, 3, 4, 2, 50};
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
    }
//    public static void bubbleSort(Integer[] arr){
//        boolean isSorted = false;
//        Integer temp;
//        while(!isSorted) {
//            isSorted = true;
//            for(int i = 0; i < arr.length-1; i++){
//                if(arr[i]> arr[i+1]){
//                    temp = arr[i];
//                    arr[i] = arr[i +1];
//                    arr[i + 1] = temp;
//                    isSorted = false;
//                }
//            }
//        }
//    }
    public static void  bubbleSort(Integer[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
