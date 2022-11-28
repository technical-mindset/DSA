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
    
     public void traversal(){
        this.preTraversal(this.root, this.root.left, this.root.right);
    }
    
    private void preTraversal(Node root, Node left, Node right) {
       if (root != null){
           System.out.println(root.getData());
       }
       if(left != null){
           Node node = root.left;
           preTraversal(node, node.left, node.right);
       }
        if(right != null){
            Node node = root.right;
            preTraversal(node, node.left, node.right);
        }
    }
    
    public void contains(int data){
        if(this.root == null)
            throw new NullPointerException("\" ---- Tree is empty!!!! ---- \"");
        
        else {
            boolean flag = false;
            Node node = this.root;
            
            while(!flag){
                if(node.getData() == data){
                    System.out.println(node.getData());
                    flag = true;
                }
                
               else if (node.getData() > data) {
                    if (node.left != null) node = node.left;
                    else flag = true;
                }
                
                else if (node.getData() < data ) {
                    if (node.right != null) node = node.right;
                    else flag = true;
                }
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
