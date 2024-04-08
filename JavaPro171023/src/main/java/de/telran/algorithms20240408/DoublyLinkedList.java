package de.telran.algorithms20240408;

public class DoublyLinkedList<E> {

    //Первоначально заголовок и хвост имеют значение null.
    Node2 head, tail = null;

    //добавить узел в список
    public void addNode(int item) {
        //Создать новый узел
        Node2 newNode = new Node2(item);

        //если список пуст, заголовок и хвост указывают на newNode
        if (head == null) {
            head = tail = newNode;
            //предыдущая глава будет нулевой
            head.previous = null;
            //следующий хвост будет нулевым
            tail.next = null;
        } else {
            //добавить newNode в конец списка. хвост->следующий установлен на newNode
            tail.next = newNode;
            //newNode->предыдущий установлен в хвост
            newNode.previous = tail;
            //newNode становится новым хвостом
            tail = newNode;
            //следующая точка хвоста равна нулю
            tail.next = null;
        }
    }

    //распечатать все узлы двусвязного списка
    public void printNodes() {
        //Текущий узел будет указывать на голову
        Node2 current = head;
        if (head == null) {
            System.out.println("Двусвязный список пуст");
            return;
        }
        System.out.println("Узлы двусвязного списка: ");
        while (current != null) {
            //Распечатайте каждый узел и затем перейдите к следующему.
            System.out.print(current.item + " ");
            current = current.next;
        }
    }
}
