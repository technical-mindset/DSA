package DSA.Algorithms;

public class CircularQueue {
    private int[] data;
    private int size;
    private int front;
    private int rear;
    private int record;
    private static String QueueEmpty;
    private static String QueueFull;

    CircularQueue(int size){
        this.size = size;
        this.data = new int [this.size];
        this.front = -1;
        this.rear = -1;
        this.record = -1;
        QueueEmpty = "Queue is empty";
        QueueFull = "Queue is full";

    }
    public void enqueue(int data){
        if(!this.isFull()){
            this.record++;
            this.data[++this.rear % this.size()] = data;
        }
        else {
            System.out.println("Error:   &&&&&&&&&&  "+QueueFull+"  &&&&&&&&&&&" +
                    "\n" +
                    "-------------------Overflow Condition Occurs----------------");
        }
    }
    public void dequeue(){
        if(!this.isEmpty()){
            this.record--;
            this.front++;
            System.out.println("Dequeue: "+this.data[this.front % this.size()]);
            this.data[this.front % this.size()] = -1;

        }
        else {
            System.out.println("Error:   %%%%%%%%%%  "+QueueEmpty+"  %%%%%%%%%%" +
                    "\n" +
                    "-------------------Underflow Condition Occurs----------------");
        }
    }
    public void peekLast(){
        if (!isEmpty()) {
            System.out.println("PeekLast(): "+this.data[this.front]);
        }
        else {
            System.out.println(QueueEmpty);
        }
    }
    public void peekFirst(){
        if (!isEmpty()) {
            System.out.println("PeekLast(): "+this.data[(this.front%size())+1]);
        }
        else {
            System.out.println(QueueEmpty);
        }
    }
    public int size(){
        return this.size;
    }
    private boolean isEmpty(){
        if (this.rear == -1 || (this.rear == this.front && this.record == -1))
            return true;
        return false;
    }
    private boolean isFull(){
        if (this.record == this.size() - 1)
            return true;
        return false;
    }
}
