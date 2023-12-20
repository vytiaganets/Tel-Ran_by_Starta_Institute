import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[15];
        Random num = new Random();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            arr1[i] = num.nextInt(10);
        }
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("*****************");
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] < 9 && arr1[i] > 5){
                count++;
                System.out.println(arr1[i]);
            }
        }
        System.out.println("*****************");
        System.out.println(count);
    }
}
