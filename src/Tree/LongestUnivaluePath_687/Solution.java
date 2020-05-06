package Tree.LongestUnivaluePath_687;

import Utils.TreeNode;

/**
 687. Longest Univalue Path

 Given a binary tree, find the length of the longest path where each node in the path has the same value.
   This path may or may not pass through the root.
 The length of path between two nodes is represented by the number of edges between them.

 Example 1:
 Input:
     5
    / \
   4   5
  / \   \
 1   1   5

 Output: 2

 Example 2:
 Input:
     1
    / \
   4   5
  / \   \
 4   4   5

 Output: 2

 Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
 */

public class Solution {
    private int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        longValRecur(root);
        return max;
    }

    private int longValRecur(TreeNode node) {
        if (node == null) return 0;
        int left = longValRecur(node.left);
        int right = longValRecur(node.right);

        if (node.left != null && node.left.val == node.val) {
            left = left + 1;
        } else {
            left = 0;
        }

        if (node.right != null && node.right.val == node.val) {
            right = right + 1;
        } else {
            right = 0;
        }

        max = Math.max(max, left + right);

        return Math.max(left, right);
    }
}
