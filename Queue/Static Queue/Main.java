package DSA.Algorithms;

public class Main {
    public static void main(String[] args) {
	// write your code here
    
       Queue q = new Queue(4);
        q.dequeue();
        
        q.enqueue(1);
        
        q.enqueue(5);
        
        q.enqueue(7);
        
        q.enqueue(8);
        
        q.enqueue(9);
        
        q.dequeue();
        
        q.dequeue();
        
        q.dequeue();
        
        q.dequeue();
        
        q.dequeue();
    }
}
