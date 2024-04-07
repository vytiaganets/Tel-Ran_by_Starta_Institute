package de.telran.algorithms20240325;

public class SpecialStack {
    private final int[] arr;
    private int top;
    private final int capacity;

    public SpecialStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //Переместить элементы на вершину стека.
    public void push(int x) {
        if (isFull()) {
            System.out.println("Переполнение стека");
        } else {
            // insert element on top of stack
            System.out.println("Вставка: " + x);
            arr[++top] = x;
        }
    }

    //Извлечение элементов из вершины стека.
    public int pop() {
        //если стек пуст, элемент не может быть извлечен
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        //извлечь элемент из вершины стека
        return arr[top--];
    }

    public int getMin() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i <= top; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //Возвращает размер стека.
    public int getSize() {
        return top + 1;
    }

    //Проверьте, пуст ли стек.
    public boolean isEmpty() {
        return top == -1;
    }

    //Проверьте, заполнен ли стек.
    public boolean isFull() {
        return top == capacity - 1;
    }

    //Чтобы увидеть первый элемент, появившийся в стеке. Стек остается неизменным.
    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top];
        }
    }

    //Отображение элементов стека.
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
