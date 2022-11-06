package DSA.Algorithms;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Queue q = new Queue(4);
        q.enqueue(4);
        q.enqueue(2);
        System.out.println(q.peekLast());
        q.enqueue(1);
        q.enqueue(7);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.peekFirst());

        int length  = q.length();
        System.out.println(length);












//    Stack stack = new Stack(4);
//    stack.push(1);
//        stack.push(5);
//        stack.push(7);
//        stack.push(4);
//        stack.pop();

//        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.push(2);
//        dll.push(9);
//        dll.push(5);
//        dll.push(1);
//        dll.push(7);
//        dll.push(4);
//        dll.insertAt(2,8);
//        dll.insertAt(3,0);
//        dll.push(12);
//       dll.removeLast();
//        dll.traverse();


    }
}