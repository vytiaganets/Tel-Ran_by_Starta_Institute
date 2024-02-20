package de.telran.lesson20240220;

import java.util.*;

public class SimpleCompare {
    public static void main(String[] args) {
        //List<Integer> list = List.of(2, 7, 3, 9, 5, 2, 6);
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 7, 3, 9, 5, 2, 6));
        list.add(4);//error for List.of
        System.out.println(list);//[2, 7, 3, 9, 5, 2, 6, 4]
        Collections.sort(list);//сортируем
        System.out.println(list);//[2, 2, 3, 4, 5, 6, 7, 9]

        List<Cat> listCats = new ArrayList<>();
        Cat cat1 = new Cat("Tom", 10);
        listCats.add(cat1);
        listCats.add(new Cat("Bom", 20));
        listCats.add(new Cat("Pom", 30));
        listCats.add(new Cat("Kom", 40));
        listCats.add(new Cat("Alica", 10));
        System.out.println(listCats);
        System.out.println("Tom ->" + Integer.toHexString(cat1.hashCode()));
        //[Cat{name='Tom', age=10}, Cat{name='Bom', age=20}, Cat{name='Pom', age=30}, Cat{name='Kom', age=40}]
        //Tom ->5caf905d

        Collections.sort(listCats);//sort
        System.out.println(listCats);
        Collections.sort(listCats, new NameComparator());
        System.out.println(listCats);
        //[Cat{name='Alica', age=10}, Cat{name='Tom', age=10}, Cat{name='Bom', age=20}, Cat{name='Pom', age=30}, Cat{name='Kom', age=40}]
        //[

        //3. анонимный класс Comparator c переменной
        Comparator<Cat> comparatorAgeRevers = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o2.getAge() - o1.getAge();//0, -1 if o2<o1, 1 if o2>o1 убывание
            }
        };
        Collections.sort(listCats, comparatorAgeRevers);
        System.out.println(listCats);
// //2. чистый анонимный класс Comparator (одноразовое использование)
        Collections.sort(listCats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge(); //возрастание
            }
        });
        System.out.println(listCats);

        // работаем с Set
        SortedSet<Cat> catsTree = new TreeSet<>(listCats);
        System.out.println(catsTree);

        SortedSet<Cat> catsTreeName = new TreeSet<>(new NameComparator());
        catsTreeName.addAll(listCats);
        catsTreeName.add(new Cat("Dunja", 38));
        System.out.println(catsTreeName);
    }



}
//3. реализация через именной класс NameComparator
class NameComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
            return o1.getName().compareTo(o2.getName()); // сравнение 2-го уровня
    }
}
