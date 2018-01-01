package Crack6.Trees;

public class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    public BinaryTreeNode() {
        this.val = 0;
        left = null;
        right = null;
    }

    public BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


}
