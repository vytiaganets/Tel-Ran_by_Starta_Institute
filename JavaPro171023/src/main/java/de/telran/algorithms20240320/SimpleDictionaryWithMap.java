package de.telran.algorithms20240320;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleDictionaryWithMap {
    public static void main(String[] args) {
        buildDictionaryWithMap("Build a frequency dictionary of letters of the Russian (or English) alphabet.");
        //a = 5
        //b = 2
        //c = 2
        //d = 2
        //e = 7
        //f = 3
        //g = 1
        //h = 3
        //i = 5
        //j = 0
        //k = 0
        //l = 4
        //m = 0
        //n = 4
        //o = 4
        //p = 1
        //q = 1
        //r = 5
        //s = 4
        //t = 5
        //u = 3
        //v = 0
        //w = 0
        //x = 0
        //y = 2
        //z = 0
    }
    static void buildDictionaryWithMap(String text){
        text = text.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                map.compute(ch, (character, integer)
                        -> integer == null ? 1 : integer + 1);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
