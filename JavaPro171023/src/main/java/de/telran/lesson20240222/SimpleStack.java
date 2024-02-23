package de.telran.lesson20240222;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(6);
        stack1.push(1);
        stack1.push(3);
        stack1.push(8);
        stack1.push(4);
        stack1.push(3);
        //System.out.println(stack1);//[6, 1, 3, 8, 4, 3]

        //System.out.println(stack1.peek());//LIFO - 3
        //System.out.println(stack1);
        System.out.println(stack1.pop());
        System.out.println(stack1);
        System.out.println(stack1.pop());
        System.out.println(stack1);
        stack1.add(0);
        System.out.println(stack1);
        System.out.println(stack1.peek());
        System.out.println(stack1);
        //3
        //[6, 1, 3, 8, 4]
        //4
        //[6, 1, 3, 8]
        //[6, 1, 3, 8, 0]
        //0
        //[6, 1, 3, 8, 0]
    }

}
