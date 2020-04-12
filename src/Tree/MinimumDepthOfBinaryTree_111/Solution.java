package Tree.MinimumDepthOfBinaryTree_111;

import Utils.TreeNode;

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
