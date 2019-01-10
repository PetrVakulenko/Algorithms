package Tree.BinaryTreePruning_814;

import Utils.TreeNode;

/**
 814. Binary Tree Pruning
 https://leetcode.com/problems/binary-tree-pruning/

 We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)

 Example 1:
 Input: [1,null,0,0,1]
 Output: [1,null,0,null,1]

 Explanation:
 Only the red nodes satisfy the property "every subtree not containing a 1".
 The diagram on the right represents the answer.

 Example 1:
 Input:
   1
  / \
 1  1
   / \
  1  0
 Output: [3, 14.5, 11]
   1
  / \
 1  1
   /
  1

 Note:
 The binary tree will have at most 100 nodes.
 The value of each node will only be 0 or 1.
 */

public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return root;

        root.left = pruneTree(root.left);

        root.right = pruneTree(root.right);

        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }
}
