import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {5,12,-1, 33, 0};
        Integer[] arrCopy = Arrays.copyOf(arr, 2);//arr - source, 12 - count elements
        for(int i = 0; i< arrCopy.length; i++){
            System.out.print(arrCopy[i] + " ");
        }
        System.out.println("*******************");
        Integer[] arrCopyRange = Arrays.copyOfRange(arr, 1,4);//arr - source, 1 - index from, 4 - index to without
        for(int i = 0; i< arrCopy.length; i++){
            System.out.print(arrCopyRange[i] + " ");
        }
        System.out.println("*******************");
        //System.out.println("arr.toString()" + arr.toString());
        System.out.print("Arrays.toString(arr)" + Arrays.toString(arr));//arr.toString()[Ljava.lang.Integer;@7a81197d
        //Arrays.toString(arr)[5, 12, -1, 33, 0]
        System.out.println("*******************");
        Integer[] arrCopy3 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arrCopy3));
        Arrays.sort(arrCopy3);
        System.out.print("Arrays.toString(arrCopy3): " + Arrays.toString(arrCopy3));
        System.out.println("Arrays.toString(arr): " + Arrays.toString(arr));
        System.out.println("*******************");
        String[] fruits = {"apple", "orange", "lemon"};
        Double[] fruitPrices = {2.3, 3.5, 3.5};
        Arrays.sort(fruitPrices);
        System.out.println(Arrays.toString(fruitPrices));
    }
}
