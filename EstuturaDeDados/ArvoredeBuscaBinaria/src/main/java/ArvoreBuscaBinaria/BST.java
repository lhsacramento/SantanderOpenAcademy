package ArvoreBuscaBinaria;

public class BST {
    public Node root;

    public static class Node{
        Node left;
        Node right;
        public int value;

        public Node(int value){
            this.value = value;
        }
    }

    public void insert(int value){
        if(this.root == null) this.root = new Node(value);
        else{
               insert(root, value);
        }
    }

    public void insert(final Node root, final int value){
        if(root == null) return;
        if(value == root.value) return;
        if(value > root.value){
            if(root.right == null) root.right = new Node(value);
            else insert(root.right, value);
        }else{
            if(root.left == null) root.left = new Node(value);
            else insert(root.left, value);
        }
    }

    public void inOrder(){
        inOrder(this.root);
    }

    //Imprime E R D (esquerda raíz direita
    public void inOrder(final Node node){
        if(node != null){
            inOrder(node.left);
            System.out.println(node.value);
            inOrder(node.right);
        }
    }

    public Node contains(int value){
        return contains (root, value);
    }

    public Node contains(final Node root, final int value){
        if(root == null) return null;
        if(root.value == value) return root;
        if(value > root.value) return contains(root.right,value);
        else return contains(root.left, value);
    }

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int value){
        root = deleteNode(root,value);
    }

    public Node deleteNode (final Node root, final int value){
        if(root == null) return null;

        if(value < root.value){
            root.left = deleteNode(root.left,value);
        }else if(value > root.value){
            root.right = deleteNode(root.right, value);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                int minValue = minValue(root.right);
                root.value = minValue;
                root.right = deleteNode(root.right,minValue);
            }
        }
        return root;
    }
}
