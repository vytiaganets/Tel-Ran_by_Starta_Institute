package de.telran.lesson20240216summary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,2};
        System.out.println(Arrays.toString(getSumIndexes(arr,5)));//[1, 2]
        // [1,5,3,4,2], 5
        // i, j => 2, 4
        //Map<Integer, Integer>;
    }
    public static int[] getSumIndexes(int[] arr, int sum) {
        Map<Integer, Integer> elemToIndex = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            elemToIndex.put(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i] + arr[j] == sum){
//                    return new int[] {i, j};
//                }
//            }
            if(elemToIndex.containsKey(sum - arr[i])){
                int j = elemToIndex.get(sum - arr[i]);
                if(i==j){
                    continue;
                }
                return new int[] {
                        i, j
                };
            }
        }
        return null;
    }

}
