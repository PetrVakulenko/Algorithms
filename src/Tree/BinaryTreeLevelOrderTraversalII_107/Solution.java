package Tree.BinaryTreeLevelOrderTraversalII_107;

import Utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 107. Binary Tree Level Order Traversal II

 Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree [3,9,20,null,null,15,7],

   3
  / \
 9  20
   /  \
 15   7
 return its bottom-up level order traversal as:
 [
     [15,7],
     [9,20],
     [3]
 ]
 */

public class Solution {
    HashMap<Integer, List<Integer>> map = new HashMap();

    int maxDepth = 0;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList();

        addTreeNodeToMap(root, 1);

        for (int i = maxDepth; i >= 1; i--) {
            result.add(map.get(i));
        }

        return result;
    }

    private void addTreeNodeToMap(TreeNode root, int depth)
    {
        if (root == null) return;

        addTreeNodeToMap(root.left, depth + 1);
        addTreeNodeToMap(root.right, depth + 1);

        List<Integer> tmp = map.getOrDefault(depth, new ArrayList<Integer>());
        tmp.add(root.val);

        maxDepth = Math.max(maxDepth, depth);

        map.put(depth, tmp);
    }
}
