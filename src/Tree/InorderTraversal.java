package Tree;

public class InorderTraversal {
    public static void main(String[] args) {
        InorderTraversal inorder = new InorderTraversal();
        TreeNode root = new TreeNode();

        root.val=10;
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        inorder.inorderTraversal(root);
    }

    public void inorderTraversal(TreeNode root){
        if(root!=null){
            if(root.left != null) {
                inorderTraversal(root.left);
            }

            System.out.println(root.val);

            if(root.right != null) {
                inorderTraversal(root.right);
            }

        }
    }
}
