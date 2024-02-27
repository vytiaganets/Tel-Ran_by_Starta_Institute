package de.telran.lesson20240226practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Deque<Integer> reverseQueue = new ArrayDeque<>();
        for (Integer i : queue) {
            reverseQueue.addFirst(i);
        }
        return reverseQueue;
    }

    public static Queue<Integer> reversedQueue(Queue<Integer> queue) {
        LinkedList<Integer> reversedQueue = new LinkedList<>();
        if (queue.isEmpty()) {
            Integer element = queue.remove();
            reverseQueue(queue);
            reversedQueue.add(element);
        }
        return reversedQueue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        Queue<Integer> reversedQueue = reverseQueue(queue);
        System.out.println(reversedQueue);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(50);
        linkedList.add(2);
        System.out.println(reversedQueue(linkedList));//error
    }
}



