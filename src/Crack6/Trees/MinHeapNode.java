package Crack6.Trees;

public class MinHeapNode {
    int val;
    MinHeapNode parent;
    MinHeapNode left;
    MinHeapNode right;

    public MinHeapNode(int val) {
        this.val = val;
        parent = null;
        left = null;
        right = null;
    }
}
