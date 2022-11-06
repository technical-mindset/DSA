package DSA.Algorithms;

public class Queue {
   private int[] data;
   private int size;
   private int head;
   private int rear;

    Queue(int size) {
        this.size =  size;
        this.data = new int [this.size];
        this.head = -1;
        this.rear = -1;
    }

    public void enqueue(int data){
        if(!(this.isFull())){
            this.data[++rear] = data;
                }
        else {
            System.out.println("Queue is full, size of queue is "+this.size);
        }
    }

    public void dequeue(){
        if(!this.isEmpty() && this.head != this.size-1){
           head++;
            System.out.println("Dequeue: "+this.peekFirst());
            this.data[this.head] = -1;
        }
        else if(this.head == this.rear && this.rear != -1){
            this.head = this.rear = -1;
        }
        else {
            System.out.println("Underflow Condition Occur");
        }
    }

    public boolean isFull(){
        if(this.rear == this.size-1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        if(this.rear == -1)
            return true;
        return false;
    }

    public int length(){
        return this.size;
    }

    public int peekFirst(){
        if ((!this.isEmpty()) && this.head != this.size-1){
             return this.data[head];
        }
        return -1;
    }
    public int peekLast(){
        if ((!this.isEmpty()) && this.head != -1)
            return this.data[rear];
        return -1;
    }
}
