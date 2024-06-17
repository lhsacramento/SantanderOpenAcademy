package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public Node root;

    public static class Node{
        public Node left;
        public Node right;
        public int value;

        public Node (int value){
            this.value = value;
        }

        public boolean isLeaf(){
            return (this.right == null && this.left == null);
        }
    }

    public void insert(int value){
        if(this.root == null){
            this.root = new Node(value);
        }else{
            Node newNode = new Node(value);
            Queue<Node> insertQueue = new LinkedList<>();
            insertQueue.add(this.root);

            while (!insertQueue.isEmpty()){
                Node node = insertQueue.remove();
                if(node.left == null){
                    node.left = newNode;
                    break;
                }else{
                    insertQueue.add(node.left);
                }
                if(node.right == null){
                    node.right = newNode;
                    break;
                }else{
                    insertQueue.add(node.right);
                }
            }
        }
    }

    //Algoritimo de Travessia PRE-ORDER (RED - raíz esquerda direita - ou RLR - root left right -)
    public void preOrder(){
        preOrder(this.root);
    }

    public void preOrder(final Node node){
        if(node != null){
            System.out.println(node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(){
        inOrder(this.root);
    }

    public void inOrder(final Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.value);
            inOrder(node.right);
        }
    }

    public void posOrder(){
        posOrder(this.root);
    }

    public void posOrder(final Node node){
        if(node != null){
            posOrder(node.left);
            posOrder(node.right);
            System.out.println(node.value);
        }
    }

    //BFS Busca em Largura vai de nível a nível
    public void BFS(){
        if(this.root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()){
            Node node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.right != null)queue.add(node.right);
            System.out.println(node.value);
        }
    }

    //DFS Busca em profundidade vai o mais a esquerda possível
    //é o mesmo que o algoritimo pre-order;
}
