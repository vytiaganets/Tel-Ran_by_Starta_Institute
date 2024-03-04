//1. Имеется класс Dog с полями:
//public class Dog {
//private String name;
//private int age;
//private String colour;
//private boolean isHUngry;
//}
//На основе тестового списка экземпляров данного класса List<Dog> dogs а. Получить Map<String, Boolean> имя / информация, голодна ли собака
//b. Получить Map<String, Long> цвет / количество собак данного цвета с. Получить Map<String, Set<String>> цвет / список имен собак данного цвета
//2. Имеется некоторый текст. Составить словарь используемых в нем слов с частотой их употребления.
//Отсортировать словарь по частоте встречаемости слов (по убыванию).
package de.telran.lesson20240304practice;

import java.util.*;

//2. Имеется некоторый текст. Составить словарь используемых в нем слов с частотой их употребления.
//Отсорторовать словарь по частоте встречаемости слов (по убыванию).
public class Dictionary {
    public static void main(String[] args) {
        String text = "Mr and Mrs Dursley, of number four, Privet Drive, were proud to\n" +
                "say that they were perfectly normal, thank you very much. They\n" +
                "were the last people you’d expect to be involved in anything\n" +
                "strange or mysterious, because they just didn’t hold with such\n" +
                "nonsense.\n" +
                "Mr Dursley was the director of a firm called Grunnings, which\n" +
                "made drills. He was a big, beefy man with hardly any neck,\n" +
                "although he did have a very large moustache. Mrs Dursley was\n" +
                "thin and blonde and had nearly twice the usual amount of neck,\n" +
                "which came in very useful as she spent so much of her time craning\n" +
                "over garden fences, spying on the neighbours. The Dursleys had a\n" +
                "small son called Dudley and in their opinion there was no finer\n" +
                "boy anywhere.\n" +
                "The Dursleys had everything they wanted, but they also had a\n" +
                "secret, and their greatest fear was that somebody would discover\n" +
                "it. They didn’t think they could bear it if anyone found out about\n" +
                "the Potters. Mrs Potter was Mrs Dursley’s sister, but they hadn’t\n" +
                "met for several years; in fact, Mrs Dursley pretended she didn’t\n" +
                "have a sister, because her sister and her good-for-nothing husband\n" +
                "were as unDursleyish as it was possible to be. The Dursleys\n" +
                "shuddered to think what the neighbours would say if the Potters\n" +
                "arrived in the street. The Dursleys knew that the Potters had a\n" +
                "small son, too, but they had never even seen him. This boy was\n" +
                "another good reason for keeping the Potters away; they didn’t\n" +
                "want Dudley mixing with a child like that. \n";
        String[] words = text.split("\\W");
        //System.out.println(Arrays.toString(words));
        Map<String, Integer> dictionary = new TreeMap<>();
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                Integer count = dictionary.get(word);
                dictionary.put(word, count + 1);
            } else {
                dictionary.put(word, 1);
            }
        }
        //System.out.println(dictionary);
        Set<Map.Entry<String, Integer>> entries = dictionary.entrySet();
        List<Word> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            Word word = new Word(entry.getKey(), entry.getValue());
            list.add(word);
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }

    static class Word implements Comparable<Word> {
        String value;
        int count;

        public Word(String value, int count) {
            this.value = value;
            this.count = count;
        }

        @Override
        public int compareTo(Word another) {
            return another.count - this.count;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "value='" + value + '\'' +
                    ", count=" + count +
                    '}';
        }
    }
}

