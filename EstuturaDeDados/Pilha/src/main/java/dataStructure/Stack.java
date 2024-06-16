package dataStructure;

public class Stack {

    int height;
    Node top;

    public Stack(String value){
        this.top = new Node(value);
        height = 1;
    }

    public class Node{
        Node next;
        String value;


        public Node(String value){
            this.value = value;
            this.next = null;
        }

        public String getValue(){
            return this.value;
        }
    }

    public Node getTop(){
        if(this.height>0){
            return this.top;
        }else{
            return null;
        }
    }

    public int getHeight(){
        return this.height;
    }

    public void print(){
        System.out.println("###############################");
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("###############################");
    }

    public void push(String value){
        Node newNode = new Node(value);
        if(this.height == 0){
            this.top = newNode;
            this.height=1;
        }else{
            newNode.next = this.top;
            this.top = newNode;
            this.height++;
        }
    }

    public Node pop(){
        if(this.height > 0){
            Node excluded = this.top;
            this.top = this.top.next;
            this.height--;
            return excluded;
        }else{
            return null;
        }
    }
}


