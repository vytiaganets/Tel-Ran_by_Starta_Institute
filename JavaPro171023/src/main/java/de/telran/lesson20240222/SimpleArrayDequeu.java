package de.telran.lesson20240222;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimpleArrayDequeu {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        //as Stack
        deque.push("Vasia");
        deque.push("Petia");
        deque.push("Valia");
        deque.push("Misha");
        deque.push("Alena");
//        System.out.println(deque);//[Alena, Misha, Valia, Petia, Vasia]
//        System.out.println(deque.peek());//Alena - LIFO подсмотрим
//        System.out.println(deque.pop());//Alena извлекаем
//        System.out.println(deque);//[Misha, Valia, Petia, Vasia]

        deque.clear();//clear
        //как Queue FIFO
        deque.offer("Vasia");
        deque.offer("Petia");
        deque.offer("Valia");
        deque.offer("Misha");
        deque.offer("Alena");
        System.out.println(deque);//[Vasia, Petia, Valia, Misha, Alena]
        System.out.println(deque.peek());//Vasia - подсмотрим
        System.out.println(deque.poll());//извлекаем
        System.out.println(deque);

        deque.clear();
        //как Stack LIFO
        deque.addFirst("Vasia");
        deque.addFirst("Petia");
        deque.addFirst("Valia");
        deque.addFirst("Misha");
        deque.addFirst("Alena");
        System.out.println(deque);//[Alena, Misha, Valia, Petia, Vasia]

        System.out.println(deque.removeFirst());
        System.out.println(deque);//[Alena, Misha, Valia, Petia, Vasia]

        deque.clear();
        //как Stack FIFO
        deque.addLast("Vasia");
        deque.addLast("Petia");
        deque.addLast("Valia");
        deque.addLast("Misha");
        deque.addLast("Alena");
        System.out.println(deque);//[Vasia, Petia, Valia, Misha, Alena]

    }
}
