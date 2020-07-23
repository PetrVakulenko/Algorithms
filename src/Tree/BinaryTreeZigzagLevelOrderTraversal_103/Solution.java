package Tree.BinaryTreeZigzagLevelOrderTraversal_103;

import Utils.TreeNode;
import java.util.*;

/**
 103. Binary Tree Zigzag Level Order Traversal

 Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 For example:
 Given binary tree [3,9,20,null,null,15,7],
   3
  / \
 9  20
   /  \
 15   7
 return its zigzag level order traversal as:
 [
 [3],
 [20,9],
 [15,7]
 ]
 */

public class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap();

    int maxDepth = -1;

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        treeTraversal(root, 0);

        List<List<Integer>> res = new ArrayList();

        for (int i = 0; i <= maxDepth; i++) {
            if (i % 2 == 0 && i > 0) {
                Collections.reverse(map.get(i));
            }

            res.add(map.get(i));
        }

        return res;
    }

    private void treeTraversal(TreeNode root, int depth)
    {
        if (root == null) {
            return;
        }

        if (depth > maxDepth) {
            maxDepth = depth;
        }

        List<Integer> tmp = map.getOrDefault(depth, new ArrayList());
        tmp.add(root.val);

        map.put(depth, tmp);

        treeTraversal(root.right, depth + 1);
        treeTraversal(root.left, depth + 1);
    }
}
