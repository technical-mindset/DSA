package DSA.Algorithms.Trees;

public class AVLTree {
 private AVL_Node root;
  public AVLTree(){
     this.root = null;
 }
 
 public void insertion(int data){
   this.root = this.insertion(data, this.root);
 }
 
private AVL_Node insertion(int data, AVL_Node root){
      // base-case: when the node is null then the creation of new Node and return
      if(root == null) {
          AVL_Node newNode = new AVL_Node(data);
          return newNode;
      }
      else if (root.getData() > data) {
          root.left = this.insertion(data, root.left);
      }
      else if (root.getData() < data) {
          root.right = this.insertion(data, root.right);
      }

      // set height after each insertion
      root.setHeight(Math.max(this.height(root.left),this.height(root.right)) + 1);
      return root;


}
 
 
 // -------- small functions ---------
 private int height(AVL_Node node){
    if (node == null){
        return 0;
    }
      return node.height;
}
 
 
class AVL_Node{
    AVL_Node left;
    AVL_Node right;
    int height;
    private int data;
    AVL_Node(int data){
        this.data = data;
        this.height = 1; // for easy calculation of balancing factor
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
}

