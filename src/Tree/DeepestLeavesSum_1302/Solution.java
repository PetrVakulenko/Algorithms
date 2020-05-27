package Tree.DeepestLeavesSum_1302;

import Utils.TreeNode;

/**
 1302. Deepest Leaves Sum

 Given a binary tree, return the sum of values of its deepest leaves.

 Example 1:
 Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
 Output: 15

 Constraints:
 The number of nodes in the tree is between 1 and 10^4.
 The value of nodes is between 1 and 100.
 */

public class Solution {
    int maxDeep = 0;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        helper(root, 1);

        return sum;
    }

    private void helper(TreeNode root, int deep) {
        if (root == null) return;

        if (deep > maxDeep) {
            maxDeep = deep;
            sum = root.val;
        } else if (deep == maxDeep) {
            sum += root.val;
        }

        helper(root.left, deep+1);
        helper(root.right, deep+1);
    }
}
