package Tree.SameTree_100;

import Utils.TreeNode;

import java.util.List;

/**
 100. Same Tree
 https://leetcode.com/problems/same-tree/description/

 Given two binary trees, write a function to check if they are the same or not.

 Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

 Example 1:
 Input:     1         1
           / \       / \
          2   3     2   3

 [1,2,3],   [1,2,3]
 Output: true

 Example 2:
 Input:     1         1
           /           \
          2             2

 [1,2],     [1,null,2]
 Output: false

 Example 3:
 Input:     1         1
           / \       / \
          2   1     1   2

 [1,2,1],   [1,1,2]
 Output: false
 */

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean same = true;
        return isSameTree(p,q,same);
    }

    public boolean isSameTree(TreeNode p, TreeNode q, boolean same) {
        if (same == false) {
            return false;
        } else if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || p.val != q.val) {
            return false;
        } else {
            same = isSameTree(p.left, q.left, same);
            same = isSameTree(p.right, q.right, same);
        }

        return same;
    }

    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;

        if (p == null && q != null) return false;
        if (q == null && p != null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
