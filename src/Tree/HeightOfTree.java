package Tree;

public class HeightOfTree {

    public static void main(String[] args) {

        //TODO to find Height of a Tree
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(7);
    root.left.left.left = new TreeNode(8);

    HeightOfTree heightOfTree = new HeightOfTree();
        System.out.println( heightOfTree.getHeight(root));;

    }

    public int getHeight(TreeNode node){

        // the formula is from Root  max(left,right)+1;
        int height= 0;
        if (node == null) {
            return 0;
        }
        height=Math.max(getHeight(node.left),getHeight(node.right))+1;


        return height;
    }


}
