package DSA.Algorithms;

public class DoublyLinkedList {
  private Node head;

    public void insertAt(int index, int data){
     Node new_node = new Node(data);
        if (index == 1  || index == 0 ) {
            this.push(data);
        }
        else if(index == size()){
            this.append(data);
        }
        else{
            Node node = head;
            for (int i = 1; i < index-1; i++) {
                node = node.next;

            }
           new_node.next = node.next;
            new_node.prev = node;
            node.next = new_node;
            new_node.next.prev = new_node;
        }
    }
    public void append(int data){
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        }
        else {
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            new_node.prev = node;
            node.next = new_node;
        }
    }

    public void push(int data){

        Node new_node = new Node(data);
        if (head == null) {
            this.append(data);
        }
        else {

            Node node = head;
            node.prev = new_node;
            new_node.next = node;
            head = new_node;

        }
    }

    public void removeLast(){
            Node node = head;
            while(node.next != null){

                node = node.next;
            }
            node.prev.next = null;
            node.prev = null;

    }
  
  public void removeFirst(){
        Node node = head;
        Node tempNode = node.next;
        node.next = node.next.next;
        tempNode = null;
        node.next.prev = null;
    }
  
    public int size(){
        Node node = head;
        int i = 0;
        while(node.next != null){
            node = node.next;
            i++;
        }
        i++;
        return i;
    }
    public void traverse(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.getData());
            node = node.next;

        }
        System.out.println(node.getData());

    }
}



class Node{
   private int data;
   Node prev;
   Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public int getData() {
        return data;
    }
}
