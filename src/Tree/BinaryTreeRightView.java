package Tree;

import java.util.*;

public class BinaryTreeRightView {

    public static void main(String[] args) {
        BinaryTreeRightView tree = new BinaryTreeRightView();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        System.out.println(tree.getRightView(root));
    }

    public List<Integer> getRightView(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while(!queue.isEmpty()){

            int size = queue.size();
            for(int i=0;i<size;i++){
               TreeNode node =  queue.poll();
                if(i==size-1){
                   list.add(node.val);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }



        }




        return list;
    }
}
