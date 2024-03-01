// Нужно сгруппировать числа по десяткам. На вход данные положительные целые числа, после группировки нужно
//        // 1..10 -> [2,4,5]
//        // 11..20 -> [12,11,19]
//        // Кроме этого, в результате в этой Map нужно сказать какая группа самая большая
//English
// We need to group the numbers by tens. The input data is positive integers, after grouping you need
// // 1..10 -> [2,4,5]
// // 11..20 -> [12,11,19]
// // In addition, as a result in this Map we need to say which group is the largest
package de.telran.lesson20240301summary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 6, 10, 23, 45, 12, 14, 7, 8, 12, 15,23,2,24,28,37);
        Map<Integer,List<Integer>> groupToIntegers = new HashMap<>();
        for(Integer number : numbers){
            int groupId  = (number - 1) / 10;//ключ мапы
            List<Integer> integers = groupToIntegers.get(groupId);//Alt+Enter
            if(integers == null){
                integers = new ArrayList<>();
            }
                integers.add(number);
                groupToIntegers.put(groupId,integers);

        }
        System.out.println(groupToIntegers);
        //{0=[1, 3, 4, 6, 10, 7, 8, 2], 1=[12, 14, 12, 15], 2=[23, 23, 24, 28], 3=[37], 4=[45]}

    }
}


