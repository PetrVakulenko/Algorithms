package Tree.InvertBinaryTree_226;

import Utils.TreeNode;

/**
 226. Invert Binary Tree
 https://leetcode.com/problems/invert-binary-tree/description/

 Invert a binary tree.

 Example:

 Input:
      4
    /   \
   2     7
  / \   / \
 1   3 6   9

 Output:
     4
    /   \
   7     2
  / \   / \
 9   6 3   1

 Trivia:
 This problem was inspired by this original tweet by Max Howell:

 Google: 90% of our engineers use the software you wrote (Homebrew),
    but you can’t invert a binary tree on a whiteboard so f*** off.
 */

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return null;
        }

        TreeNode newNode = new TreeNode(-1);
        if(t1 == null) {
            newNode.val = t2.val;
            newNode.left = mergeTrees(null, t2.left);
            newNode.right = mergeTrees(null, t2.right);
        } else if(t2 == null) {
            newNode.val = t1.val;
            newNode.left = mergeTrees(t1.left, null);
            newNode.right = mergeTrees(t1.right, null);
        } else {
            newNode.val = t1.val + t2.val;
            newNode.left = mergeTrees(t1.left, t2.left);
            newNode.right = mergeTrees(t1.right, t2.right);
        }

        return newNode;
    }
}
