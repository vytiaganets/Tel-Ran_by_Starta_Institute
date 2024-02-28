package de.telran.home20240215.classs;

public class Node {
    private int item;//int item; (для хранения данных)
    private Node next;//Node next; (для хранения ссылки на следующий объект хранения)

    public Node(int item) {

        this.item = item;
        this.next = null;
    }
    public Node() {
    }
    public int getItem() {
        return item;
    }
    public void setItem(int item) {
        this.item = item;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + item;
    }

}
