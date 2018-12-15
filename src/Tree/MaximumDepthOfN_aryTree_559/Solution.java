package Tree.MaximumDepthOfN_aryTree_559;

import Utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 559. Maximum Depth of N-ary Tree
 https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/

 Given a n-ary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 For example, given a 3-ary tree:

 Input:
       1
     / | \
    3  2  4
   / \
  5   6

 We should return its max depth, which is 3.

 Note:
 The depth of the tree is at most 1000.
 The total number of nodes is at most 5000.
 */

public class Solution {
    int maxDepth = 0;

    public int maxDepth(Node root) {
        if (root == null) return 0;

        findMaxDepth(root, 1);

        return maxDepth;
    }

    private void findMaxDepth(Node root, int currentDepth)
    {
        if (currentDepth > maxDepth) maxDepth = currentDepth;

        for (Node child: root.children) {
            findMaxDepth(child, currentDepth+1);
        }
    }
}
