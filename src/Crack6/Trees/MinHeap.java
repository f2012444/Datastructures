package Crack6.Trees;

public class MinHeap {
    MinHeapNode root;
    public MinHeap(MinHeapNode node) {
        this.root = node;
    }

    public void insert(int val) {
        MinHeapNode newNode = new MinHeapNode(val);
        MinHeapNode rightMost = getRightMost(root);
        rightMost.right = newNode;
        rightMost.right.parent = rightMost;
        insertRight(rightMost.right);
    }

    public void insertRight(MinHeapNode node) {
        if(node.parent == null) {
            return;
        }
        if(node.parent.val > node.val) {
            MinHeapNode templeft = node.parent.left;
            MinHeapNode tempparent = node.parent.parent;
            MinHeapNode childleft = node.left;
            MinHeapNode childright = node.right;
            node.parent.right = childright;
            node.parent.left = childleft;
            node.parent.parent = node;


        }
    }

    public MinHeapNode getRightMost(MinHeapNode node) {
        while(node.right != null) {
            node = node.right;
        }

        return node;
    }

}
