package de.telran.lesson20240304practice;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map;


public class SetVsMap {
    public static void main(String[] args) {
        // Set<Key>  Map<Key, Value>
// Tree -- Set
// HashSet  -- Map
// TreeMap -- HashMap
        Map<String, Integer> map = new TreeMap<>();
        map.put("A", 4);
        map.put("R", 1);
        map.put("H", 9);

        map.entrySet();
    }
}
