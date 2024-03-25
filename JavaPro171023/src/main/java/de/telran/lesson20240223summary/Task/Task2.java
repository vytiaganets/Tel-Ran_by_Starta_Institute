package de.telran.lesson20240223summary.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "()";
        String str2 = "(a)";
        String str3 = "({a)}";
        String str4 = "<a>{}";
        String str5 = "}";
        String str6 = "({[]}{})";
        System.out.println(isBalanced(str1));
        System.out.println(isBalanced(str2));
        System.out.println(isBalanced(str3));
        System.out.println(isBalanced(str4));
        System.out.println(isBalanced(str5));
        System.out.println(isBalanced(str6));
    }
    public static boolean isBalanced(String str) {
        Stack<Character> openStack = new Stack<>();
        Map<Character, Character> bracers = new HashMap<>();
        bracers.put(')', '(');
        bracers.put('}', '{');
        bracers.put('>', '<');
        Set<Character> openbracers = Set.copyOf(bracers.values());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (bracers.containsKey(ch)) {
                openStack.add(ch);
            }
                if (bracers.containsKey(ch)) {
                    if (!openStack.isEmpty()) {
                        char last = openStack.pop();
                        if (last != bracers.get(ch)) {
                            return false;
                        }
                    } else
                        return false;
                    }

                }
                return true;
            }
        }

//    public static boolean isBalanced(String str) {
//        Dictionary<Character> openStack = new Dictionary<>();
//        Map<Character, Character> bracers = new HashMap<>();
//        bracers.put(')', '(');
//        bracers.put('}', '{');
//        bracers.put('>', '<');
//        Set<Character> openBracers = Set.copyOf(bracers.values());
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (openBracers.contains(ch)) {
//                openStack.add(ch);
//            }
//            if (bracers.containsKey(ch)) {
//                if (!openStack.isEmpty()) {
//                    char last = openStack.pop();
//                    if (last != bracers.get(ch)) {
//                        return false;
//                    }
//                } else
//                    return false;
//            }
//        }
//        return true;
//    }