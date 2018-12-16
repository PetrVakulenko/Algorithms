package Tree.FindBottomLeftTreeValue_513;

import Utils.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 513. Find Bottom Left Tree Value
 https://leetcode.com/problems/find-bottom-left-tree-value/description/

 Given a binary tree, find the leftmost value in the last row of the tree.

 Example 1:
 Input:
   2
  / \
 1   3
 Output:
 1

 Example 2:
 Input:
        1
       / \
      2   3
     /   / \
    4   5   6
   /
  7
 Output:
 7

 Note: You may assume the tree (i.e., the given root node) is not NULL.
 */

public class Solution {
    int bottomLeft = 0;
    int depth = 0;

    public int findBottomLeftValue(TreeNode root) {
        this.calculateBottomLeft(root, 1);

        return this.bottomLeft;
    }

    private void calculateBottomLeft(TreeNode tree, int depth)
    {
        if (tree == null) return;

        if (depth > this.depth) {
            this.bottomLeft = tree.val;
            this.depth = depth;
        }

        calculateBottomLeft(tree.left, depth + 1);
        calculateBottomLeft(tree.right, depth + 1);
    }
}
