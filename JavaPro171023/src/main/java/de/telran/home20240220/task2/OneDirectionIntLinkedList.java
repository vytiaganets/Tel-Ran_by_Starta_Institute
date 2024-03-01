package de.telran.home20240220.task2;

public class OneDirectionIntLinkedList {
    private int listSize = 0;// текущий размер списка

    private Node firstNode;// структура для хранения первого элемента списка

    public OneDirectionIntLinkedList() {
        this.firstNode = null;
    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
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
        text = "OneDirectionIntLinkedList: { " +
                "listSize: " + listSize +
                ", nodes: [ ";
        Node nodeN = firstNode;
        for (int i = 0; i < listSize; i++) {
            text += nodeN.getItem() + ", ";
            nodeN = nodeN.getNextNode();
        }
        text += "] }";
        return text;
    }

    //          add(int): этот метод используется для добавления элемента в конец !!! списка.
    public void add(int item) {
        Node temp = new Node(item);
        if (firstNode == null) {
            firstNode = temp;
        } else {
            Node nodeForIterating = firstNode;
            while (nodeForIterating.getNextNode() != null) {
                nodeForIterating = nodeForIterating.getNextNode();
            }
            nodeForIterating.setNextNode(temp);
        }
        this.listSize++;
    }

    //          add(index, int): этот метод используется для добавления элемента по определенному индексу !!! в список.
    public void add(int index, int item) {
        Node temp = firstNode;
        if (index > (listSize + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (listSize=" + listSize + ").");

        } else if (index == 0) {
            firstNode = new Node(item);
            firstNode.setNextNode(temp);

        } else {
            Node prev = new Node(0);
            while (index > 0) {
                prev = temp;
                temp = temp.getNextNode();
                index--;
            }
            prev.setNextNode(new Node(item));
            prev.getNextNode().setNextNode(temp);

        }
        listSize++;
    }


    //        addFirst(int значение): добавляет элемент в начало списка.
    public void addFirst(int item) {
        if (firstNode == null) {
            firstNode = new Node(item);

        } else {
            Node temp = firstNode;
            firstNode = new Node(item);
            firstNode.setNextNode(temp);

        }
        listSize++;
    }


    //        addLast(int значение): добавляет элемент в конец списка.
    public void addLast(int item) {
        Node temp = new Node(item);

        if (firstNode == null) {
            firstNode = temp;
        } else {
            Node nodeForIterating = firstNode;
            while (nodeForIterating.getNextNode() != null) {
                nodeForIterating = nodeForIterating.getNextNode();
            }
            nodeForIterating.setNextNode(temp);
        }
        this.listSize++;
    }


    //        int get(int index): получить элемент по index.
    public int get(int index) {
        if (index > (listSize + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (listSize=" + listSize + ").");

        }
        if (index == 0) {
            return firstNode.getItem();
        }
        Node nodeForIterating = firstNode;
        for (int i = 0; i < index; i++) {
            nodeForIterating = nodeForIterating.getNextNode();

        }
        return nodeForIterating.getItem();
    }


    //        int set(int index, int значение): установить значение элемента по index.
    public void set(int index, int item) {
        if (index > (listSize + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (listSize=" + listSize + ").");

        } else if (index == 0) {
            firstNode.setItem(item);

        } else {
            Node nodeForIterating = firstNode;
            for (int i = 0; i < index; i++) {
                nodeForIterating = nodeForIterating.getNextNode();

            }
            nodeForIterating.setItem(item);
        }

    }

    //        int remove(int index): удалить элемент со списка, возвратить значение удаленного элемента
    public int remove(int index) {
        if (index > (listSize + 1)) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (listSize=" + listSize + ").");

        }
        if (index == 0) {
            int temp = firstNode.getItem();
            firstNode = firstNode.getNextNode();
            listSize--;
            return temp;
        }
        Node currentNode = firstNode;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNextNode();
        }
        int temp = currentNode.getNextNode().getItem();
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        listSize--;
        return temp;

    }


    //        removeFirst(): удалить элемент с начала списка.
    public void removeFirst() {
        firstNode = firstNode.getNextNode();
        listSize--;
    }

    //        removeLast(): удалить элемент с конца списка.
    public void removeLast(){
        Node currentNode = firstNode;
        for (int i = 0; i < listSize - 2; i++) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(null);
        listSize--;
    }

    //        int indexOf(int значение): вернуть индекс первого вхождение элемента со значением
    public int indexOf(int item){

        Node currentNode = firstNode;
        int count = -1;
        for (int i = 0; i < listSize - 1; i++) {
            if (currentNode.getItem() == item){
                count = i;
                break;
            }
            currentNode = currentNode.getNextNode();
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
        for (int i = 0; i < listSize - 1; i++) {
            if (currentNode.getItem() == item){
                contains = true;
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        return contains;
    }

    //        void clear(): очистить список
    public void clear() {
        firstNode = null;
        listSize = 0;
    }

    //         void isEmpty(): вернуть true, если список пуст
    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        }
        return false;
    }
}

