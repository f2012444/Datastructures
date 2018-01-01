package Crack6.Trees;

public class CreateBinaryTree {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 76, 89, 100};
        BinaryTreeNode bnode = createBST(arr, 0, arr.length - 1);
        BinaryTreeTraversals bt = new BinaryTreeTraversals();
        bt.descendingorderTraversal(bnode);
    }
    public static BinaryTreeNode createBST(int[] arr, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start+end)/2;
        BinaryTreeNode node = new BinaryTreeNode(arr[mid]);
        node.left = createBST(arr, start, mid-1);
        node.right = createBST(arr, mid+1, end);
        return node;
    }
}
