//Сгруппируйте слова с одинаковым набором символов, желательно используя Map.
//Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
//вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
//Выход:
//student, students,
//cat, act,
//dog, god,
//flow, wolf
//English
//Group words with the same character set, preferably using a Map.
//Given a list of words with lowercase letters. Implement a function to search for all words with the same unique set of characters.
//input: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
//Exit:
//student, students,
//cat, act,
//dog, god,
//flow, wolf
package de.telran.home20240227.task4;
import java.util.*;
public class SimpleMap {
    public static void main(String[] args) {
        //List of unique sets of letters based on the input array of strings
        String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
        findSameUniqChar(words);
        groupWords(words);
        //students, student
        //god, dog
        //act, cat
        //wolf, flow
        //[cat, act]
        //[flow, wolf]
        //[dog, god]
        //[student, students]
    }

    private static void groupWords(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            Map<Character, String> sMap = new HashMap<>();
            for (int i = 0; i < chars.length; i++) {
                sMap.put(chars[i], s);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Character, String> pair : sMap.entrySet()) {
                sb.append(pair.getKey());
            }

            String str = String.valueOf(sb);
            List<String> list = new ArrayList<>();
            list.add(s);
            List<String> values = map.getOrDefault(str, list);

            if (!values.contains(s)) {
                values.add(s);
            }
            map.putIfAbsent(str, values);

        }
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            System.out.println(e.getValue());

        }

    }

    public static void findSameUniqChar(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            Set<Character> set1 = new TreeSet<>();
            for (int k = 0; k < strings[i].length(); k++) {
                set1.add(strings[i].charAt(k));
            }
            String str1 = String.valueOf(set1);
            for (int j = 1; j < strings.length; j++) {
                Set<Character> set2 = new TreeSet<>();
                for (int k = 0; k < strings[j].length(); k++) {
                    set2.add(strings[j].charAt(k));
                }
                String str2 = String.valueOf(set2);

                if (str1.length() == str2.length() && i != j) {
                    if (primitiveHash(str1) == primitiveHash(str2)) {
                        System.out.println(strings[j] + ", " + strings[i]);
                        i++;
                        break;
                    }
                }
            }
        }
    }

    public static int primitiveHash(String string) {
        int hash = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            hash += c * 29;
        }
        return hash;
    }
}