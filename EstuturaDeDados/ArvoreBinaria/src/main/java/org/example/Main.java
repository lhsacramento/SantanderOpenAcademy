package org.example;

import dataStructure.BinaryTree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //37 11 66 08 17 42 72

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(37);
        binaryTree.insert(11);
        binaryTree.insert(66);
        binaryTree.insert(8);
        binaryTree.insert(17);
        binaryTree.insert(42);
        binaryTree.insert(72);

//        System.out.println(binaryTree.root.value);
//        System.out.println(binaryTree.root.left.value);
//        System.out.println(binaryTree.root.right.value);
//
//        System.out.println(binaryTree.root.isLeaf());
//        System.out.println(binaryTree.root.left.isLeaf());
//        System.out.println(binaryTree.root.right.isLeaf());

//        binaryTree.preOrder();
//        binaryTree.inOrder();
//        binaryTree.posOrder();
        binaryTree.BFS();
    }
}