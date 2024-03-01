//// Дан набор измерений температуры, нужно посчитать какая температура встречалась реже всего и вывести три
//        // самых частых значений.
//        List.of(30, 29, 30, 28, 1, -20, -20);
//        int mostFrequent = 1; // 1 или 28 или 19
//        List<Integer> threeMostFrequent = List.of(30, -20, 1);
package de.telran.lesson20240301summary;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List.of(30, 29, 30, 28, 1, -20, -20);
        //List<Integer> temperuture = List.of(30, 29, 30, 28, 1, -20, -20);
        List<Integer> temperature = List.of(30, 29);
        int mostFrequent = 1; // 1, или 28, или 19
        List<Integer> threeMostFrequent = List.of(30, -20, 1);

        Map<Integer, Integer> tempToCount = new TreeMap<>();
        for (Integer i : temperature){
            if(!tempToCount.containsKey(i)){
                tempToCount.put(i,1);
            } else {
                tempToCount.put(i,tempToCount.get(i)+1);
            }
        }
        List<Map.Entry<Integer, Integer>> tempList = new ArrayList<>(tempToCount.entrySet());
        Collections.sort(tempList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });//sorted
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3 && i < tempList.size(); i++) {
            result. add(tempList.get(i).getKey());
        }
        int lessFrequent = tempList.get(tempList.size()-1).getKey();
        System.out.println(result);
        System.out.println("lessFrequent: " + lessFrequent);
    }
}
