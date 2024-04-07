package de.telran.algorithms20240325;

public class SimpleHome {
    public static void main(String[] args) {
        System.out.println("=======================Task 1=======================");
        //1) Задача getMin().
        //Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком,
        //такие как push(), pop(), isEmpty(), … и дополнительную операцию getMin(),
        //которая должна возвращать минимальный элемент из SpecialStack.
        //Все эти операции SpecialStack должны быть O(1). Пространство O(n)
        //Чтобы реализовать SpecialStack, используйте структуру данных Stack, реализованную ранее в классе.
        //1) Task getMin().
        //Implement a SpecialStack data structure that supports all stack operations,
        //such as push(), pop(), isEmpty(), ... and an additional operation getMin(),
        //which should return the minimum element from the SpecialStack.
        //All of these SpecialStack operations should be O(1). Space O(n)
        //To implement SpecialStack, use the Stack data structure implemented earlier in the class.
        SpecialStack stack1 = new SpecialStack(8);
        //Поместить элемент в стек
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
        stack1.push(9);

        System.out.print("Stack: ");
        stack1.printStack();

        //Удалить элемент из стека
        stack1.pop();
        System.out.println("После pop: ");
        stack1.printStack();

        //Просмотр элемента в стеке
        System.out.println("Вызов peek: ");
        System.out.println(stack1.peek());
        System.out.println("После peek: ");
        stack1.printStack();
        System.out.println();


        //Получить минимальный элемент в стеке, не удаляя его. Возвращает элемент из стека.
        System.out.println("Минимальный элемент: " + stack1.getMin());

        System.out.println("=======================Task 2=======================");
        //2*) Реализовать структуру данных SpecialQueue, которая поддерживает все операции с очередью,
        //… и дополнительную операцию getMax(),
        //которая должна возвращать максимальный элемент из SpecialQueue.
        //Чтобы реализовать SpecialQueue, используйте структуру данных Queue, реализованную ранее в классе.
        //2*) Implement the SpecialQueue data structure, which supports all queue operations,
        //... and an additional operation getMax(),
        //which should return the maximum element from SpecialQueue.
        //To implement SpecialQueue, use the Queue data structure implemented earlier in the class.
        SpecialQueue queue2 = new SpecialQueue(8);

        //Переместить элемент в конец очереди.
        queue2.pushToEnd(1);
        queue2.pushToEnd(2);
        queue2.pushToEnd(3);
        queue2.pushToEnd(4);
        queue2.pushToEnd(5);
        queue2.pushToEnd(6);
        queue2.pushToEnd(7);

        System.out.print("Queue: ");
        queue2.printQueue();

        //Удалить элемент из головы очереди.
        queue2.removeFromHead();
        System.out.println("После pop: ");
        queue2.printQueue();

        //Просмотрите элемент в очереди.
        System.out.println("Вызов peek: ");
        System.out.println(queue2.peekFromHead());
        System.out.println("После peek: ");
        queue2.printQueue();

        //Получить максимальный элемент в очереди, не удаляя его. Возвращает элемент из очереди.
        System.out.println("Максимальный элемент: " + queue2.getMax());

        System.out.println("=======================Task 3=======================");
        //3*) Создайте Stack данных, который не будет иметь ограничения по работе с памятью и нам будет
        //трудно увидеть сообщение "Stack OverFlow". Вспомните прошедшие уроки по Динамическому массиву.
        //3*) Create a Data Stack that will not have any restrictions on working with memory and we will
        //it's hard to see the "Stack OverFlow" message. Remember the previous lessons on Dynamic Array.
        UnlimitedStack stack3 = new UnlimitedStack(1);

        //Поместить элемент в стек
        stack3.push(1);
        stack3.push(2);
        stack3.push(3);
        stack3.push(4);
        stack3.push(5);
        stack3.push(6);
        stack3.push(7);
        stack3.push(8);
        stack3.push(9);
        System.out.print("Stack: ");
        stack3.printStack();

        //=======================Task 1=======================
        //Вставка: 1
        //Вставка: 2
        //Вставка: 3
        //Вставка: 4
        //Вставка: 5
        //Вставка: 6
        //Вставка: 7
        //Вставка: 8
        //Переполнение стека
        //Stack: 1 2 3 4 5 6 7 8 После pop:
        //1 2 3 4 5 6 7 Вызов peek:
        //7
        //После peek:
        //1 2 3 4 5 6 7
        //Минимальный элемент: 1
        //=======================Task 2=======================
        //Успех: 1 добавлен в очередь
        //Успех: 2 добавлен в очередь
        //Успех: 3 добавлен в очередь
        //Успех: 4 добавлен в очередь
        //Успех: 5 добавлен в очередь
        //Успех: 6 добавлен в очередь
        //Успех: 7 добавлен в очередь
        //Queue: 1,2,3,4,5,6,7,0,
        //После pop:
        //2,3,4,5,6,7,0,0,
        //Вызов peek:
        //2
        //После peek:
        //2,3,4,5,6,7,0,0,
        //Максимальный элемент: 7
        //=======================Task 3=======================
        //Вставка: 1
        //Вставка: 2
        //Вставка: 3
        //Вставка: 4
        //Вставка: 5
        //Вставка: 6
        //Вставка: 7
        //Вставка: 8
        //Вставка: 9
        //Stack: 1 2 3 4 5 6 7 8 9
    }
}