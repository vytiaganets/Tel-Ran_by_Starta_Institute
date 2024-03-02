//Есть Map, в котором храниться количество жителей по разным городам.
//Найдите город с самым большим количеством жителей.
//Найдите среднее количество жителей по всем городам.
//Найдите все города, у которых количество жителей одинаковое.
//English
//There is a Map that stores the number of residents in different cities.
//Find the city with the largest number of inhabitants.
//Find the average number of inhabitants for all cities.
//Find all cities that have the same number of inhabitants.
package de.telran.home20240227.task1;

import java.util.*;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "Berlin", 200,
                "Paris", 200,
                "Madrid", 350);
        String maxCity = null;
        int maxValue = 0;
        int total = 0;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() > maxValue)
                maxCity = pair.getKey();
            maxValue = pair.getValue();
            total += pair.getValue();
        }
        //1.Найдите город с самым большим количеством жителей.
        System.out.println("Max citizen in " + maxCity + " = " + maxValue);//O(n)
        //2-d method
        //PrintMaxElement
        System.out.println("количество жителей в самом большом городе " + maxUsingCollectionsMax(map));

        //2.Найдите среднее количество жителей по всем городам.
        System.out.println("среднее количество жителей " + total / map.size() + " по " + map.size() + " городам");//O(n)
        //3.Найдите все города, у которых количество жителей одинаковое.
        HashMap<Integer, String> duplicatMap = new HashMap<>();
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (duplicatMap.containsKey(value)) {
                duplicatMap.put(value, duplicatMap.get(value) + ", " + key);
            } else {
                duplicatMap.put(value, key);
            }
        }
        System.out.println(duplicatMap);
        //Max citizen in Madrid = 200
        //количество жителей в самом большом городе 350
        //среднее количество жителей 250 по 3 городам
        //{200=Berlin, Paris, 350=Madrid}
    }

    static public <K, V extends Comparable<V>> V maxUsingCollectionsMax(Map<K, V> map) {
        Map.Entry<K, V> maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
        return maxEntry.getValue();
    }
}
