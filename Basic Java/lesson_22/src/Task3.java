import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100) + 100;

        }
        System.out.println(Arrays.toString(arr));
        //bubbleSort2(arr);
        BubbleSortTest.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
//        [185, 165, 128, 146, 195, 101, 106, 195, 134, 120]
//[101, 106, 120, 128, 134, 146, 165, 185, 195, 195]
    }
//    public static void bubbleSort2(Integer[] arr){
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
    //
}
