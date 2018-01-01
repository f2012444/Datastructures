package Crack6.Trees;

public class GetSuccessor {
    public MinHeapNode getSuccessor(MinHeapNode minHeapNode) {
        if(minHeapNode == null) {
            return null;
        }
        if(minHeapNode.right != null) {
            MinHeapNode temp = minHeapNode.right;
            while(temp.left!=null) {
                temp = temp.left;
            }
            return temp;
        }

        MinHeapNode temp = minHeapNode.parent;
        while(temp!=null && temp.val < minHeapNode.val) {
            temp = temp.parent;
        }

        return temp;

    }
}
