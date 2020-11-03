package Tree.MinimumDepthOfBinaryTree_111;

import Utils.TreeNode;

/**
 111. Minimum Depth of Binary Tree

 Given a binary tree, find its minimum depth.
 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 Note: A leaf is a node with no children.

 Example 1:
 Input: root = [3,9,20,null,null,15,7]
 Output: 2

 Example 2:
 Input: root = [2,null,3,null,4,null,5,null,6]
 Output: 5

 Constraints:
 The number of nodes in the tree is in the range [0, 105].
 -1000 <= Node.val <= 1000
 */
public class Solution {
    int minDepth = 0;

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        checkMinDepth(root, 1);

        return minDepth;
    }

    private void checkMinDepth(TreeNode root, int depth)
    {
        if (root.left == null && root.right == null) {
            if (minDepth == 0) {
                minDepth = depth;
            } else {
                minDepth = Math.min(minDepth, depth);
            }
        }

        if (root.left != null) {
            checkMinDepth(root.left, depth+1);
        }

        if (root.right != null) {
            checkMinDepth(root.right, depth+1);
        }
    }
}
