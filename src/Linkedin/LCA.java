package Linkedin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> first = (getPath(root, p));
        List<TreeNode> second = (getPath(root, q));
        Collections.reverse(first);
        Collections.reverse(second);
        for(int i = 0;i<Math.min(first.size(), second.size())-1;i++) {
            if(!first.get(i+1).equals(second.get(i+1))) {
                return first.get(i);
            }
        }

        return null;

    }

    public List<TreeNode> getPath(TreeNode root, TreeNode search) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if(root == null ){
            return res;
        }


        if(root.equals(search)) {
            res.add(root);
            return res;
        }
        List<TreeNode> leftpath = getPath(root.left, search);
        if(leftpath.size() > 0) {
            leftpath.add(root);
            return leftpath;
        }

        List<TreeNode> rightpath = getPath(root.right, search);
        if(rightpath.size() > 0) {
            rightpath.add(root);
            return rightpath;
        }

        return res;

    }
}
