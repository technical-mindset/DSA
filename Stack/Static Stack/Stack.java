package DSA.Algorithms;

public class Stack {
    int [] arr;
    int size;
    int top;
    Stack(int size){
        this.size = size;
        arr = new int[this.size];
        top = -1;
    }
    public void push(int data){
        if (!isFull()) {
            this.arr[++this.top] = data;
        }
        else {
            System.out.println("Error! the stack is full");
        }
    }
    public void pop(){
        if (!isEmpty()) {
            System.out.println(this.arr[top]);
            this.arr[top] =(-1);
            top--;
        }
        else{
            System.out.println("Error! the stack is Empty");
        }
    }
    public void peek(){
        if (!isEmpty())
            System.out.println(this.arr[top]);


    }
    public boolean isEmpty(){
        if (this.top == -1)
            return true;
        return false;
    }
    public boolean isFull(){
        if (this.top+1 == this.size )
            return true;
        return false;
    }
    public void traverse(){
        for (int i = this.top; i > -1; i--) {
            if(top == -1)
                System.out.println("Value at "+i+" is:" + null);

            System.out.println("Value at "+i+" is:" + this.arr[i]);
        }
    }
}
