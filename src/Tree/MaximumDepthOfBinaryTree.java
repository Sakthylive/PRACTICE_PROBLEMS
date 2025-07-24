package Tree;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        TreeNode node1 = new TreeNode(10);
        node1.left= new TreeNode(20);
        node1.right = new TreeNode(20);

        node1.left.left= new TreeNode(30);
        node1.left.left.left= new TreeNode(40);
        node1.left.left.left.left= new TreeNode(50);
        node1.left.left.left.left.left= new TreeNode(60);
        node1.left.left.left.left.left.right= new TreeNode(70);
        node1.left.left.left.left.left.right.left =new TreeNode(80);
        node1.left.right = new TreeNode(30);
        System.out.println(maximumDepthOfBinaryTree.maxDepth(node1));

    }

    public  int maxDepth(TreeNode node1){
        int maxDepth = 0;
        if(node1==null) return 0;
        if(node1.left==null && node1.right==null) return 1;
        maxDepth =Math.max(maxDepth(node1.left),maxDepth(node1.right))+1;
        return maxDepth;
    }



}
