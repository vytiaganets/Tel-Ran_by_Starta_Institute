package de.telran.algorithms20240408;

import java.util.HashSet;

import static de.telran.algorithms20240408.MyLinkedList.head;

public class SimpleHome {
    public static void main(String[] args) {
        System.out.println("======================Task 1======================");
        //1) Создать MyLinkedList объект.
        //Создать искусственно петлю в связном списке.
        //Написать метод detectLoop, который проверяет, есть ли петля в MyLinkedList.
        //1) Create a MyLinkedList object.
        //Create an artificial loop in a linked list.
        //Write a detectLoop method that checks if there is a loop in MyLinkedList.
        Node head = null;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.pushToHead(20);
        myLinkedList.pushToHead(4);
        myLinkedList.pushToHead(15);
        myLinkedList.pushToHead(10);
        myLinkedList.pushToHead(10);
        //Создаем цикл для тестирования
        MyLinkedList.head.next.next.next.next.next = MyLinkedList.head;
        detectLoop(head);
        //Цикл найден
        System.out.println("======================Task 2======================");
        //2*) *Переделать односвязный список MyLinkedList в двусвязный
        //2*) *Convert the singly linked list MyLinkedList into a doubly linked list
        //создать объект DoublyLinkedList
        DoublyLinkedList dl_List = new DoublyLinkedList();
        //Добавить узлы в список
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);

        //распечатать узлы DoublyLinkedList
        dl_List.printNodes();
        //Узлы двусвязного списка:
        //10 20 30 40 50
    }
    static void detectLoop(Node h)
    {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Цикл найден");
        else
            System.out.println("Нет цикла");
    }
}

