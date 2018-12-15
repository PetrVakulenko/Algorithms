package Tree.MaximumDepthOfBinaryTree_104;

import Utils.Node;
import Utils.TreeNode;

/**
 104. Maximum Depth of Binary Tree
 https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

 Given a binary tree, find its maximum depth.
 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 Note: A leaf is a node with no children.

 Example:
 Given binary tree [3,9,20,null,null,15,7],

      4
    /   \
   2     7
  / \
 1   3

 return its depth = 3.
 */

public class Solution {
    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        findMaxDepth(root, 1);

        return maxDepth;
    }

    private void findMaxDepth(TreeNode root, int currentDepth)
    {
        if (currentDepth > maxDepth) maxDepth = currentDepth;

        if (root.left != null) {
            findMaxDepth(root.left, currentDepth + 1);
        }

        if (root.right != null) {
            findMaxDepth(root.right, currentDepth + 1);
        }
    }
}
