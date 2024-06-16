package dataStructure;

public class Queue {
    private Node first;
    private Node last;
    private int length;


    public static class Node{
        Node next;
        String value;

        public Node (String value){
            this.value = value;
            this.next = null;
        }

        public String getValue(){
            return this.value;
        }
    }

    public Queue(String value){
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    public int getLength() {
        return this.length;
    }

    public void getFirst(){
        if(this.length > 0)
        System.out.println(this.first.getValue());
        else System.out.println("A lista está vazia!");
    }
    public void getLast(){
        if(this.length > 0)
            System.out.println(this.last.getValue());
        else System.out.println("A lista está vazia!");
    }

    public void print(){
        if(this.length > 0){
            Node temp = this.first;
            while (temp != null){
                System.out.println(temp.getValue());
                temp = temp.next;
            }
        }
    }

    public void enqueue(String value){
        Node newNode = new Node(value);
        if(this.length == 0){
            this.last = newNode;
            this.first = newNode;
            this.length = 1;
        }else{
            this.last.next = newNode;
            this.last = newNode;
            length++;
        }
    }

    public String dequeue(){
        if(this.length > 0){
            Node excluded = this.first;
            this.first = this.first.next;
            excluded.next = null;
            this.length--;
            return excluded.getValue();
        }else{
            return null;
        }
    }
}
