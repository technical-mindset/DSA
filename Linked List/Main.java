
public class Main {

    public static void main(String[] args) {

    LinkedList l = new LinkedList();
    l.insert(1);
    l.insert(2);
    l.insert(5);
    l.displayLinkedList();

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
    public void displayLinkedList(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
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



