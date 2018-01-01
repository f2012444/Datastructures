package Crack6.Trees;

import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 76, 89, 100};
        CreateBinaryTree bst = new CreateBinaryTree();
        BinaryTreeNode bnode = bst.createBST(arr, 0, arr.length - 1);
       // bnode.right = null;
        Zigzagordertraversal cb = new Zigzagordertraversal();
        ArrayList<ArrayList<Integer>> val = cb.getZigZagOrder(bnode);
        for(ArrayList<Integer> temp: val) {
            System.out.println();
            for(int i:temp) {
                System.out.print(i + "  ");
            }
        }

            //System.out.println(val);

//        DdepthLinkedListwithInorder ds = new DdepthLinkedListwithInorder();
//        ArrayList<Node> dst = ds.createDLinkedList(bnode);
//        for(int i = 0;i<dst.size();i++) {
//            Node temp = dst.get(i);
//            while(temp!=null) {
//                System.out.print(" " + temp.val);
//                temp = temp.next;
//            }
//            System.out.println();
//        }
    }
}
