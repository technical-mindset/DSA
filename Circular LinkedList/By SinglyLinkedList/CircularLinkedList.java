package DSA.Algorithms;

public class CircularLinkedList {
    Node head;
    private int size;

    CircularLinkedList() {
        this.head = null;
        this.size = 0;
    }
    // next node of head point to head when the list is empty
    public void insert(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
            this.head.next = this.head;
        }
        // if head 'next' is not pointing at head node then new node added to the list
        else {
            Node node = this.head;
            while (node.next != this.head) {
                node = node.next;
            }
            //'next' of new node now pointing at 'next' of current node(which is last node of list pointing at head)
            new_node.next = node.next;
            node.next = new_node;
        }
    }
    public void insertAtStart(int data){
        Node node ,n1;
        if(this.head == null || this.head.next == this.head){
            this.insert(data);
        }
        else if(this.head.next != this.head){
            node = n1 = this.head;
            while(n1.next != this.head){
                n1 = n1.next;
            }
            Node new_node = new Node(data);
            this.head = new_node;
            new_node.next = node;
            n1.next = new_node;
        }
    }


    public void insertAt(int pos, int data) {
        if(this.head != null && (pos == 0 || pos == 1)){
            this.insertAtStart(data);
        }
        else if(pos > this.size()+1){
            System.out.println("Operation failed: \"Size of list is:"+this.size+" Please enter correct position");
        }
        else {
            Node node = this.head;
            int i = 0;
            //loop stops at pos-1 just before to the targeted position
            while(i < pos-2){
                node = node.next;
                i++;
            }
            Node new_node = new Node(data);
            new_node.next = node.next;
            node.next = new_node;
        }
    }
    //Node in the head must deleted then next node becomes head
    public void removeAtStart() {
        Node node = this.head;
        if(this.head != null){
        while(node.next != this.head){
            node = node.next;
        }
        //it stores the next of first node in the head as a first node
        this.head = this.head.next;
        node.next = this.head;
    }
    }

    public void removeAt(int pos) {
        // if the position does not exist in the list then it will return irrelevant position
        Node node = this.head;
        if (pos > this.size() + 1 || this.head == null) {
            System.out.println("Irrelevant Position or Empty List");
        }
        else {
            if (pos == 1 || pos == 0) {
                removeAtStart();
            }
            // it starts from 1st index to pos-1 because targeted node will be the 'next' node of current node
             else {
                for (int i = 1; i < pos - 1; i++) {
                    node = node.next;
                }
                node.next = node.next.next;
            }
        }
    }

    public void remove() {
        Node node = this.head;
        if(this.head == this.head.next && this.head != null){
            this.head = null;
            System.out.println("Now list is empty");
        }
        else if(this.head == null){
            System.out.println("List is already empty");
        }
        else {
            //attached the new last node to the head
            while (node.next.next != this.head) {
                node = node.next;
            }
            node.next = this.head;
        }
    }

    public int size() {
        Node node = this.head;
        if (this.head != null) {
            while (node.next != this.head) {
                node = node.next;
                this.size++;
            }
        }
            return this.size;
        }

    public void traverse() {
        Node node = this.head;
        if(this.head == null) System.out.println("Empty List");
        else if(this.head.next == this.head) System.out.println(this.head.getData());
        else{
            while(node.next != this.head){
                System.out.println(node.getData());
                node = node.next;
            }
            System.out.println(node.getData());
        }
    }

}
final class Node{
    private int data;
    public Node next;
    Node(int data){
        this.data = data;
    }
    public int getData() {
        return data;
    }
}
