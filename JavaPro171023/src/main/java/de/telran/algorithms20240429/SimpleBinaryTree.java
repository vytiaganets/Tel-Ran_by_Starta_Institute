package de.telran.algorithms20240429;

public class SimpleBinaryTree {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        // bt.insert(3, "node 3");
        // bt.insert(1, "node 1");
        // bt.insert(2, "node 2");
        // bt.insert(4, "node 4");

        // // bt.print(bt.getRoot());
        // bt.print();

        bt.insertRecursive(bt.getRoot(), new Node(3, "node 3", null, null));
        bt.insertRecursive(bt.getRoot(), new Node(1, "node 1", null, null));
        bt.insertRecursive(bt.getRoot(), new Node(2, "node 2", null, null));
        bt.insertRecursive(bt.getRoot(), new Node(4, "node 4", null, null));
        bt.print();
        //Node [key=3, value=node 3, left=Node
        //        [key=1, value=node 1, left=null, right=Node
        //        [key=2, value=node 2, left=null, right=null]],
        //right=Node [key=4, value=node 4, left=null, right=null]]

    }

}