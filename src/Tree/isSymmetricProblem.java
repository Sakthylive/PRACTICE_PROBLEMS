package Tree;
// The Complexity here is O(N)
public class isSymmetricProblem {
    public static void main(String[] args) {
        isSymmetricProblem stp = new isSymmetricProblem();
        TreeNode node1 = new TreeNode(10);
        node1.left= new TreeNode(20);
        node1.right = new TreeNode(20);

        node1.right.left= new TreeNode(30);
        node1.left.right = new TreeNode(30);
        System.out.println(stp.isSymmetric(node1));


    }

    public Boolean isSymmetric(TreeNode node){
        return (isSym(node.left,node.right));
    }

    public boolean isSym(TreeNode node1, TreeNode node2){
        if (node1==null && node2==null) return true;
        if(node1==null ||node2==null) return false;

        return (node1.val==node2.val && isSym(node1.left, node2.right) && isSym(node1.right,node2.left));

    }

}
