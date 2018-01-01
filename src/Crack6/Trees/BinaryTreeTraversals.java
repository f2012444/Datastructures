package Crack6.Trees;

public class BinaryTreeTraversals {
    public static void main(String[] args) {
        BinaryTreeNode node = new BinaryTreeNode(23);
        node.left = new BinaryTreeNode(12);
        node.right = new BinaryTreeNode(34);
        node.left.left = new BinaryTreeNode(6);
        node.left.right = new BinaryTreeNode(15);
        node.right.left = new BinaryTreeNode(27);
        node.right.right = new BinaryTreeNode(38);
//        System.out.println("Inorder traversal is ");
//        inorderTraversal(node);
//        System.out.println("preorder traversal is ");
//        preorderTraversal(node);
//        System.out.println("post traversal is ");
//        postorderTraversal(node);
//        System.out.println("descending order traversal is ");
//        descendingorderTraversal(node);
    }
    public  void inorderTraversal(BinaryTreeNode root) {
        if(root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.val);
        inorderTraversal(root.right);
    }

    public  void preorderTraversal(BinaryTreeNode root) {
        if(root == null) {
            return;
        }
        System.out.println(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public  void postorderTraversal(BinaryTreeNode root) {
        if(root == null) {
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.println(root.val);
    }

    public  void descendingorderTraversal(BinaryTreeNode root) {
        if(root == null) {
            return;
        }

        descendingorderTraversal(root.right);
        System.out.println(root.val);
        descendingorderTraversal(root.left);

    }




}
