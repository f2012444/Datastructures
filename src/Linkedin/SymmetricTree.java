package Linkedin;


public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean check = isSymmetrichelper(root.left, root.right);
        return check;
    }

    public boolean isSymmetrichelper(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        if(left.val != right.val) {
            return false;
        }
        boolean check = isSymmetrichelper(left.left, right.right);
        check = check && isSymmetrichelper(left.right, right.left);
        return check;

    }
}
