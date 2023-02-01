package DSA.Algorithms.Trees;
import DSA.Algorithms.Trees.Node;

public class BST {
    
     private Node root;
     private List leafNodes;
     private int heightOfTree;
     private int max;
    
    public BST(){
        this.root = null;
        this.leafNodes = new ArrayList();
        this.heightOfTree = 0;
        this.max = 0;
    }
    
     public int height(){
        return heightOfTree(this.root);
    }
    
    public int depth(int data){
        return depthOfNode(data);
    }
    
     public List leafNodes(){
       return this.leafNode(this.root);
    }

    public boolean isBST(){
        return check_BST(this.root, this.root.left, this.root.right);
    }
    
    public void del(int data){
       this.swapNodes(this.root, this.root.left, this.root.right, data);
    }
    

    // its check whether the is Binary Search Tree or not
    private boolean check_BST(Node root, Node left, Node right) {
         boolean bool = false;

         if(root != null){

             if (left != null){
                 check_BST(root.left, root.left.left, root.right.right);

                 if (root.left.getData() < root.getData()) bool = true;
                 else bool = false;
             }

             if (right != null) {
                 check_BST(root.right, root.right.left, root.right.right);

                 if (root.right.getData() > root.getData()) bool = true;
                 else bool = false;
             }
         }
         return bool;
    }
    
    
    // adjust the new and old nodes and their childs and deleting the targeted node
        private void swapNodes(Node root, Node left, Node right, int data) {
        if (this.contains(data)){

        if(left != null && root.getData() > data){
            Node node = root.left;
//            System.out.println(node.getData());
            swapNodes(node, node.left, node.right, data);

        }
        if(right != null && root.getData() < data){
            Node node = root.right;
//            System.out.println(node.getData());
            swapNodes(node, node.left, node.right, data);
        }
        if (root != null && root.getData() == data){
            
            // left is null and right in not null pass to prevNode
            if(root.left == null && root.right != null){
//                System.out.println(root.getData());
                this.prevNode(this.root, this.root.left, this.root.right, data);
            }
            
             // right is null and left isn't, so pass to prevNode
            else if(root.left != null && root.right == null){
//                System.out.println(root.getData());
                this.prevNode(this.root, this.root.left, this.root.right, data);
            }
            
            // when both child is null
            else if (root.left == null && root.right == null){
                long sTime = System.nanoTime();
                this.prevNode(this.root,this.root.left, this.root.right, data);
                long eTime = System.nanoTime();
                System.out.println("Deletion of node:" +root+ ", data:" +root.getData()+ " performed in:" +(((eTime - sTime) / 1000000)+0.1)+ " sec");
            }
            
            // when both is not null
            else if (root.left != null && root.right != null){
                
                if (root.right.left == null && root.right.right != null){
                    // pass to the prevNode for adjustment of nodes and deletion
                    this.prevNode(this.root, this.root.left, this.root.right, data);
                    
//                  current root node's left becomes the left of new root node 
                    right.left = root.left;
                }
                // same process for right child
                else if (root.left.right == null && root.left.left != null) {
                    this.prevNode(this.root, this.root.left, this.root.right, data);
//                    System.out.println(right.getData());
                    right.right = root.right;

                }
                // for finding the in order predecessor 
                else {
                    Node inOrPre = inOrderPre(root.right, root);
                    int temp = root.getData();
                    root.setData(inOrPre.getData());
                    inOrPre.setData(temp);
                    
                this.deleteNode(this.root, this.root.left, this.root.right, data);
                }
             }
           }
        }
    }


    
    
    
    
