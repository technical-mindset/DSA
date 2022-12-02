package DSA.Algorithms.Trees;

public class BinaryTree {
    private Node root;
    public BinaryTree(){
        this.root = null;
    }

    public void remove(int data){
        if(this.contains(data) == data){
            boolean bool = false;
            Node node = this.root;
            int var;
            while(!bool){
                if(node.right != null && node.right.getData() == data){
                   var = node.right.getData();
                    System.out.println(var);
                    bool = true;
                }
               else if(node.left != null && node.left.getData() == data){
                    var = node.left.getData();
                    System.out.println(var);
                    bool = true;
                }
                else if (node.left.getData() > data) {
                    if (node.left != null) node = node.left;
                    else bool = true;
                }
                else if (node.right.getData() < data ) {
                    if (node.right != null) node = node.right;
                    else bool = true;
                }
            }
        }
    }
    // node, node.right.left, node.right.right
    private void temp(Node root, Node left, Node right){
        if(right.right != null){
            root.right = right.right;
        }
        else if(left.left != null) {
            root.left = left.left;
        }
    }
    //Finding deepest Node
    private Node deepNode(Node root, Node left, Node right){
        Node nodeT = root;
        if (root != null){
            nodeT = root;
        }
        if(left != null){
            Node node = root.left;
            deepNode(node, node.left, node.right);
        }
        if(right != null){
            Node node = root.right;
            deepNode(node, node.left, node.right);
        }
        return nodeT;
    }



    private void posTraversal(Node root, Node left, Node right) {
        // Left, Right, Root
        if(left != null){
            Node node = root.left;
            posTraversal(node, node.left, node.right);
        }
        if(right != null){
            Node node = root.right;
            posTraversal(node, node.left, node.right);
        }
        if (root != null){
            System.out.println(root.getData());
        }
    }
    private void inTraversal(Node root, Node left, Node right) {
        // Left, Root, Right
        if(left != null){
            Node node = root.left;
            inTraversal(node, node.left, node.right);
        }
        if (root != null){
            System.out.println(root.getData());
        }
        if(right != null){
            Node node = root.right;
            inTraversal(node, node.left, node.right);
        }

    }
    private void preTraversal(Node root, Node left, Node right) {
        // Root, Right, left
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
    public int contains(int data){
        int var = -1;
        if(this.root == null) {
            throw new NullPointerException("\" ---- Tree is empty!!!! ---- \"");
        }
        else {
            boolean flag = false;
            Node node = this.root;
            while(!flag){
                if(node.getData() == data){
                    var = node.getData();
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
        return var;
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
        if(this.root == null) throw new NullPointerException("Node is empty");
        else {
            this.preTraversal(this.root, this.root.left, this.root.right);
//            this.posTraversal(this.root, this.root.left, this.root.right);
//            this.inTraversal(this.root, this.root.left, this.root.right);
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
