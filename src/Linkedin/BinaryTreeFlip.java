package Linkedin;

public class BinaryTreeFlip {
    static TreeNode result = null;
    TreeNode getFlipTree(TreeNode root) {
        result = null;
        if(root == null) {
            return root;
        }
        getBinaryTreeFlip(root);
        return result;
    }
    TreeNode getBinaryTreeFlip(TreeNode root) {
        if(root == null || root.left == null) {
            result = root;
            return root;
        } else {
            TreeNode cur = getBinaryTreeFlip(root.left);
            cur.left = new TreeNode(root.right.val);
            cur.right = new TreeNode(root.val);
            return cur.right;
        }

    }
}
