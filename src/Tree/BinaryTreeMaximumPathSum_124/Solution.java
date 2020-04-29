package Tree.BinaryTreeMaximumPathSum_124;

import Utils.TreeNode;

/**
 124. Binary Tree Maximum Path Sum

 Given a non-empty binary tree, find the maximum path sum.
 For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along
   the parent-child connections. The path must contain at least one node and does not need to go through the root.

 Example 1:
 Input: [1,2,3]

   1
  / \
 2  3

 Output: 6

 Example 2:
 Input: [-10,9,20,null,null,15,7]

    -10
    / \
   9  20
  / \
 15 7

 Output: 42
 */

public class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sumHelper(root);
        return maxSum;
    }

    private int sumHelper(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftSum = Math.max(sumHelper(root.left), 0);
        int rightSum = Math.max(sumHelper(root.right), 0);
        int sum = root.val + leftSum + rightSum;
        maxSum = Math.max(maxSum, sum);

        return root.val + Math.max(leftSum, rightSum);
    }
}
