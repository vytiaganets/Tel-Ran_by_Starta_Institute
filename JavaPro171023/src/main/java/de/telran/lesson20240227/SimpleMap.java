package de.telran.lesson20240227;

import java.util.*;

public class SimpleMap {
    public static void main(String[] args) {
        //TreeMap
        System.out.println("==========TreeMap==========");
        Map<Integer, String> map1 = new TreeMap<>();
        System.out.println(map1.put(2, "Our 2"));
        map1.put(1, "Our 1");
        map1.put(5, "Our 5");
        map1.put(3, "Our 3");//added data
        //map1.put(null, "Our null");//нельзя использовать null в качестве ключа
        map1.put(0, "Our 0");//0-index
        System.out.println(map1);
        //
        System.out.println("==========ReverseTreeMap==========");
        Map<Integer, String> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.putAll(map1);
        System.out.println(map2);

        System.out.println(map2.put(3, "Our new 3"));//изменение существующих данных
        System.out.println(map2);

        System.out.println(map2.put(3, "Our new new 3"));
        map2.put(4, "Our 4");//вставка нового значения
        System.out.println(map2);

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + "==> " + entry.getClass());
        }
        //LinkedHashMap
        System.out.println("==========LinkedHashMap==========");
        Map<Integer, String> map3 = new LinkedHashMap<>();
        System.out.println(map3.put(2, "Our 2"));
        map3.put(1, "Our 1");
        map3.put(5, "Our 5");
        map3.put(3, "Our 3");//added data
        map3.put(17, "Our 17");//строго  в порядке добавления
        map3.put(null, "Our null");//0-index
        map3.put(0, "Our 0");//0-index
        System.out.println(map3);

        //HashMap
        System.out.println("==========HashMap==========");//без гарантированного порядка хранения
        Map<Integer, String> map4 = new HashMap<>();
        System.out.println(map4.put(2, "Our 2"));
        map4.put(1, "Our 1");
        map4.put(5, "Our 5");
        map4.put(3, "Our 3");//added data
        System.out.println(map4);
        map4.put(4, "Our 4");
        map4.put(null, "Our null");//0-index
        map4.put(17, "Our 17");//между 1 и 2 разместит
        map4.put(0, "Our 0");
        System.out.println(map4);//{1=Our 1, 17=Our 17, 2=Our 2, 3=Our 3, 4=Our 4, 5=Our 5}

        System.out.println("удаление: " + map4.remove(5));//удаление
        System.out.println(map4);
        System.out.println(map4.get(17));//получение по ключу

        //Итератор
        System.out.println("==========Итератор==========");
        Iterator<Map.Entry<Integer,String>> itMap = map4.entrySet().iterator();
        while (itMap.hasNext()){
            Map.Entry<Integer, String> entry = itMap.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " -> " + value + " iterator ");
            //==========Итератор==========
            //null -> Our null iterrator
            //0 -> Our 0 iterator
            //1 -> Our 1 iterrator
            //17 -> Our 17 iterrator
            //2 -> Our 2 iterator
            //3 -> Our 3 iterrator
            //4 -> Our 4 iterator
        }

        System.out.println (map4.keySet ()); // перечень ключей System.out.println (map4.values ()) ; // перечень value
        Integer [] arrKey = new Integer [10];
        Integer [] arrKey1 = map4.keySet().toArray(arrKey);
        System.out.println(Arrays. toString (arrKey1));
        /* нельзя так писать и работать с примитивным типом
        int[] arrIntKey = new int[10];
        int[] arrIntKey1 = map4.keySet().toArray (arrIntKey);
        System.out.println(Arrays.toString(arrIntKey1));*/

        //устаревший, полный аналог HashMap по методам (синхронизирован)
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Our 1");
        hashtable.put(5, "Our 2");
        hashtable.put(3, "Our 3");
        hashtable.put(17, "Our 17");//added data
        System.out.println(hashtable);

        WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<>();
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();

        //HashSet<>
        //TreeSet<>
        //LinkedHashSet<>
    }
}
