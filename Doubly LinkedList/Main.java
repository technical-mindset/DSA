package DSA.Algorithms;

public class Main {
    public static void main(String[] args) {
	// write your code here

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(2);
        dll.push(9);
        dll.push(5);
        dll.push(1);
        dll.push(7);
        dll.push(4);
        dll.insertAt(2,8);
        dll.insertAt(3,0);
        dll.push(12);
       dll.removeLast();
        dll.traverse();


    }
}
