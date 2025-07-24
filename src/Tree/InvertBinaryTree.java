package Tree;

public class InvertBinaryTree {

    public static void main(String[] args) {

        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode node1 = new TreeNode(10);
        node1.left= new TreeNode(20);
        node1.right = new TreeNode(30);

        node1.left.left= new TreeNode(40);
        node1.left.right = new TreeNode(50);
        System.out.println("before invert");
        invertBinaryTree.traverse(node1);

        invertBinaryTree.invert(node1);
        System.out.println("after invert");
        invertBinaryTree.traverse(node1);

    }

    public TreeNode invert(TreeNode node1){
        if(node1!=null){
            TreeNode leftNew = invert(node1.right);
            TreeNode rightNew = invert(node1.left);
            node1.left=leftNew;
            node1.right=rightNew;
        }
        return node1;
    }


    public void traverse(TreeNode node1){

        if(node1 != null) {
            System.out.println(node1.val);
            traverse(node1.left);
            traverse(node1.right);
        }
    }
}
