package de.telran.algorithms20240306;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        //int[] arr = {8, 4, 2, 1};
        System.out.println(getInvCount(arr));
        //3, 1
        //3, 2
        //2

        //8, 4
        //8, 2
        //8, 1
        //4, 2
        //4, 1
        //2, 1
        //6
    }

    private static int getInvCount(int[] arr) {//n log n
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {//n^2/2
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println(arr[i] + ", " + arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
}