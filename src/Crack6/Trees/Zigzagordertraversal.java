package Crack6.Trees;

import java.util.*;

public class Zigzagordertraversal {
    ArrayList<ArrayList<Integer>> getZigZagOrder(BinaryTreeNode root) {
        //Stack<BinaryTreeNode> st = new Stack<>();
        Queue<BinaryTreeNode> que = new LinkedList<>();
        Queue<BinaryTreeNode> que2 = new LinkedList<>();
        que.add(root);
        boolean level = false;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        while(!que.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            while(!que.isEmpty()) {
                BinaryTreeNode node = que.remove();
                temp.add(node.val);
                if(node.left!=null) {
                        que2.add(node.left);
                }

                if(node.right!=null) {
                        que2.add(node.right);

                }
            }
            if(level) {
                Collections.reverse(temp);
                level = false;
            } else {
                level = true;
            }
            res.add(temp);
            while(!que2.isEmpty()) {
                    que.add(que2.remove());
            }
        }

        return res;
    }
}
