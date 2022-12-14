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
