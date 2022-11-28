package DSA.Algorithms.Trees;

public class BinaryTree {
    private Node root;
    public BinaryTree(){
        this.root = null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(this.root == null){
            this.root = newNode;
        }
        else if(this.root.left == null){
            this.root.left = newNode;
        }
        else if(this.root.right == null){
            this.root.right = newNode;
        }
        else {
            boolean flag = false;
            Node node = this.root;
            while(!flag){
                if (node.getData() > data) {
                    if (node.left != null) node = node.left;
                    else flag = true;
                }
                else if (node.getData() < data ) {
                    if (node.right != null) node = node.right;
                    else flag = true;
                }
            }
            if (node.getData() > data) {
                node.left = newNode;
            }
            else if (node.getData() < data) {
                node.right = newNode;
            }
        }
    }
}



class Node{

   private int data;
   public Node left;
   public Node right;

   Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public int getData() {
        return data;
    }
}
