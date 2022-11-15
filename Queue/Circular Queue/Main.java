package DSA.Algorithms;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
	// write your code here

CircularQueue pq = new CircularQueue(4);
        pq.dequeue();
        pq.enqueue(5);
        pq.enqueue(7);
        pq.dequeue();
        pq.enqueue(3);
        pq.dequeue();
        pq.dequeue();
        pq.dequeue();
        pq.enqueue(3);
        pq.enqueue(1);
        pq.enqueue(0);
        pq.enqueue(9);
        pq.enqueue(12);
        pq.enqueue(10);
        pq.peekLast();
        pq.peekFirst();
        pq.dequeue();
        pq.dequeue();
        pq.dequeue();
        pq.dequeue();
        pq.dequeue();
        pq.dequeue();

    }
}
