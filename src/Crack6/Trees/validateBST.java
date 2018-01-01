package Crack6.Trees;

public class validateBST {
    boolean validate(BinaryTreeNode node) {
        if(node == null) {
            return true;
        }
        if(node.left != null) {
            if(node.left.val > node.val) {
                return false;
            }
        }

        if(node.right != null) {
            if(node.right.val < node.val) {
                return false;
            }
        }

        return validate(node.left) && validate(node.right);
    }
}
