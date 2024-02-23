package de.telran.lesson20240222;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SimplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Vasia");
        priorityQueue.add("Petia");
        priorityQueue.add("Valia");
        priorityQueue.add("Misha");
        priorityQueue.add("Alena");
        System.out.println(priorityQueue);//[Petia, Valia, Misha, Alena]
        System.out.println(priorityQueue.peek());//[Alena, Misha, Valia, Petia, Vasia]

        System.out.println(priorityQueue.element());//Alena
        System.out.println(priorityQueue.remove());//[Misha, Valia, Petia, Vasia]
        System.out.println(priorityQueue);//[Vasia, Petia, Valia, Misha, Alena]

        priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer("Vasia");
        priorityQueue.offer("Petia");
        priorityQueue.offer("Valia");
        priorityQueue.offer("Misha");
        priorityQueue.offer("Alena");
        System.out.println(priorityQueue);

//        while (!priorityQueue.isEmpty()){
//            System.out.print(priorityQueue.poll() + ", ");//Vasia, Valia, Petia, Misha, Alena,
//        }
        System.out.println("замена приоритета"); //замена приоритета
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>(Comparator.naturalOrder());
        priorityQueue2.addAll(priorityQueue);
        System.out.println(priorityQueue2);//[Alena, Misha, Valia, Vasia, Petia]
        Iterator<String> iterator = priorityQueue2.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ ", ");//Alena, Misha, Valia, Vasia, Petia,
        }
//        System.out.println();
//        while (!priorityQueue2.isEmpty()){
//            System.out.print(priorityQueue2.poll() + ", ");//Alena, Misha, Petia, Valia, Vasia,
//        }
        System.out.println();

        while (!priorityQueue2.isEmpty()){
            String tmp = priorityQueue2.poll();
            System.out.print(tmp + ", ");
            if(tmp.equals("Misha")){
                System.out.println();
                System.out.println("Next element: " + priorityQueue2.peek());
            }
        }
    }
}
