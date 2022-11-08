package DSA.Algorithms;

public class PriorityQueue {
    private int [] data;
    private int front;
    private int rear;
    private int size;
    PriorityQueue(int size){
        this.size = size;
        this.data = new int[this.size];
        this.front = -1;
        this.rear = -1;
    }
    public void add(int data){
        if (!isFull()){
            this.data[++this.rear] = data;
            if (this.rear >= 0 ){
                this.swap(this.data);
            }
        }
        else {
            System.out.println("Overflow");
        }
    }
    public void poll(){
        if (!isEmpty() && this.front != this.size-1) {
            this.front++;
            System.out.println(this.data[this.front]);
        }
       else if(this.isFull() && this.front == this.rear){
            this.rear = -1;
            this.front = -1;
        }
        else {
            System.out.println("Under Flow");
        }
    }

    public void peek(){
        if (!isEmpty() && this.front != -1)
            System.out.println(this.data[this.front]);
        else
            System.out.println(this.data[this.front+1]);
    }
    private boolean isEmpty(){
        if (this.rear == -1)
            return true;
        return false;
    }
    private boolean isFull(){
        if (this.rear == this.size-1)
            return true;
        return false;
    }
    private void swap(int[] data){
        int temp;
        for (int i = 0; i <= this.rear ; i++) {
            for (int j = 0; j < i ; j++) {
                if (data[i] > data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
