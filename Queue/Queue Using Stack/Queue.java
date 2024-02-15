import java.util.Stack;

public class QueueWithStack {
    private Stack stack1;
    private Stack stack2;

   public QueueWithStack(){
       this.stack1 = new Stack ();
       this.stack2 = new Stack ();

    }

    public void add(Object ob){
        if (this.stack2.size() >= 1) {
            emptyStack(this.stack2, this.stack1);
        }
        else {
            this.stack1.add(ob);
        }
    }

    public Object dequeue(){
       Object object = null;
       if (this.stack1.size() >= 1){
           emptyStack(this.stack1, this.stack2);
       }


           object = (this.stack2.size() <= 0 ? "The queue is empty": this.stack2.pop());

       return object;
    }

    private static boolean emptyStack(Stack stack_A, Stack stack_B){
        if (stack_A.size() > 0) {
            stack_B.push(stack_A.pop());
            emptyStack(stack_A, stack_B);
        }
        return true;
    }
}
