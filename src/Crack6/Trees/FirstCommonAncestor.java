//package Crack6.Trees;
//
//import java.util.List;
//
//public class FirstCommonAncestor {
//    List<BinaryTreeNode> getFirstCommonAncestor(BinaryTreeNode node, BinaryTreeNode p, BinaryTreeNode q) {
//        if(node == null) {
//            return null;
//        }
//
//        if(node == p) {
//            List<BinaryTreeNode> bt =  getFirstCommonAncestor(node.left, p, q);
//            if(bt.contains(q)) {
//                return
//            }
//            List<BinaryTreeNode> bt2 = getFirstCommonAncestor(node.right, p, q);
//
//        }
//        if(node == q) {
//            return q;
//        }
//
//    }
//}
