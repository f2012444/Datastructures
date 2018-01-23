package Linkedin;

import java.util.Stack;

public class BinaryTreeIterator {
    /**
     * Definition for binary tree
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

        Stack<TreeNode> stack;
        public BinaryTreeIterator(TreeNode root) {
            stack = new Stack<TreeNode>();
            TreeNode temp = root;
            while(temp!=null) {
                stack.push(temp);
                temp = temp.left;
            }
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode cur = stack.pop();
                TreeNode par = cur;
                if(par.right != null) {
                    TreeNode temp = par.right;
                    while(temp!=null) {
                        stack.push(temp);
                        temp = temp.left;
                    }

                }


            return cur.val;




        }
    }

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */

