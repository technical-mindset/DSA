package DSA.Algorithms;

public class CircularDoubly {
    Nodes head;
    public void append(int data){
        Nodes node = this.head;
        Nodes new_node = new Nodes(data);
        if (this.head == null) {
            this.head = new_node;
            this.head.prev = this.head.next = this.head;
        }
        else if(this.head.prev ==  this.head){
            new_node.next = node.next;
            new_node.prev = node;
            node.next = new_node;
            node.prev = new_node;
        }
        else{
            while(node.next != this.head){
                node = node.next;
            }
            new_node.next = node.next;
            new_node.prev = node;
            node.next = new_node;
        }
    }


    public void insert(int data){
        Nodes new_node = new Nodes(data);

        if(this.head == null || this.head.next == this.head){
            this.append(data);
        }
        else if(this.head.next != this.head && this.head.prev == this.head){
            Nodes node = this.head;

            new_node.next = node.next;
            new_node.prev = node.prev;
            this.head = new_node;
        }
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


class Nodes{
   private int data;
   Nodes prev;
   Nodes next;
    Nodes(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    public int getData() {
        return data;
    }
}



