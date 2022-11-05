package DSA.Algorithms;

public class Queue {
    int [] data;
    int size;
    int pos;

    Queue(int size) {
        this.size =  size;
        this.data = new int[this.size];
        this.pos = -1; // when queue is empty after enqueue its value becomes pos+1
    }
    public void enqueue(int data){
        if(!(this.isFull())){
            this.data[++pos] =  data;
        }
        else {
            System.out.println("Queue is Full");
        }
    }
    public void dequeue(){
        if(!isEmpty()){
            // value at index 0 will be dequeue
            System.out.println("Dequeue:"+this.data[0]);
            pos--;
            //Moving forward the values all values on n indexes to n-1 index
            for (int i = 0; i < this.data.length-1; i++) {
                    this.data[i] = this.data[i + 1];
            }
            // setting the last index value -1 when the first function dequeue
            //will run after all the time -1 set to all empty spaces
            this.data[this.data.length-1] = -1;
        }
        else {
            System.out.println("Queue is Empty");
        }
    }
    public boolean isFull(){
        if(this.pos >= this.data.length-1)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if(this.pos == -1)
            return true;
        return false;
    }
    public int length(){
      return size;
    }
}
