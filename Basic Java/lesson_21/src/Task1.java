public class Task1 {
    public static void main(String[] args) {
        Integer[] arr1 = {10, 2, 30, -1, 0};
        int max = arr1[0];
        int min = arr1[0];
        for(int i = 1; i < arr1.length; i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
            if(arr1[i]< min){
                min = arr1[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
