package de.telran.algorithms20240506;

public class Main {

    public static void main(String[] args) {
        MyLinkedList lists = new MyLinkedList();
        System.out.println(" - pushToHead - ");
        lists.pushToHead(5);
        lists.pushToHead(3);
        lists.pushToHead(6);
        lists.print();
        System.out.println(" - pushToTail - ");
        lists.pushToTail(7);
        lists.print();
        System.out.println(" - pushToIndex - ");
        lists.pushToIndex(2, 10);
        lists.print();
        System.out.println(" - removeFirst - ");
        lists.removeFirst();
        lists.print();
        System.out.println(" - removeLast - ");
        lists.removeLast();
        lists.print();
        System.out.println(" - remove - ");
        lists.remove(1);
        lists.print();
        System.out.println("get(1) = "+lists.get(1));
        System.out.println("Size="+lists.size());
        // - pushToHead -
        //6 3 5
        // - pushToTail -
        //6 3 5 7
        // - pushToIndex -
        //6 3 10 5 7
        // - removeFirst -
        //3 10 5 7
        // - removeLast -
        //3 10 5
        // - remove -
        //3 5
        //get(1) = 5
        //Size=2
    }
}