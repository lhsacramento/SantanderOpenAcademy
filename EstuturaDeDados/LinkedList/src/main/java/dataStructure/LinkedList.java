package dataStructure;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(String data){
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public class Node {
        Node next;
        public String data;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public Node getTail(){
        if(this.tail != null) return this.tail;

        System.out.println("A lita está vazia!");
        return null;
    }

    public Node getHead(){
        if(this.head != null) return this.head;

        System.out.println("A lita está vazia!");
        return null;
    }

    public int getLength(){
        if(this.length > 0){
            return this.length;
        }

        System.out.println("A lita está vazia!");
        return 0;
    }

    public void makeEmpty(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void print(){
        Node temp = this.head;
        System.out.println("##############################");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("##############################");
    }

    public void append(String data){
        Node newNode = new Node(data);

        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        this.length++;
    }

    public Node removeLast(){
        if(length == 0)return null;
        else if(length == 1){
            Node excluded = this.tail;
            this.head = null;
            this.tail = null;
            this.length = 0;
            return excluded;
        }else {
            Node excluded = this.tail;
            Node pre = get(this.length - 2);
            pre.next = null;
            this.tail = pre;
            this.length--;
            return excluded;
        }
    }

    public Node get(int index){
        if(index >= 0 && index < this.length){
            Node temp = this.head;

            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            return temp;
        }
        return null;
    }

    public void prepend(String data){
        Node newNode = new Node(data);
        if(this.length == 0){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst(){
        Node excluded = this.head;
        if(this.length == 1){
            this.head = null;
            this.tail = null;
            this.length = 0;
        }else if(this.length > 1){
            this.head = excluded.next;
            excluded.next = null;
            this.length--;
        }
        return excluded;
    }

    public boolean insert(int index, String data){
        if(index >= 0 && index < this.length){
            if(index == 0){
                prepend(data);
            }else if(index == this.length-1){
                append(data);
            }else{
                Node newNode = new Node(data);
                Node pre = get(index-1);

                newNode.next = pre.next;
                pre.next = newNode;
            }
            this.length++;
            return true;
        }else{
            return false;
        }
    }

    public boolean set(int index, String data){
        Node node = get(index);
        if(node != null){
            node.data = data;
            return true;
        }

        return false;
    }

    public Node remove(int index){
        if(index >= 0 && index < this.length){
            if(index == 0){
                return removeFirst();
            }else if(index == this.length-1){
                return removeLast();
            }else{
                Node pre = get(index-1);
                Node exluded = pre.next;

                pre.next = exluded.next;
                exluded.next = null;

                this.length--;
                return exluded;
            }
        }else{
            return null;
        }
    }
}
