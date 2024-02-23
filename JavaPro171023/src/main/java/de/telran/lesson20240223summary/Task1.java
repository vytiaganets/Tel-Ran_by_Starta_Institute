package de.telran.lesson20240223summary;

public class Task1 {
    public static void main(String[] args) {
    ReversedQueueImpl<String> reversedQueue = new ReversedQueueImpl<>();
        reversedQueue.add("One");
        reversedQueue.add("Two");
        reversedQueue.add("Three");
        reversedQueue.add("Four");
        reversedQueue.add("Five");
        System.out.println(reversedQueue);
        System.out.println(reversedQueue.poll());
        System.out.println(reversedQueue.getSize());
//ReversedQueueImpl{deque=[Five, Four, Three, Two, One]}
//Five
//4
        ReversedQueueImpl<Double> reversedQueue1 = new ReversedQueueImpl<>();
        reversedQueue1.add(1.67);
        reversedQueue1.add(5.67);
        reversedQueue1.add(1.01);
        reversedQueue1.add(11.67);
        reversedQueue1.add(-1.67);
        System.out.println(reversedQueue1);
        System.out.println(reversedQueue1.poll());
        System.out.println(reversedQueue1.getSize());
//ReversedQueueImpl{deque=[-1.67, 11.67, 1.01, 5.67, 1.67]}
//-1.67
//4
        ReversedQueueImpl<Number> reversedQueue2 =  new ReversedQueueImpl<>();
        reversedQueue2.add(0x21);
        System.out.println(reversedQueue2);

        IntegeReversedQueue integeReversedQueue = new IntegeReversedQueue();
        integeReversedQueue.add(3123);
        integeReversedQueue.add(-23);
        integeReversedQueue.add(213);
        integeReversedQueue.add(232);
        System.out.println(integeReversedQueue);//IntegeReversedQueue{deque=[232, 213, -23, 3123]}

    }
}
