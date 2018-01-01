package Crack6.Trees;


import Crack6.Trees.BinaryTreeNode;

public class CheckBalanced {
     public int checkBalanceTree(BinaryTreeNode btNode, int depth) {
        if(btNode == null) {
            return depth;
        }

        int leftDepth = checkBalanceTree(btNode.left, depth );
         if(leftDepth == -1) {
             return -1;
         }
        int righttDepth = checkBalanceTree(btNode.right, depth);
        if(righttDepth == -1 || Math.abs(righttDepth -leftDepth) > 1) {
            return -1;
        }
        return Math.max(1+leftDepth, 1+righttDepth);

    }
}
