package Crack6.Trees;

import java.util.ArrayList;

public class DdepthLinkedListwithInorder {


    public ArrayList<Node> createDLinkedList(BinaryTreeNode node) {
        int depth = getMaxDepth(node);
        ArrayList<Node> res = new ArrayList<>();
        for(int i = 0;i<depth;i++) {
            res.add(new Node(0));
        }
        addToLinkedList(node, 0, res);
        for(int i = 0;i<depth;i++) {
            Node temp = res.get(i);
            res.set(i, temp.next);
        }
        return res;

    }

    public void addToLinkedList(BinaryTreeNode node, int depth, ArrayList<Node> res) {
        if(node == null) {
            return;
        }

        Node temp = res.get(depth);
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = new Node(node.val);
        addToLinkedList(node.left, depth+1, res);
        addToLinkedList(node.right, depth+1, res);

    }


    public int getMaxDepth(BinaryTreeNode node) {
        if(node == null) {
            return 0;
        }
        return Math.max(1+getMaxDepth(node.left), 1+getMaxDepth(node.right));
    }
}
