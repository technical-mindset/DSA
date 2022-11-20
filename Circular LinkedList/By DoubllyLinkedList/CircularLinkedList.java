package DSA.Algorithms;

public class CircularDoubly {
    Nodes head;
    private int size;
    CircularDoubly(){
        this.size = -1;
    }
    public void append(int data){
        Nodes node = this.head;
        Nodes new_node = new Nodes(data);
        if (this.head == null) {
            this.head = new_node;
            this.head.prev = this.head.next = this.head;
        }
        else if(this.head.next ==  this.head){
            new_node.next = node.next;
            new_node.prev = this.head;
            node.next = new_node;
            node.prev = new_node;
        }
        else {
            while(node.next != this.head){
                node = node.next;
            }
            new_node.prev = node;
            new_node.next = node.next;
            this.head.prev = new_node;
            node.next = new_node;
        }
    }
    public void insert(int data){
        Nodes new_node = new Nodes(data);

        if(this.head == null || this.head.next == this.head){
            this.append(data);
        }
        else if(this.head.next != this.head && this.head.prev != this.head){
            // make a copy of all details of head into node variable
            Nodes node = this.head;
            // make new_node as head
            this.head = new_node;
            // store the details of next and prev of old head which is stores in node object into new_node
            new_node.next = node;
            new_node.prev = node.prev;
            node.prev = new_node;
            // store new_node as 'prev' of 'next' (which means the last node) of head
            this.head.prev.next = new_node;
        }
    }
    public void insertAt(int pos, int data){
        if(this.head != null && (pos == 0 || pos == 1)){
          this.insert(data);
        }
        else if(pos == 0 || pos == 1){
            this.insert(data);
        }
        else if(pos > this.size()+1){
            System.out.println("Operation failed: \"Size of list is:"+this.size+" Please enter correct position");
        }
        else {
            //10 1 14 4 9 7 23 56 12 5 46
            Nodes node = this.head;
            int i = 0;
            //loop stops at pos-1 just before to the targeted position
            while(i < pos-2){
                node = node.next;
                i++;
            }
            Nodes new_node = new Nodes(data);
            new_node.next = node.next;
            new_node.prev = node;
            node.next = new_node;
            // change the 'next' of 'prev' of current 'node' with new_node
            node.next.prev = new_node;
        }
    }

   public void remove(){
       if (this.head == null) {
           System.out.println("Operation failed: List is already empty");
       }
       else if(this.head.next == this.head){
           this.head = null;
       }
       else if(this.head.next.next == this.head){
           this.head.next = this.head;
       }
       else{
           Nodes node = this.head;
           while(node.next.next != this.head){
               node = node.next;
           }
           node.next.prev = null;
           node.next = this.head;
       }
   }
   public void removeAtStart(){
       if (this.head == null || this.head.next.next == this.head) {
           this.remove();
       }
       else {
           // make a copy of all details of head into node variable
           Nodes node = this.head;
           // make 'next' of current head as head
           this.head = node.next;
           // change 'prev' of new head with 'prev' of old head which is save in 'node' object
           this.head.prev = node.prev;
           // now making the 'next' of 'prev' of new head with 'next' of old head which is save in 'node' object
           this.head.prev.next = node.next;
       }
   }
    public void removeAt(int pos){
        if(this.head != null && (pos == 0 || pos == 1)){
            this.removeAtStart();
        }
        else if(pos > this.size()+1){
            System.out.println("Operation failed: \"Size of list is:"+this.size+" Please enter correct position");
        }
        else {
            Nodes node = this.head;
            int i = 0;
            while(i < pos-2){
                node = node.next;
                i++;
            }
            node.next = node.next.next;
            node.next.next.prev = node;
        }
    }
    public int size(){
        Nodes node = this.head;
        if (this.head == null) return -1;
        else if(this.head.next == this.head) return 0;
        else while (node.next != this.head) {
            node = node.next;
            ++this.size;
        }
        return this.size;
    }

    public void traverse(){
        Nodes node = this.head;
        if(this.head == null) System.out.println("Empty List");
        else if(this.head.next == this.head) System.out.println(this.head.getData());
        else{
            while(node.next != this.head){
                System.out.println(node.getData());
                node = node.next;
            }
            System.out.println(node.getData());
        }
    }
}
