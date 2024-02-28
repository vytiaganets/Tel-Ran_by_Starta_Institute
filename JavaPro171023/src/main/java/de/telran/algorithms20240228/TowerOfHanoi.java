//Домашнее задание 3.
//
//1. Ханойская башня
//Задача заключается в следующем:
//Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков, диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший. Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
//
//Головоломка имеет следующие два правила:
//● Вы не можете поместить больший диск на меньший диск.
//● За один раз можно перемещать только один диск.
//Реализуйте два подхода для решения.
//○ Рекурсивно
//○ Итеративно

package de.telran.algorithms20240228;

import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        // ==========Рекурсивно==========
        System.out.println("==========Рекурсивно==========");
        int num = 3;
        towerOfHanoi(num, '1', '2', '3');

        // ==========Итеративно==========
        System.out.println("==========Итеративно==========");
        // Ввод: количество дисков.
        int num_of_disks = 3;

        TowerOfHanoi ob = new TowerOfHanoi();
        Stack src, dest, aux;

        // Создаем три стопки размером «num_of_disks» для хранения дисков.
        src = ob.createStack(num_of_disks);
        dest = ob.createStack(num_of_disks);
        aux = ob.createStack(num_of_disks);

        ob.tohIterative(num_of_disks, src, aux, dest);
        //==========Рекурсивно==========
        //Take disc from tower 1 to tower 2
        //Take disc from tower 1 to tower 3
        //Take disc from tower 2 to tower 3
        //Take disc from tower 1 to tower 2
        //Take disc from tower 3 to tower 1
        //Take disc from tower 3 to tower 2
        //Take disc from tower 1 to tower 2
        //==========Итеративно==========
        //Take disc 1 from tower 1 to tower 2
        //Take disc 2 from tower 1 to tower 3
        //Take disc 1 from tower 2 to tower 3
        //Take disc 3 from tower 1 to tower 2
        //Take disc 1 from tower 3 to tower 1
        //Take disc 2 from tower 3 to tower 2
        //Take disc 1 from tower 1 to tower 2
    }

    // Рекурсивно
    public static void towerOfHanoi(int num, char from, char to, char help) {
        if (num == 1) {
            System.out.println("Take disc from tower " + from + " to tower " + to);
            return;
        }
        towerOfHanoi(num - 1, from, help, to);
        System.out.println("Take disc from tower " + from + " to tower " + to);
        towerOfHanoi(num - 1, help, to, from);
    }

    // Итеративно
    // Структура, представляющая стек
    class Stack {
        int capacity;
        int top;
        int array[];
    }

    // Функция для создания стека заданной емкости.
    Stack createStack(int capacity) {
        Stack stack = new Stack();
        stack.capacity = capacity;
        stack.top = -1;
        stack.array = new int[capacity];
        return stack;
    }

    // Стек полон, когда вершина равна последнему индексу
    boolean isFull(Stack stack) {
        return (stack.top == stack.capacity - 1);
    }

    // Стек пуст, когда вершина равна -1
    boolean isEmpty(Stack stack) {
        return (stack.top == -1);
    }

    // Функция для добавления элемента в стек. Увеличивает вершину на 1.
    void push(Stack stack, int item) {
        if (isFull(stack))
            return;

        stack.array[++stack.top] = item;
    }

    // Функция удаления элемента из стека. Уменьшает вершину на 1.
    int pop(Stack stack) {
        if (isEmpty(stack))
            return Integer.MIN_VALUE;

        return stack.array[stack.top--];
    }

    // Функция осуществления легального перемещения между двумя полюсами
    void moveDisksBetweenTwoPoles(Stack src, Stack dest, char s, char d) {
        int pole1TopDisk = pop(src);
        int pole2TopDisk = pop(dest);

        // Когда опоры 1 пуст
        if (pole1TopDisk == Integer.MIN_VALUE) {
            push(src, pole2TopDisk);
            moveDisk(d, s, pole2TopDisk);
        }

        // Когда опоры 2 пуст
        else if (pole2TopDisk == Integer.MIN_VALUE) {
            push(dest, pole1TopDisk);
            moveDisk(s, d, pole1TopDisk);
        }

        // Когда верхний диск опоры 1 > верхнего диска опоры 2
        else if (pole1TopDisk > pole2TopDisk) {
            push(src, pole1TopDisk);
            push(src, pole2TopDisk);
            moveDisk(d, s, pole2TopDisk);
        }
        // Когда верхний диск полюса 1 < верхний диск полюса 2
        else {
            push(dest, pole2TopDisk);
            push(dest, pole1TopDisk);
            moveDisk(s, d, pole1TopDisk);
        }
    }

    // Функция отображения движения дисков
    void moveDisk(char fromPeg, char toPeg, int disk) {
        System.out.println("Take disc " + disk +
                " from tower " + fromPeg +
                " to tower " + toPeg);
    }

    // Функция для реализации головоломки "Ханойская башня"
    void tohIterative(int num_of_disks, Stack
            src, Stack aux, Stack dest) {
        int i, total_num_of_moves;
        char s = '1', d = '2', a = '3';

        // Если количество дисков четное, поменяйте местами дис назначения и вспомогательный диск.
        if (num_of_disks % 2 == 0) {
            char temp = d;
            d = a;
            a = temp;
        }
        total_num_of_moves = (int) (Math.pow(
                2, num_of_disks) - 1);

        // Диски большего размера будут загружены первыми.
        for (i = num_of_disks; i >= 1; i--)
            push(src, i);

        for (i = 1; i <= total_num_of_moves; i++) {
            if (i % 3 == 1)
                moveDisksBetweenTwoPoles(src, dest, s, d);

            else if (i % 3 == 2)
                moveDisksBetweenTwoPoles(src, aux, s, a);

            else if (i % 3 == 0)
                moveDisksBetweenTwoPoles(aux, dest, a, d);
        }
    }
}
