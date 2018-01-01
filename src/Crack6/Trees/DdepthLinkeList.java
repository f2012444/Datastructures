package Crack6.Trees;


import java.util.LinkedList;
import java.util.Queue;

public class DdepthLinkeList {


    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 76, 89, 100};
        CreateBinaryTree bst = new CreateBinaryTree();
        BinaryTreeNode bnode = bst.createBST(arr, 0, arr.length - 1);
        Node[] dst = creareDlinkedList(bnode);
        int i = 0;
    }


    public static Node[] creareDlinkedList(BinaryTreeNode bnode) {
        int depth = getMaxDepth(bnode);
        Node[] out = new Node[depth];
        int i = 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        Queue<BinaryTreeNode> queue2 = new LinkedList<>();
        queue.add(bnode);
        while(i < depth) {
            Node node = new Node(0);
            Node temp = node;
            while(!queue.isEmpty()) {
                BinaryTreeNode tempNode = queue.remove();
                temp.next = new Node(tempNode.val);
                if(tempNode.left != null) {
                    queue2.add(tempNode.left);
                }

                if(tempNode.right != null) {
                    queue2.add(tempNode.right);
                }
                temp = temp.next;

            }

            while(!queue2.isEmpty()) {
                queue.add(queue2.remove());
            }
            out[i] = node.next;
            i++;

        }

        return out;
    }

    public static int getMaxDepth(BinaryTreeNode node) {
        if(node==null) {
            return 0;
        }
        return Math.max(1+getMaxDepth(node.left), 1+getMaxDepth(node.right));
    }

}
