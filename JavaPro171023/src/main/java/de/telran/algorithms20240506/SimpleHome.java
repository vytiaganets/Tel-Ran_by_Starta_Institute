//1. Представлено дерево BST. [13, 5, 15, 6, 3]
//       13
//    5       15
// 6     3
// Каким то образом оно сломалось?!
// Написать метод, который будут определять корректно ли дерево
// и метод, который позволит поменять местами ноды, размещенные некорректно,
// чтобы дерево стало правильным и соответствовало требованиям BST.
//
//
//Разобрать код примера балансировки AVL дерева и отметить непонятные строки
//1. BST tree presented. [13, 5, 15, 6, 3]
//       13
//    5       15
// 6     3
// Somehow it broke?!
// Write a method that will determine if the tree is correct
// and a method that will allow you to swap nodes placed incorrectly,
// to make the tree correct and BST compliant.
//
//
//Parse the example code for balancing an AVL tree and mark unclear lines

package de.telran.algorithms20240506;
// Java-программа для проверки соответствия данного дерева BST.
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* Узел двоичного дерева содержит данные, указатель на
левый дочерний элемент и указатель на правый дочерний элемент */
class MyNode {
    public int data;
    public MyNode left, right;

    public MyNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class SimpleHome {
    static int maxValue(MyNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int value = node.data;
        int leftMax = maxValue(node.left);
        int rightMax = maxValue(node.right);

        return Math.max(value, Math.max(leftMax, rightMax));
    }

    static int minValue(MyNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        int value = node.data;
        int leftMax = minValue(node.left);
        int rightMax = minValue(node.right);

        return Math.min(value, Math.min(leftMax, rightMax));
    }

    /* Возвращает true, если двоичное дерево является двоичным деревом поиска.
     */
    static boolean isBST(MyNode node) {
        if (node == null) {
            return true;
        }

        /* false, если максимум слева больше, чем у нас */
        if (node.left != null && maxValue(node.left) > node.data) {
            return false;
        }

        /* false, если минимум справа <= чем us */
        if (node.right != null && minValue(node.right) < node.data) {
            return false;
        }

        /* false, если рекурсивно левое или правое не является BST*/
        if (isBST(node.left) == false || isBST(node.right) == false) {
            return false;
        }

        /* если не считать всего этого, это c */
        return true;
    }

    public static void storeInVector(MyNode root, ArrayList<Integer> vec)
    {
        if (root == null)
            return;
        storeInVector(root.left, vec);
        vec.add(root.data);
        storeInVector(root.right, vec);
    }
    public static void correctBSTUtil(MyNode root, ArrayList<Integer> vec, int[] index)
    {
        if (root == null)
            return;
        correctBSTUtil(root.left, vec, index);
        root.data = vec.get(index[0]);
        index[0]++;
        correctBSTUtil(root.right, vec, index);
    }

    public static void correctBST(MyNode root)
    {
        // ArrayList для хранения порядка обхода данного дерева
        ArrayList<Integer> vec = new ArrayList<Integer>();
        storeInVector(root, vec);
        Collections.sort(vec);
        int[] index = { 0 };
        correctBSTUtil(root, vec, index);
    }

    public static void printInorder(MyNode root)
    {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        MyNode root = new MyNode(13);
        root.left = new MyNode(5);
        root.right = new MyNode(15);
        root.left.left = new MyNode(6);
        root.left.right = new MyNode(3);

        // Function call
        if (isBST(root)) {
            System.out.print("BST");
        } else {
            System.out.print("Не BST");
        }
        //Не BST

        // Неупорядоченный обход исходного дерева
        System.out.println("\nНепорядковый обход исходного дерева");
        printInorder(root);

        correctBST(root);

        // неупорядоченный обход фиксированного дерева
        System.out.println("\nНепорядковый обход фиксированного дерева");
        printInorder(root);
        //Не BST
        //Непорядковый обход исходного дерева
        //6 5 3 13 15
        //Непорядковый обход фиксированного дерева
        //3 5 6 13 15
    }
}

