package de.telran.lesson20240226practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SimpleQueue {
// Java-программа для реверсирования очереди


// Java-программа для рекурсивного обращения очереди

    static Queue<Integer> queue;

    // Служебная функция для печати очереди
    static void Print() {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }

     //Рекурсивная функция для обращения очереди
    static Queue<Integer> reverseQueue(Queue<Integer> q) {
        // Базовый вариант
        if (q.isEmpty())
            return q;

        // Удаление текущего элемента из очереди (спереди)
        int data = q.peek();
        q.remove();

        // Обратный ход оставшейся очереди
        q = reverseQueue(q);

        // Ставим текущий элемент в очередь (сзади)
        q.add(data);

        return q;
   }
    // Код драйвера
    public static void main(String args[]) {
        queue = new LinkedList<Integer>();
        queue.add(56);
        queue.add(27);
        queue.add(30);
        queue.add(45);
        queue.add(85);
        queue.add(92);
        queue.add(58);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        queue = reverseQueue(queue);
        Print();
        //100 90 80 58 92 85 45 30 27 56



    }


    }
