//3. На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек:
//Создать класс CustomStack с методами push(), pop(), peek(). Протестировать работу класса.

package de.telran.lesson20240226practice;

import java.util.LinkedList;

public class CustomStack {
    private LinkedList<String> list = new LinkedList<>();
    public void push(String element){
        list.addFirst(element);
    }
    public String pop(){
        return list.removeFirst();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
