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
      int balFac = this.balFactor(root);
      // LL case
       if (balFac > 1 && root.left.getData() > data){
           return rightRotate(root);
       }
       // RR-Case
       if (balFac < -1 && root.right.getData() < data){
           return leftRotate(root);
       }
       // LR-Case
       if (balFac > 1 && root.left.getData() > data){
           root.left = leftRotate(root.left);
           return rightRotate(root);
       }
       // LR-Case
       if (balFac < -1 && root.left.getData() < data){
           root.right = rightRotate(root.right);
           return leftRotate(root);
       }


       return root;
}
 
 // ------------ Rotation methods -------
 
 
/*  LL-Case:
* Before Rotation
          root(c)
          /   \
         b     a
        / \
       d   E
      / \
     F   G

* After Rotation
          root(b)
           /   \
          d     c
         / \   / \
        F   G E   a

 */
private AVL_Node rightRotate(AVL_Node root){

    // rotation
    AVL_Node b = root.left;
    AVL_Node E = b.right;
    b.right = root;
    root.left = E;

    // updating the height
    root.height = Math.max(height(root.left),height(root.right)) + 1;
    b.height = Math.max(height(b.left),height(b.right)) + 1;
    return b; // becoming the new root node

}
 
 
 /*    RR-Case: Before rotation:
        root(c)
        /  \
       D    b
           / \
          E   a
             / \
            F   G
    * After Rotation:
          root(b)
          /   \
         c     a
        / \   / \
       D   E  F  G

 */
private AVL_Node leftRotate(AVL_Node root){
   // rotation
    AVL_Node b = root.right;
    AVL_Node E = b.left;
    b.left = root;
    root.right = E;
   //updating height
    root.setHeight(Math.max(this.height(root.left),this.height(root.right)) + 1);
    b.setHeight(Math.max(this.height(b.left),this.height(b.right)) + 1);

    return b; // becoming the new root
}

 
 
 // -------- small functions ---------
 
 private int balFactor(AVL_Node node){
    if (node == null) {
        return 0;
    }
    return height(node.left) - height(node.right);
}
 
 private int height(AVL_Node node){
    if (node == null){
        return 0;
    }
      return node.getHeight;
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

