package DSA.Algorithms;

import java.util.LinkedList;

public class Queue {
   private  LinkedList list;
   private int size;
   private int pos;

    Queue(int size) {
        this.size =  size;
        this.list = new LinkedList();
        this.pos = -1; // when queue is empty after enqueue its value becomes pos+1
    }

    public void enqueue(int data){
        if(this.peek() != -1){
            System.out.println("Dequeue: "+this.peek());
            pos--;
         this.list.removeFirst();
        }
        else {
            System.out.println("Underflow Condition Occur");
        }
    }

    public void dequeue(){
        if(!this.isEmpty()){
            System.out.println("Dequeue: "+this.list.peekFirst());
         this.list.removeFirst();
        }
        else {
            System.out.println("Queue is Empty");
        }
    }

    public boolean isFull(){
        if(this.pos >= this.size-1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if(this.pos == -1)
            return true;
        return false;
    }

    public int length(){
        return this.size;
    }
   
   public int peek(){
        if (!(this.isEmpty()))
            return (int) this.list.peekFirst();
        return -1;
    }
}
