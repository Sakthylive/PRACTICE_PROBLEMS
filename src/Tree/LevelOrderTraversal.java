package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        TreeNode node1 = new TreeNode(10);
        node1.left= new TreeNode(20);
        node1.right = new TreeNode(30);


        node1.left.right= new TreeNode(40);
        node1.left.left= new TreeNode(50);
        levelOrderTraversal.levelOrderTraversal(node1);

    }
    public void levelOrderTraversal(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        if(node== null){
            return ;
        }

        queue.offer(node);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.println(current.val);

            if(current.left != null){
                queue.offer(current.left);
            }
            if(current.right != null){
                queue.offer(current.right);
            }
        }
    }



}
