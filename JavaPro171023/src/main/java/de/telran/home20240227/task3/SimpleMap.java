//Найти маршрут из заданного списка билетов, желательно используя Map.
//Учитывая список билетов, найти маршрут по порядку, используя данный список.
//Вход:
//«Berlin» -> «London»
//«Tokyo» -> «Seoul»
//«Mumbai» -> «Berlin»
//«Seoul» -> «Mumbai»
//Выход:
//Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon
//English
//Find a route from a given list of tickets, preferably using Map.
//Given a list of tickets, find the route in order using the given list.
//Entrance:
//"Berlin" -> "London"
//"Tokyo" -> "Seoul"
//"Mumbai" -> "Berlin"
//"Seoul" -> "Mumbai"
//Exit:
//Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon
package de.telran.home20240227.task3;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Berlin", "Lindon");
        tickets.put("Tokyo", "Seoul");
        tickets.put("Mumbai", "Berlin");
        tickets.put("Seoul", "Mumbai");

        String begin = "";
        for (Map.Entry<String, String> e : tickets.entrySet()) {
            if (!tickets.containsValue(e.getKey())) begin = e.getKey();
        }
        System.out.println(begin);
        String current = begin;
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(current + " -> " + tickets.get(current));
            current = tickets.get(current);
        }
        //Tokyo
        //Tokyo -> Seoul
        //Seoul -> Mumbai
        //Mumbai -> Berlin
        //Berlin -> Lindon
    }
}
