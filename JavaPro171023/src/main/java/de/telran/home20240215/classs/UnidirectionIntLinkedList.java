package de.telran.home20240215.classs;

public class UnidirectionIntLinkedList {
    private int size = 0;//int size; (текущий размер списка)

    private Node firstNode;//Node (структура для хранения первого элемента списка)

    public UnidirectionIntLinkedList() {
        this.firstNode = null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    @Override
    public String toString() {
        String text;
        text = "UnidirectionIntLinkedList: { " +
                "size: " + size +
                ", nodes: [ ";
        Node nodeN = firstNode;
        for (int i = 0; i < size; i++) {
            text += nodeN.getItem() + ", ";
            nodeN = nodeN.getNext();
        }
        text += "] }";
        return text;
    }

    //          add(int): This method is used to add an element to the end of the list.
    public void add(int item) {
        Node temp = new Node(item);
        if (firstNode == null) {
            firstNode = temp;
        } else {
            Node nodeForIterating = firstNode;
            while (nodeForIterating.getNext() != null) {
                nodeForIterating = nodeForIterating.getNext();
            }
            nodeForIterating.setNext(temp);
        }
        this.size++;
    }

    //          add(index, int): этот метод используется для добавления элемента по определенному индексу !!! в список.
    public void add(int index, int item) {
        Node temp = firstNode;
        if (index > (size + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size=" + size + ").");

        } else if (index == 0) {
            firstNode = new Node(item);
            firstNode.setNext(temp);

        } else {
            Node prev = new Node(0);
            while (index > 0) {
                prev = temp;
                temp = temp.getNext();
                index--;
            }
            prev.setNext(new Node(item));
            prev.getNext().setNext(temp);

        }
        size++;
    }


    //        addFirst(int значение): добавляет элемент в начало списка.
    public void addFirst(int item) {
        if (firstNode == null) {
            firstNode = new Node(item);

        } else {
            Node temp = firstNode;
            firstNode = new Node(item);
            firstNode.setNext(temp);

        }
        size++;
    }


    //        addLast(int значение): добавляет элемент в конец списка.
    public void addLast(int item) {
        Node temp = new Node(item);

        if (firstNode == null) {
            firstNode = temp;
        } else {
            Node nodeForIterating = firstNode;
            while (nodeForIterating.getNext() != null) {
                nodeForIterating = nodeForIterating.getNext();
            }
            nodeForIterating.setNext(temp);
        }
        this.size++;
    }


    //        int get(int index): получить элемент по index.
    public int get(int index) {
        if (index > (size + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size=" + size + ").");

        }
        if (index == 0) {
            return firstNode.getItem();
        }
        Node nodeForIterating = firstNode;
        for (int i = 0; i < index; i++) {
            nodeForIterating = nodeForIterating.getNext();

        }
        return nodeForIterating.getItem();
    }


    //        int set(int index, int значение): установить значение элемента по index.
    public void set(int index, int item) {
        if (index > (size + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size=" + size + ").");

        } else if (index == 0) {
            firstNode.setItem(item);

        } else {
            Node nodeForIterating = firstNode;
            for (int i = 0; i < index; i++) {
                nodeForIterating = nodeForIterating.getNext();

            }
            nodeForIterating.setItem(item);
        }

    }

    //        int remove(int index): удалить элемент со списка, возвратить значение удаленного элемента
    public int remove(int index) {
        if (index > (size + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size=" + size + ").");

        }
        if (index == 0) {
            int temp = firstNode.getItem();
            firstNode = firstNode.getNext();
            size--;
            return temp;
        }
        Node currentNode = firstNode;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }
        int temp = currentNode.getNext().getItem();
        currentNode.setNext(currentNode.getNext().getNext());
        size--;
        return temp;

    }


    //        removeFirst(): удалить элемент с начала списка.
    public void removeFirst() {
        firstNode = firstNode.getNext();
        size--;
    }

    //        removeLast(): удалить элемент с конца списка.
    public void removeLast(){
        Node currentNode = firstNode;
        for (int i = 0; i < size - 2; i++) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(null);
        size--;
    }

    //        int indexOf(int значение): вернуть индекс первого вхождение элемента со значением
    public int indexOf(int item){

        Node currentNode = firstNode;
        int count = -1;
        for (int i = 0; i < size - 1; i++) {
            if (currentNode.getItem() == item){
                count = i;
                break;
            }
            currentNode = currentNode.getNext();
        }
        if (count == -1){
            System.out.println("The element is not present in the list.");
        }
        return count;
    }

    //        bool contains(int значение): вернуть true, если значение есть в списке
    public boolean contains(int item){
        Node currentNode = firstNode;
        boolean contains = false;
        for (int i = 0; i < size - 1; i++) {
            if (currentNode.getItem() == item){
                contains = true;
                break;
            }
            currentNode = currentNode.getNext();
        }
        return contains;
    }

    //        void clear(): очистить список
    public void clear() {
        firstNode = null;
        size = 0;
    }

    //         void isEmpty(): вернуть true, если список пуст
    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        }
        return false;
    }
}
