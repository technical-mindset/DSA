
public class Main {

    public static void main(String[] args) {

    LinkedList l = new LinkedList();
    l.insert(1);
    l.insert(2);
    l.insert(5);
    l.displayLinkedList();

    }

}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class LinkedList{
    Node head;

    public void insert (int data){
    Node new_node = new Node(data);
        if (head == null) {
             head = new_node;
        }
        else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new_node;
        }
    }

    public void insertAtStart (int data) {
    Node new_node = new Node(data);
    new_node.next = head;
    head = new_node;
    }
    
    public void insertAt (int index, int data) {
        Node new_node = new Node(data);
        Node node = head;
        if (index > totalIteration()+1){
            System.out.println("Irrelevant Position ");
        }
        else {
            if (index == 1 || index == 0) {
                insertAtStart(data);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    node = node.next;
                }
                new_node.next = node.next;
                node.next = new_node;

            }
        }
    }
    //! This function calculate total index in LinkedList and return n-1 index
    public int totalIteration () {
        Node node = head;
        int i = 0;
        while(node.next != null) {
            i++;
            node = node.next;
        }
        return i;
    }
    
    public void removeAtStart(){
        Node node = this.head;
         this.head = this.head.next;
         node.next = null;
    }
    
    public void removeLast () {
        Node node = head;
        int j;
        int i = totalIteration();
        // iteration = 3 and node = 2nd last node
        for (j = 0; j < i-1 ; j++) {
            node = node.next;
        }
        node.next = null;


    }
    
    public void removeAt (int index) {
        if (index > totalIteration()+1) {
            System.out.println("Irrelevant Position");
        }
        else {
            Node node = head;
            for (int i = 0; i+1 <index-1 ; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        }

    }
    
    public void displayLinkedList(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }


}




