package Tree;

public class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data = val;
            this.left= null;
            this.right= null;
        }
    }


    public static void   main(String[] args) {
        //Creating a binary tree using the Node class --traditional method
        Node node = new BinaryTree().new Node(1);
        node.left= new BinaryTree().new Node(2);
        node.right= new BinaryTree().new Node(3);
        node.left.left= new BinaryTree().new Node(4);
        node.left.right= new BinaryTree().new Node(5);
        node.right.left= new BinaryTree().new Node(6);
        node.right.right= new BinaryTree().new Node(7);
        System.out.println("Pre-order Traversal:");
       preOrderTraverse(node);
        System.out.println("Post-order Traversal:");
        postOrderTraversal(node);
        System.out.println("In-order Traversal:");
        inOrderTraversal(node);
    }
    public static void preOrderTraverse(Node node){
        if (node != null) {
            System.out.println(node.data);
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
    }
    public static void postOrderTraversal(Node node){
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data);
        }
    }
    public static void inOrderTraversal(Node node){
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }

}
