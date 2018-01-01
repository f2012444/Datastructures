package Crack6.Trees;

public class TreeNode {
    int val;
    TreeNode[] child;
    final int DEFAULT_CHILDS = 10;

    public TreeNode(int val) {
        this.val = val;
        child = new TreeNode[DEFAULT_CHILDS];
    }

    public TreeNode(int val, int kids) {
        this.val = val;
        child = new TreeNode[kids];
    }

}
