//У вас есть приют для животных, в которых живут коты.
//Есть объект Cat с данными: имя, возраст, вес, порода.
//создайте Map, ключом которого будет имя, а значением объект Cat.
//1.информация о котах должна храниться в упорядоченном виде по имени.
//2.выведите имена котов, порода которых равна N (на ваше усмотрение).
//3.выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
//4.* найдите кота с самым большим весом и возрастом одновременно.
//English
//You have an animal shelter where cats live.
//There is a Cat object with data: name, age, weight, breed.
//create a Map whose key is the name and the value is the Cat object.
//information about cats should be stored in an ordered form by name.
//print the names of cats whose breed is N (at your discretion).
//print a list of all cats whose weight is greater than the value M (at your discretion).
//* find the cat with the highest weight and age at the same time.
package de.telran.home20240227.task2;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bob", 33, 12, "sredis");
        Cat cat2 = new Cat("Pop", 12, 32, "fredis");
        Cat cat3 = new Cat("Von", 23, 32, "predis");
        Cat cat4 = new Cat("Don", 23, 23, "mredis");

        Map<String, Cat> cats = Map.of(
        "Bob", cat1,
        "Pop", cat2,
        "Von", cat3,
        "Don", cat4);

        //1.информация о котах должна храниться в упорядоченном виде по имени.
        System.out.println("=================task1=================");

        //2.выведите имена котов, порода которых равна N (на ваше усмотрение).
        System.out.println("=================task2=================");

        //3.выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
        System.out.println("=================task3=================");

        //4.* найдите кота с самым большим весом и возрастом одновременно.
        System.out.println("=================task4=================");
        int maxWeight=0;
        int maxAge = 0;
        String catName = "";
        for (Map.Entry<String, Cat> pair : cats.entrySet()) {
            if (pair.getValue().getWeight() > maxWeight && pair.getValue().getAge() > maxAge)
            maxWeight = pair.getValue().getWeight();
            maxAge = pair.getValue().getAge();
            catName = pair.getValue().getName();
        }
        System.out.println("кот " + catName + " с самым большим весом " + maxWeight + " и возрастом " + maxAge);
        //кот Bob с самым большим весом 32 и возрастом 33

    }
}
