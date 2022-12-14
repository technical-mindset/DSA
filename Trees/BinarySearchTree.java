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
    
    
    // working........
    private boolean deleteNode(Node node, int data){
   boolean deleted = false;
   Node root = node;
    if (root != null) {
        if (root.left != null){
            if(root.left.getData() != data){
            root = root.left;
            }
        }
    }
        return deleted;
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
    
    // finding the predecessor
    private Node inOrderPre(Node node, Node root){
        Node iPre = node;

        if(node.left != null){

           iPre = this.inOrderPre(node.left, root);

            int temp = node.getData();
            node.setData(iPre.getData());
            iPre.setData(temp);
            iPre = node;

        }

        else if(node.right != null){

            iPre = this.inOrderPre(node.right, root);

            int temp = node.getData();
            node.setData(iPre.getData());
            iPre.setData(temp);
            iPre = node;

        }

        return iPre;
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
