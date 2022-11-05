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
        q.enqueue(1);
        q.enqueue(7);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        int length  = q.length();
        System.out.println(length);
           }
   }
