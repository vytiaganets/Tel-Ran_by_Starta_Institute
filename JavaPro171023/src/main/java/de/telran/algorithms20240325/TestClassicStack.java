package de.telran.algorithms20240325;

public class TestClassicStack {
    public static void main(String[] args) {
        ClassicStack stack = new ClassicStack(8);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.print("Stack: ");
        stack.printStack();
        System.out.print(" <-- top");
        System.out.println();

        // remove element from stack
        stack.pop();
        System.out.println("After pop out");
        stack.printStack();

        System.out.println();
        System.out.println("Call peek()");
        System.out.println(stack.peek());
        System.out.println("After peek out");
        stack.printStack();

        //Inserting 1
        //Inserting 2
        //Inserting 3
        //Inserting 4
        //Stack: 1 2 3 4  <-- top
        //After pop out
        //1 2 3
        //Call peek()
        //3
        //After peek out
        //1 2 3
    }
}