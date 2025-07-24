package Tree;

public class IsSubTreeProblem {
// the complexity here is O(n pow 2) O(n * m)
    public static void main(String[] args) {
        IsSubTreeProblem stp = new IsSubTreeProblem();
        TreeNode node1 = new TreeNode(10);
        node1.left= new TreeNode(20);
        node1.right = new TreeNode(30);
        node1.right.left= new TreeNode(40);
        node1.right.right = new TreeNode(50);


        TreeNode node2 = new TreeNode(30);
        node2.left= new TreeNode(40);
        node2.right = new TreeNode(50);

        System.out.println(stp.isSubtree(node1,node2));


    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        Boolean isSubtree=false;
        // if both the root nodes are null then it is false
        if(root == null || subRoot==null){
            return false;
        }
        // if it is same tree, which means root and subroot are exactly same
        else if (isSameTree(root,subRoot)){
            isSubtree=true;
        }else{
            //else traverse both the sides
           return  isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
        }
        return isSubtree;
    }

    public Boolean isSameTree(TreeNode node1, TreeNode node2 ){
        Boolean isSameTree=false;

        if(node1==null && node2 ==null){
            isSameTree=true;
        }else if (( node1 !=null && node2==null) ||(node1==null && node2 != null)){
            isSameTree=false;
        }
        else if (node1.val==node2.val && isSameTree(node1.left,node2.left) && isSameTree(node1.right,node2.right)){
            isSameTree=true;
        }
        return isSameTree;
    }




}