  // the function just find the replaced node(target to be deleted) and remove it  
    private boolean deleteNode(Node node,Node left, Node right, int data){
        boolean isDeleted = false;
    
        if (left != null && left.getData() == data){
            
            if (left.left == null && left.right == null) {
                node.left = null;
                isDeleted = true;
            }
            else{
                System.out.println("Implement the logic for recovery");
            }
        }
        else if (right != null && right.getData() == data){
            
            if (right.right == null && right.left == null) {
                node.right = null;
                isDeleted = true;
            }
            else{
                System.out.println("Implement the logic for recovery");
            }
        }
        if(node != null && node.left != null){
            
            this.deleteNode(left, left.left, left.right, data);
        }
        if(node != null && node.right != null){
            this.deleteNode(right, right.left, right.right, data);
        }
        return isDeleted;
}

    
  private Node deletion(int data, Node root){
    if (root == null) {
        return root;
    }
    else if (root.getData() < data) {
        root.right = this.deletion(data, root.right);
    }
    else if (root.getData() > data) {
        root.left = this.deletion(data, root.left);
    }
    else{
        if (root.left == null || root.right == null){

            Node node;
            if (root.left == null) {
                node = root.right;
            }
            else {
                node = root.left;
            }
            if (node == null) {
                node = root;
                root = null;
            }
            else {
                root = node;
            }
        }
        else{
            Node node = this.inOrderSucc(root.right);
            root.setData(node.getData());
            root.right = this.deletion(node.getData(), root.right);
        }
    }
    if (root == null)
        return root;
     }
}
    
    // it find and sets the targeted node to be deleted 
        private void prevNode(Node root, Node left, Node right, int data) {
        if (this.contains(data)){

            if (left != null && left.getData() == data){
                System.out.println("left");

                // if the targeted node have only right child
                if (left.right != null && left.left == null) {
                    // right child becomes root left child
                    root.left = left.right;
                }
                // if the targeted node have only left child
                else if (left.right == null && left.left != null){
                    // left child becomes root left child
                    root.left = left.left;
                }
                // if left.right of left child null
                else if (left.left != null && left.left.right == null){
                    // left.left becomes root's left
                    root.left = left.left;
                }
                else if (left.right == null && left.left == null) {
                    root.left = null;
                }
            }
            else if (right != null && right.getData() == data){
//                System.out.println("Right: "+ right.right.getData());
                if (right.right != null && right.left == null) {
//                    System.out.println("Right Right");
                    root.right = right.right;
                }
                else if (right.right == null && right.left != null) {
//                    System.out.println("Right Left");
                    root.right = right.left;
                }
                else if (right.right != null && right.right.left == null) {
//                    System.out.println("Right Right");
                    root.right = right.right;
                }
                else if (right.right == null && right.left == null) {
//                    System.out.println("Null");
                    root.right = null;
                }

            }
            else if (root != null && root.getData() > data){
                System.out.println("Root");

                this.prevNode(left, left.left, left.right, data);
            }
            else if (root != null && root.getData() < data){
                this.prevNode(right, right.left, right.right, data);
            }

        }
    }

    
    //  it deletes only the leaf node
    public void deleteLeaf(int data) {
        Node node = this.root;
        boolean bool = false;

        if(node.getData() == data){
            this.root = null;
        }
        else if(node != null && this.contains(data)){

            while (!bool){
                if ((node.left != null) && (node.left.getData() == data) && (node.left.right == null && node.left.left == null)){
                    node.left = null;
                    bool = true;
                }
               else if ((node.right != null) && (node.right.getData() == data) && (node.right.right == null && node.right.left == null)){
                    node.right = null;
                    bool = true;
                }
               else if(node.left != null && node.getData() > data){
                    node = node.left;
                }
               else if(node.right != null && node.getData() < data){
                    node = node.right;
                }
               else{
                    System.out.println("Provided node is not a leaf node");
                    bool = true;
                }
            }
        }
        else {
            System.out.println("Doesn't have this node");
        }
    }
    
    
    
    // it find the in order predecesor
    private Node inOrderPre(Node node, Node root){
        Node iPre = node;

        if(node.left != null){

           iPre = this.inOrderPre(node.left, root);

        }

        else if(node.right != null){

            iPre = this.inOrderPre(node.right, root);
        }

        return iPre;
    }


    
    
// it return the complete list of leaf nodes of Binary Search Tree
private List leafNode(Node node){
        if (node != null) {
            if (node.left != null){
                this.leafNode(node.left);
            }
            if(node.right != null){
                this.leafNode(node.right);
            }
            if(node.left == null && node.right == null) {
               this.leafNodes.add(node.getData());
            }
        }
        else {
            System.out.println(new NullPointerException().getMessage());
        }
        return this.leafNodes;
    }
    
    // through this function find depth from root to any node
    private int depthOfNode(int data){
        int depOfNode = 0;
        boolean flag = false;

        if (this.contains(data)) {
            Node node = this.root;

            while(!flag){
                if (node.getData() == data) {
                    flag = true;
                }
                else if(node.getData() > data && node.left != null){
                    node = node.left;
                    depOfNode++;
                }
                else if(node.getData() < data && node.right != null){
                    node = node.right;
                    depOfNode++;
                }
            }
        }
        return depOfNode;
    }
 
    
    
    
// it finds the height of tree 
 private int heightOfTree(Node node){
        if (node != null) {
            if (node.left != null){
                this.max++;
                this.heightOfTree(node.left);
                this.max--;
            }
            if(node.right != null){
                this.max++;
                this.heightOfTree(node.right);
                this.max--;

            }
            if(node.left == null && node.right == null) {
                this.heightOfTree = Math.max(this.heightOfTree, this.max);
            }
        }
        else {
            System.out.println(new NullPointerException().getMessage());
        }
        return this.heightOfTree;
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


        //Searching a particular data in Binary Search Tree (Through recursive method)
        public boolean contain(int data){
            return search(data, this.root);
        }
      private static boolean search(int data, Node root){
        boolean bool  = false;
        if(root != null){
            if(root.getData() == data){
                bool = true;
            }
            else if(root.getData() < data){
                bool = search(data, root.right);

            }
            else {
                bool = search(data, root.left);
            }

        }
        return bool;
    }



        // Searching a particular data in Binary Search Tree (Through iterative method)
        public boolean contains(int data){
            boolean bool = false;
            if(this.root == null) {
                throw new NullPointerException("\" ---- Tree is empty!!!! ---- \"");
            }
            else {
                boolean flag = false;
                Node node = this.root;
                while(!flag){
                    if(node.getData() == data){
                        bool = true;
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
            return bool;
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
                    else if(node.getData() == data) flag = true;

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
//                this.preTraversal(this.root, this.root.left, this.root.right);
//                this.posTraversal(this.root, this.root.left, this.root.right);
                this.inTraversal(this.root, this.root.left, this.root.right);
            }
        }
    }
