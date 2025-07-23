package Tree;

public class SameTreeProblem {
    public static void main(String[] args) {
        SameTreeProblem stp = new SameTreeProblem();
        TreeNode node1 = new TreeNode(10);
        node1.left= new TreeNode(20);
        node1.right = new TreeNode(30);


        TreeNode node2 = new TreeNode(10);
        node2.right = new TreeNode(30);

        System.out.println(stp.isSameTree(node1,node2));


    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Boolean isSameTree = false;
//if both the nodes are null then we return true
        if(p == null && q == null){
            isSameTree=true;
        }
        //if any one of the nodes are null and other one is not null then it is not equal
        else if (p!= null && q==null || p==null && q!=null){
            isSameTree=false;
        }
        // do recursion on left and right side if root node are equal
        else if (p.val==q.val &&  isSameTree(p.left, q.left) && isSameTree(p.right,q.right)  ){
            isSameTree=true;
        }

        return isSameTree;
    }

}
