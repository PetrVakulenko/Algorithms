package Tree.BalancedBinaryTree_110;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 110. Balanced Binary Tree

 Given a binary tree, determine if it is height-balanced.
 For this problem, a height-balanced binary tree is defined as:
 a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 Example 1:
 Given the following tree [3,9,20,null,null,15,7]:

   3
  / \
 9  20
   /  \
 15   7
 Return true.

 Example 2:
 Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2  2
    / \
   3  3
  / \
 4  4
 Return false.
 */

public class Solution {
    boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);

        return balanced;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        if (Math.abs(l-r) > 1) balanced = false;

        return Math.max(l,r)+1;
    }
}
