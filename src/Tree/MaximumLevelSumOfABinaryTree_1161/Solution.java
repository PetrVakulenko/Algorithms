package Tree.MaximumLevelSumOfABinaryTree_1161;

import Utils.TreeNode;

/**
 1161. Maximum Level Sum of a Binary Tree

 Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.
 Return the smallest level X such that the sum of all the values of nodes at level X is maximal.

 Example 1:
 Input: [1,7,0,7,-8,null,null]
 Output: 2

 Explanation:
 Level 1 sum = 1.
 Level 2 sum = 7 + 0 = 7.
 Level 3 sum = 7 + -8 = -1.
 So we return the level with the maximum sum which is level 2.

 Note:
 The number of nodes in the given tree is between 1 and 10^4.
 -10^5 <= node.val <= 10^5
 */

public class Solution {
    private int maxDepth = 0;

    public int maxLevelSum(TreeNode root) {
        int[] sums = new int[10001];

        calculateSums(root, 0, sums);

        int depth = 0, max = root.val;

        for (int i = 1; i < maxDepth; i++) {
            if (sums[i] > max) {
                max = sums[i];
                depth = i;
            }
        }

        return depth + 1;
    }

    public void calculateSums(TreeNode root, int depth, int[] sums) {
        if (root == null) return;

        sums[depth] += root.val;

        if (depth > maxDepth) {
            maxDepth = depth;
        }

        calculateSums(root.left, depth+1, sums);
        calculateSums(root.right, depth+1, sums);
    }
}
